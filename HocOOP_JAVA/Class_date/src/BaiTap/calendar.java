/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Administrator
 */
public class calendar {
    public static void main(String[] args) {
           Calendar a=Calendar.getInstance();
           Date t=a.getTime();
           SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
           System.out.println(df.format(t));
           int year=a.get(Calendar.YEAR);
           System.out.println(year);
    }
}
