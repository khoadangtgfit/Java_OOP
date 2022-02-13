/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author PC
 */
public class DemoCOODINATE {
     public static void main(String []args)
    {
        COODINATE d1=new COODINATE(1,6);
        COODINATE d2=d1.TimDiemDoiXung();
        d1.output();
        d2.output();
        COODINATE d3=d1.TongHaiDiem(d2);
        d3.output();
    }
}
