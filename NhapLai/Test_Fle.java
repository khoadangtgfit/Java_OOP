/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhapLai;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class Test_Fle {
    public static boolean luufile(ArrayList<String> dsData,String path){
        try {
            FileOutputStream fos=new FileOutputStream(path);
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(osw);
            for(String a:dsData){
                bw.write(a);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static ArrayList<String> XuatFile(String path){
        ArrayList<String> dsData=new ArrayList<>();
        try {
            FileInputStream fis=new FileInputStream(path);
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader br=new BufferedReader(isr);
            String t=br.readLine();
            while(t!=null){
                dsData.add(t);
                t=br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsData;
    }
    public int SapXep(ArrayList<String> dsData){
        Collections.sort(dsData, new Comparator<>(){
           public int compare(String p1,String p2){
               if(p1.compareTo(p2)>0){
                   return 1;
               }
               else return -1;
           }
        });
        return 0;
    }
}
