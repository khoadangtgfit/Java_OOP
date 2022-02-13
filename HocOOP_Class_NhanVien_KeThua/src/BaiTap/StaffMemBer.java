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
public abstract class StaffMemBer {
    protected String name,address,phone;

    public String getNameString() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setNameString(String nameString) {
        this.name = nameString;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public abstract double pay();
    public String toString()
    {
        return this.name+"-"+this.address+"-"+this.phone;
    }
}
