/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author PC
 */
public class bai7 {
    public static void main(String []args)
    {
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=9;j++)
            {
                System.out.print(""+j+"x"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
