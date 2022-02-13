/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Administrator
 */
public class Entry {
    public static void main(String []args)
    {
        Student a=new Student("Dang phuoc khoa", 21, "Q.9", 12);
        a.display();
        System.out.println("");
        Teacher b=new Teacher("khoa", 23, "thi xa", 343);
        b.display();
        Person c=new Student("khoa", 3, "ko", 0);
    }
}
