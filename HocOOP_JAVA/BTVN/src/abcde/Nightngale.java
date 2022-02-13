/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcde;

/**
 *
 * @author Administrator
 */
public class Nightngale extends abcde.Bird{

    public Nightngale() {
        referneceCount++;
    }
    public static void main(String[] args) {
        System.out.println("Before: "+referneceCount);
        Nightngale a=new Nightngale();
        System.out.println("After: "+referneceCount);
        a.fly();
    }
}
