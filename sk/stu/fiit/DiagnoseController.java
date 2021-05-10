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
    
    private String formatSize(long size){
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
        File file = new File(dir);
        long size = file.length();
        return formatSize(size);
    }
    
    public String getJVMTotal(){
        Runtime runtime = Runtime.getRuntime();
        long size = runtime.totalMemory();
        return formatSize(size);
    }
    
    public String getJVMUsable(){
       long size = new File("c:").getUsableSpace();
        return formatSize(size); 
    }
    
    public String getJVMFree(){
        Runtime runtime = Runtime.getRuntime();
        long size = runtime.freeMemory();
        return formatSize(size);
    }
}
