/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author Administrator
 */
public class NVPV extends NhanVien{

    public NVPV() {
    }

    public NVPV(String MaNV, String TenNV, String TrinhDo, Double LuongCB) {
        super(MaNV, TenNV, TrinhDo, LuongCB);
    }
    
    
    @Override
    public void Nhap() {
        super.Nhap(); 
    }

    @Override
    public String toString() {
        return super.toString()+ ",Luong="+TinhLuong();
    }
    @Override
    double TinhLuong() {
        return super.LuongCB;
    }
    
}
