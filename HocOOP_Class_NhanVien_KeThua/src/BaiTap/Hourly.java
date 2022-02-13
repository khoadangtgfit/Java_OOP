/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

/**
 *
 * @author Administrator
 */
public class Hourly extends Employee{
    private int hourWork;
    public void addHours(int hour)
    {
        this.hourWork=hour;
    }
    public double pay()
    {
        return this.hourWork*50;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
