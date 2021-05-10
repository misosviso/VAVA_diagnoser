/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.io.File;
import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class DiagnoseController {
    
    public String getOS(){
        String OS = System.getProperty("os.name");
        String version = System.getProperty("os.version");
        String architecture = System.getProperty("os.arch");
        return OS + ", " + version + ", " + architecture;
    }
    
    public String getUser(){
        return System.getProperty("user.name");
    }
    
    public String getJavaVersion(){
        return System.getProperty("java.runtime.version");
    }
    
    public String getDir(){
        return System.getProperty("user.dir");
    }
    
    public String getDirSize(){
        String dir = System.getProperty("user.dir");
        java.io.File file = new java.io.File(dir);
        long size = file.length();
        DecimalFormat df = new DecimalFormat("0.00");     
        float kBsize = (float)size / (float)1024;
        float MBsize = (float)kBsize / (float)1024;
        float GBsize = (float)MBsize / (float)1024;
        if(GBsize > 1){
            return df.format(GBsize) + "GB";
        } else if(MBsize > 1){
            return df.format(MBsize) + "MB";
        } else{
            return df.format(kBsize) + "kB";
        }
    }
}
