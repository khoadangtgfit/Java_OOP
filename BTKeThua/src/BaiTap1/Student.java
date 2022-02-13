/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Administrator
 */
public class Student extends Person{
    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Student(String name,int age,String address,double gpa) {
        super(name, address, age);
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("GPA: "+gpa);//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
