/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TestSo {
    public static boolean isNumeric(String str) { 
    try {  
      Double.parseDouble(str);  
      return true;
    } catch(NumberFormatException e){  
      return false;  
    }  
}
    public static void main(String[] args) {
     int number;
    Scanner sc=new Scanner(System.in);
    String t="";
    t=sc.nextLine();
    if(isNumeric(t))
    {
        number=Integer.parseInt(t);
        System.out.println(number+10);
    }
    else{
        System.out.println("Ko phai so");
    }
}
}
