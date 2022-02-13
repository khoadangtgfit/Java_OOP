/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class testDate {
    public static void main(String []args) throws ParseException
    {
     Scanner sc=new Scanner(System.in);
     Date now=new Date();
     long nowin=now.getTime();
        System.out.println(nowin);
    }
   
}
