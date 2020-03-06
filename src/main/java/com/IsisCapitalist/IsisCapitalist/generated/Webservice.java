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

import java.awt.PageAttributes.MediaType;
import static javax.swing.text.html.FormSubmitEvent.MethodType.GET;

@Path("generic")
public class Webservice {
    Services services;
    public Webservice(){
        services =new Services();
    }
    
    @GET
    @Path("world")
    @Produces(MediaType.APPLICATION_XML)
    
    public Response getWorld(){
        return Response.ok(services.getWorld()).build();
    }
}
