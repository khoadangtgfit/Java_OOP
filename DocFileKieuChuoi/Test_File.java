/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocFileKieuChuoi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Test_File {
    public static boolean luufile(ArrayList<String> dsData,String path){
        try {
            FileOutputStream file=new FileOutputStream(path);
            OutputStreamWriter osw=new OutputStreamWriter(file);
            BufferedWriter bw=new BufferedWriter(osw);
            for(String data:dsData){
                bw.write(data);
                bw.newLine();
            }
            bw.close(); 
            osw.close();
           file.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static ArrayList<String>DocFile(String path){
        ArrayList<String>dsData=new ArrayList<>();
        try {
            FileInputStream fis=new FileInputStream(path);
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader br =new BufferedReader(isr);
            String line=br.readLine();
            while(line!=null){
                if(line.length()>0)
                    dsData.add(line);
                    line=br.readLine();
            }
            br.close();
            isr.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsData;
    } 
}
