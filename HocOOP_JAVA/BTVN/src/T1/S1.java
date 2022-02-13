/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1;

/**
 *
 * @author Administrator
 */
public class S1 {
    public static void main(String[] args) {
        S1 a=new S1();
        S2 b=a.new S2();
        
    }

    public S1() {
        System.out.println("S1");
    }
    public class S2 extends S1{

        public S2() {
            System.out.println("S2");
        }
        
    }
}
