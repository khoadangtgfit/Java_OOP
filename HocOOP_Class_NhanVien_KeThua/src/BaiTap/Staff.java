/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import BaiTap.StaffMemBer;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Staff {
    private ArrayList<StaffMemBer> stafflist;
    public void addStaff(StaffMemBer sm)
    {
        stafflist.add(sm);
    }

    public ArrayList<StaffMemBer> getStafflist() {
        return stafflist;
    }

    public void setStafflist(ArrayList<StaffMemBer> stafflist) {
        this.stafflist = stafflist;
    }

    public Staff() {
        stafflist =new ArrayList<StaffMemBer>();
    }
    
    public void payDay()
    {
        for(StaffMemBer sm:stafflist)
        {
            System.out.println(sm.toString());
        }
    }
}
