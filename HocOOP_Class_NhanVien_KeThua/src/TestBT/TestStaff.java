/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestBT;
import BaiTap.Staff;
import BaiTap.Employee;
/**
 *
 * @author Administrator
 */
public class TestStaff {
    public static void main(String []args)
    {
        
         Staff st=new Staff();
        Employee teo=new Employee();
        teo.setName("khoa");
        teo.setAddress("quan 1");
        teo.setPhone("123");
        teo.setPayRate(0.23);
        teo.setSocialSecurity("tao");
        st.addStaff(teo);
    }
   
            
}
