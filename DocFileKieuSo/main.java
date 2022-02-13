/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocFileKieuSo;

/**
 *
 * @author Administrator
 */
public class main {
    public static void main(String[] args) {
        int a[]=new int[100];
        boolean kq=TetFile.luufile(a, "D:/Test.txt");
        a=TetFile.XuatFile("D:/test.txt");
        
    }
}
