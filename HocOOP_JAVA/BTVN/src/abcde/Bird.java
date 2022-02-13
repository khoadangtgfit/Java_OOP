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
public class Bird {
    protected static int referneceCount=0;
    public Bird(){
        referneceCount++;
    }
    protected void fly(){
        System.out.println("bird");
        
    }
    static int getRefCount(){
        return referneceCount;
    }
    
}
