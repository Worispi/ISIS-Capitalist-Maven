/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isis.generated;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author remis
 */

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;

@Path("generic")
public class Webservice {
    Services services;
    public Webservice(){
        services =new Services();
    }
    
    @GET
    @Path("world")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})    
    public Response getXml(@Context HttpServletRequest request) throws JAXBException{
        String username;
        username = request.getHeader("X-user");
        return Response.ok(services.readWorldFromXml(username)).build();
    }

    @PUT
    @Path("product")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response editProduct(String data) throws JAXBException, FileNotFoundException, IOException{
        ProductType product = new Gson().fromJson(data, ProductType.class);
        return Response.ok(services.updateProduct(data, product)).build();
    }

    @PUT
    @Path("manager")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response editManager(String data) throws JAXBException, FileNotFoundException{
        PallierType manager = new Gson().fromJson(data, PallierType.class);
        //return Response.ok(services.updateManager(data, manager)).build();
    }
    
    @PUT
    @Path("upgrade")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void editUpgrade(@FormParam("data")String data, @FormParam("username")String username) throws JAXBException, FileNotFoundException{
        PallierType upgrade = new Gson().fromJson(data, PallierType.class);
        services.updateUpgrade(username, upgrade);
    }

    @PUT
    @Path("angelupgrade")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void editAngelUpgrade(@FormParam("data")String data, @FormParam("username")String username) throws JAXBException, FileNotFoundException{
        PallierType upgrade = new Gson().fromJson(data, PallierType.class);
        services.updateUpgrade(username, upgrade);
    }
    
    @DELETE
    @Path("world")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void resetWorld(@FormParam("username")String username) throws FileNotFoundException, JAXBException{
        World w = services.readWorldFromXml(username);
        double scoreToKeep = w.getScore();
        double totalangels = w.getTotalangels();
        double activeangels = 150 * Math.sqrt(w.getScore()/Math.pow(10, 15))-totalangels;   
        JAXBContext jaxbContext;

        InputStream input = getClass().getClassLoader().getResourceAsStream("world.xml");
        jaxbContext = JAXBContext.newInstance(World.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        World newWorld = (World) jaxbUnmarshaller.unmarshal(input);
        newWorld.setScore(scoreToKeep);
        newWorld.setTotalangels(totalangels + activeangels);
        newWorld.setActiveangels(activeangels);
        services.saveWordlToXml(newWorld, username);
    }
}