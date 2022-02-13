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
public class Executive extends Employee{
    private double bonus;
    public void awardBonus(double bonus)
    {
        this.bonus=bonus;
        System.out.println("Nhan thuong "+bonus);
    }

    @Override
    public double pay() {
        return super.pay()+bonus; //To change body of generated methods, choose Tools | Templates.
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
