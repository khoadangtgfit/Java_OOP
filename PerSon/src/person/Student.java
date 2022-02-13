/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Student extends PerSon  {
    String rollNo;
    float mark;
    String email;

    public Student() {
    }

    @Override
    public void input() {
        super.input(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sinh vien:");
        while(true){
            String rollNoInput=sc.nextLine();
            boolean check=setRollNo(rollNoInput);
            if(check)
                break;
        }
        System.out.println("Nhap vao diem sinh vien:");
        while(true){
            float markInput=Float.parseFloat(sc.nextLine());
            boolean check=setMark(markInput);
            if(check)
                break;
        }
        while(true){
          String email=sc.nextLine();
          boolean check=setEmail(email);
            if(check)
                break;
        }
    }
    
    public Student(String rollNo, float mark, String email) {
        this.rollNo = rollNo;
        this.mark = mark;
        this.email = email;
    }

    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if(rollNo.length()==8&&rollNo!=null){
            this.rollNo = rollNo;
            return true;
        }
        else{
            System.err.println("Nhap lai ma sinh vien");
            return false;
        }
    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if(mark>=0&&mark<=10){
            this.mark = mark;
            return true;
        }
        else{
            System.err.println("Nhap lai diem");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email!=null&&email.contains("@")&&!email.contains(" "))
        {
            this.email = email;
            return true;
        }
        else{
            System.out.println("Nhap lai email");
            return false;
        }
       
    }
    public boolean checkScholarShip()
    {
        if(mark>=8)
            return true;
        return false;
    }
    @Override
    public String toString() {
        return "Student{" +super.toString()+ "rollNo=" + rollNo + ", mark=" + mark + ", email=" + email + '}';
    }
    
}
