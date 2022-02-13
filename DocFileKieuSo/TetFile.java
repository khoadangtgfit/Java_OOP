/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocFileKieuSo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Administrator
 */
public class TetFile {
    public static boolean luufile(int a[],String path){
        try {
            FileOutputStream file =new FileOutputStream(path);
            for(int i=0;i<a.length;i++){
                file.write(a[i]);
            }
            file.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    public static int[] XuatFile(String path){
        int a[]=null;
        try {
            FileInputStream file =new FileInputStream(path);
            int c=file.read();
            int i=0;
            while(c!=-1){
                a[i]=c;
                c=file.read();
            }
            file.close();
        } catch (Exception e) {
        }
        
        return a;
    }
}
