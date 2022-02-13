/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
  public class man {
      private static int x=100;
      public static void main(String[] args) {
          man hs1=new man();
          hs1.x++;
          man hs2=new man();
          hs2.x++;
          hs1=new man();
          hs1.x++;
          man.x++;
          System.out.println("x="+x);
          
      }
     
}
