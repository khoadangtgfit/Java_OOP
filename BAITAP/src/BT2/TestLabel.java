/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author Administrator
 */
public class TestLabel {
    public static void main(String[] args) {
        
        int n=6;
        search:
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==1){
                    System.out.println("khoa j="+j);
                    continue search;
                }
            }
        }
    }
}
