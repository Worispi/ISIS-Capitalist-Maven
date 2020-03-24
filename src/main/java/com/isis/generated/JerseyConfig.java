/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isis.generated;

import javax.jws.WebService;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 *
 * @author remis
 */
@Component
@ApplicationPath("/isis")
public class JerseyConfig extends ResourceConfig {
    
    public JerseyConfig(){
        register(WebService.class);
        register(CORSResponseFilter.class);
    }
}
