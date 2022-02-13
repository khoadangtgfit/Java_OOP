/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocFileKieuChuoi;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Main_flie {
    public static void main(String[] args) {
           ArrayList<String> dsData =new ArrayList<>();
           dsData.add("khoa");
           dsData.add("tao lao");
           dsData.add("khoda");
           dsData.add("tadso lao");
           dsData.add("khodsa");
           dsData.add("taodsd lao");
           dsData.add("khodsa");
           dsData.add("taods lao");
           boolean kq=Test_File.luufile(dsData,"D:/Test.txt");
           if(kq==true){
               System.out.println("Lua file thanh cong!");
           }
           else if(kq==false){
               System.out.println("Luu file that bai!");
           }
           ArrayList<String> dsData2 =new ArrayList<>();
    }
    
}
