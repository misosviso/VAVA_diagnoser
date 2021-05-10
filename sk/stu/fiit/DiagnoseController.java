/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.io.File;

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
        File file = new File(dir);
        long size = file.length();
        return SizeFormatter.formatSize(size);
    }
    
    public String getJVMTotal(){
        Runtime runtime = Runtime.getRuntime();
        long size = runtime.totalMemory();
        return SizeFormatter.formatSize(size);
    }
    
    public String getJVMUsable(){
       long size = new File("c:").getUsableSpace();
        return SizeFormatter.formatSize(size);
    }
    
    public String getJVMFree(){
        Runtime runtime = Runtime.getRuntime();
        long size = runtime.freeMemory();
        return SizeFormatter.formatSize(size);
    }
}
