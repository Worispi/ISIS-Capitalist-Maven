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
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author remis
 */
public class Services {
    
    InputStream input = getClass().getClassLoader().getResourceAsStream("world.xml");
        
    public World readWorldFromXml(String username) throws JAXBException {
        
        try{
            File file = new File(username+"-"+"world.xml");
            JAXBContext cont= JAXBContext.newInstance(World.class);
            Unmarshaller u = cont.createUnmarshaller();
            World world= (World) u.unmarshal(file);
        
            return world;
        }
        catch (Exception e){
            
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
}
