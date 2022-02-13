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
public class PerSon {
    String name;
    String gender,birthday,address;

    public PerSon() {
    }

    public PerSon(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten:");
        name=sc.nextLine();
        System.out.println("Nhap gioi tinh:");
        gender=sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        birthday=sc.nextLine();
        System.out.println("Nhap dia chi:");
        address=sc.nextLine();
    }

    @Override
    public String toString() {
        return "PerSon{" + "name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", address=" + address + '}';
    }
    
    
   
}
