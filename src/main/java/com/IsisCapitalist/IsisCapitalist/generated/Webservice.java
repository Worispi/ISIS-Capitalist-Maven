/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IsisCapitalist.IsisCapitalist.generated;

/**
 *
 * @author remis
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("generic")
public class Webservice {
    Services services;
    public Webservice(){
        services =new Services();
    }
    
    @GET
    @Path("world")
    @Produces(MediaType.APPLICATION_XML)    
    public Response getWorld() throws Exception{
        return Response.ok(services.readWorldFromXml()).build();
    }
}
