/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IsisCapitalist.IsisCapitalist.generated;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
    
    public World readWorldFromXml() throws JAXBException {
        InputStream input=getClass().getClassLoader().getResourceAsStream("world.xml");
        
        JAXBContext cont= JAXBContext.newInstance(World.class);
        Unmarshaller u= cont.createUnmarshaller();
        World world= (World) u.unmarshal(new File("world.xml"));
        
        return world;
        }
    
    public void saveWordlToXml(World world) throws JAXBException {
        try {
            OutputStream output = new FileOutputStream("world.xml");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JAXBContext cont= JAXBContext.newInstance(World.class);
        Marshaller m = cont.createMarshaller();
        m.marshal(world, new File("world.xml"));
    }
}
