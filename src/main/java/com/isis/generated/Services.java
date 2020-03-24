/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isis.generated;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author remis
 */
public class Services {
        
    public World readWorldFromXml(String username) throws JAXBException {
        
        InputStream input; 
        
        try{
            File file = new File(username+"-"+"world.xml");
            JAXBContext cont= JAXBContext.newInstance(World.class);
            Unmarshaller u = cont.createUnmarshaller();
            World world= (World) u.unmarshal(file);
        
            return world;
        }
        catch (Exception e){
            
            input = getClass().getClassLoader().getResourceAsStream("world.xml");
            JAXBContext cont= JAXBContext.newInstance(World.class);
            Unmarshaller u= cont.createUnmarshaller();
            World world= (World) u.unmarshal(input);
        
            return world;
        } 
    }
    
    public void saveWordlToXml(World world, String username) throws JAXBException, FileNotFoundException, IOException {

        OutputStream output = new FileOutputStream(username+"-"+"world.xml");
        
        JAXBContext cont= JAXBContext.newInstance(World.class);
        Marshaller m = cont.createMarshaller();
        m.marshal(world,output);
        output.close();
    }
    
     @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
     public World getWorld(String username) throws JAXBException, FileNotFoundException, IOException {
        World world = this.readWorldFromXml(username);
        for (ProductType prod : world.getProducts().getProduct()) {
            if (!prod.isManagerUnlocked()) {
                if (prod.getTimeleft() != 0) {
                    if (prod.getTimeleft() < (System.currentTimeMillis() - world.getLastupdate())) {
                        world.setScore(world.getScore() + prod.getRevenu());
                    } else {
                        prod.setTimeleft(prod.getTimeleft() - (System.currentTimeMillis() - world.getLastupdate()));
                    }
                }
            } else {
                long time = System.currentTimeMillis() - world.getLastupdate();
                long nb_prod = (time / prod.getVitesse());
                long time_left = (time % prod.getVitesse());
                world.setScore(world.getScore() + prod.getRevenu() * nb_prod);
                prod.setTimeleft(time_left);
            }
        }
        
        world.setLastupdate(System.currentTimeMillis());
        this.saveWordlToXml(world, username);
        return this.readWorldFromXml(username);
    }
    
    
    // prend en paramètre le pseudo du joueur et le produit 
    // sur lequel une action a eu lieu (lancement manuel de production ou 
    // achat d’une certaine quantité de produit) 
    // renvoie false si l’action n’a pas pu être traitée 
    public Boolean updateProduct(String username, ProductType newproduct) throws JAXBException, IOException { 
        // aller chercher le monde qui correspond au joueur 
        World world = getWorld(username); 
        // trouver dans ce monde, le produit équivalent à celui passé 
        // en paramètre 
        ProductType product = findProductById(world, newproduct.getId()); 
        if (product == null) { return false;} 
        // calculer la variation de quantité. Si elle est positive c'est 
        // que le joueur a acheté une certaine quantité de ce produit 
        // sinon c’est qu’il s’agit d’un lancement de production. 
        int qtchange = newproduct.getQuantite() - product.getQuantite(); 
        if (qtchange > 0) { 
            // soustraire de l'argent du joueur le cout de la quantité 
            // achetée et mettre à jour la quantité de product 
            double cout = (product.getCout() * (1 - Math.pow(product.getCroissance(), product.getQuantite()))) / (1 - product.getCroissance());
            world.setMoney(world.getMoney() - cout);
            product.setQuantite(product.getQuantite() + newproduct.getQuantite());
        } else { 
            // initialiser product.timeleft à product.vitesse 
            // pour lancer la production 
            product.setTimeleft(product.getVitesse());
            product.setQuantite(newproduct.getQuantite());
        } 
        // sauvegarder les changements du monde 
        saveWordlToXml(world, username); 
        
        return true; 
    }
    
     private ProductType findProductById(World world, int id) {
        ProductType product = null;
        for (ProductType p : world.getProducts().getProduct()) {
            if (p.getId() == id) {
                product = p;
            }
        }
        return product;

    }
    
     
     
}
