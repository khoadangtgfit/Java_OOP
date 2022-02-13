/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhapLai;

import DocFileKieuChuoi.Test_File;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class TestFile {
    public static void main(String[] args) {
        ArrayList<String>dsData =new ArrayList<>();
        dsData.add("tao lao");
        dsData.add("tao lao");
        dsData.add("tao lao");
        dsData.add("tao lao");
        dsData.add("tao lao");
        dsData.add("tao lao");
        if(Test_Fle.luufile(dsData, "D:/Test.txt")){
            System.out.println("Luu file thanh cong");
        }
        else {
            System.out.println("That bai");
        }
        ArrayList<String> dsData2=new ArrayList<>();
        dsData2=Test_Fle.XuatFile("D:/Test.txt");
        for(String b:dsData2){
            System.out.println(b);
        }
        
    }
}
