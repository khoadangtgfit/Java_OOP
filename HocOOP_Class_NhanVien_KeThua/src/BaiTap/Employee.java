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
public class Employee extends StaffMemBer{
    protected  String socialSecurity;
    protected  double payRate;

    @Override
    public String toString() {
        return super.toString()+"-"+this.socialSecurity+"-"+payRate; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double pay() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 500;
    }

    public Employee() {
    }

    public Employee(String socialSecurity, double payRate) {
        this.socialSecurity = socialSecurity;
        this.payRate = payRate;
    }
    
    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

   
    
}
