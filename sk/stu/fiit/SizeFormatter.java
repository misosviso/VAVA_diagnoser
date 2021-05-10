/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class SizeFormatter {
    
    public static String formatSize(long size){
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
