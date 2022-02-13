/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TestPerSon {
    public static void main(String[] args) {
        ArrayList<PerSon> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int chon;
        do {            
            showMenu();
            do {                
                System.out.println("Moi chon:");
                chon=sc.nextInt();
            } while (chon<0||chon>3);
            if(chon == 1)
            {
                PerSon b=new Student();
                b.input();
                arr.add(b);
            }
            else if(chon == 2)
            {
                for(int i=0;i<arr.size();i++)
                {
                    System.out.println(arr.get(i).toString());
                }
            }
            else if(chon == 3)
            {
                for(int i=0;i<arr.size();i++)
                {
                    Student a=(Student)(arr.get(i));
                    if(a.getMark()==0)
                        System.out.println(arr.get(i).toString());
                }
            }
        } while (chon!=0);
        
    }
    static void showMenu()
    {
        System.out.println("1.Nhap vao N sinh vien");
        System.out.println("2.Hien thi thong tin sinh vien");
        System.out.println("3.Hien thi max va min theo diem trung binh");
        System.out.println("4.Tim kiem theo ma sinh vien");
        System.out.println("5. Sort A-Z theo ten sinh vien & hien thi");
        System.out.println("6.Hien thi sv duoc hoc bong & sort mark");
        System.out.println("7.Thoat");
    }
}
