/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IsisCapitalist.IsisCapitalist.generated;

import java.io.FileOutputStream;
import java.io.InputStream;

/**
 *
 * @author remis
 */
public class Services {
    
    public World readWorldFromXml() {
        InputStream input=getClass().getClassLoader().getResourceAsStream("world.xml");
        return.this;
    }
    
    public void saveWordlToXml(World world) {
        OutputStreamoutput = new FileOutputStream(file);
    }
}
