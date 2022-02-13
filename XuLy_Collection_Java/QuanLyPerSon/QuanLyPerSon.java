//  Họ và tên: Đặng Phước Khoa
 // Lớp:19DTHE1
 //MSSV:1911066165
package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class QuanLyPerSon {
    public static ArrayList<ConNguoi> arr =new ArrayList<ConNguoi>();
    public void inti()
    {
        ConNguoi a=new SinhVien("12", 2, "a", "3");
        arr.add(a);
        ConNguoi b=new GiangVien(1, 2, "c", "4");
        arr.add(b);
        ConNguoi c=new NhanVien(1, "34", "b", "664");
        arr.add(c);
    }
    public void Menu()
    {
        int chon;
        do {            
            System.out.println("1.Nhap thong tin Sinh Vien");
            System.out.println("2.Nhap thong tin Giang Vien");
            System.out.println("3.Nhap thong tin Nhan Vien");
            System.out.println("4.Xuat Danh Sach");
            System.out.println("5.Xoa thong tin tat ca nguoi theo ten");
            System.out.println("6.Tim kiem thong tin tat ca nguoi theo ten");
            System.out.println("7.Sap xep danh sach theo bang chu cai ABC");
            System.out.println("0.Thoat");
            do {                
                System.out.println("Moi ban chon:");
                chon=new Scanner(System.in).nextInt();
                if(chon<0||chon>7)
                    System.err.println("Lua chon sai! moi chon lai!(0<=n<=7)");
            } while (chon<0||chon>7);
            switch(chon)
            {
                case 1: {
                    ConNguoi a=new SinhVien();
                    a.Nhap();
                    arr.add(a);
                    break;
                }
                case 2: {
                    ConNguoi a=new GiangVien();
                    a.Nhap();
                    arr.add(a);
                    break;
                }
                case 3:{
                    ConNguoi a=new NhanVien();
                    a.Nhap();
                    arr.add(a);
                    break;
                }
                case 4:{
                    for(int i=0;i<arr.size();i++)
                    {
                        if(arr.get(i) instanceof SinhVien)
                        {
                            System.out.println("Sinh Vien:");
                            System.out.println(arr.get(i).toString());
                        }
                        else if(arr.get(i) instanceof GiangVien)
                        {
                            System.out.println("Giang Vien:");
                            System.out.println(arr.get(i).toString());
                        }
                        else
                        {
                            System.out.println("Nhan Vien:");
                            System.out.println(arr.get(i).toString());
                        }
                    }
                    break;
                }
                case 5:{
                    String name;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Nhap ten Nguoi muon xoa:");
                    name=sc.nextLine();
                    int dem=0;
                    for(int i=0;i<arr.size();i++)
                    {
                        if(arr.get(i).getHoTen().equals(name))
                        {
                            arr.remove(i);
                            i--;
                            dem++;
                        }
                    }
                    if(dem>0)
                    {
                        System.out.println("Da xoa "+dem+" nguoi trong danh sach co ten "+name);
                    }
                    else
                    {
                        System.out.println("Khong co nguoi nao co ten "+name+" trong danh sach");
                    }
                    break;
                }
                case 6: {
                    String name;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Nhap ten Nguoi can tim:");
                    name=sc.nextLine();
                    boolean flag=false;
                    for(int i=0;i<arr.size();i++)
                    {
                        if(arr.get(i).getHoTen().equals(name))
                        {
                            System.out.println(arr.get(i).toString());
                            System.out.println("");
                            flag=true;
                        }
                    }
                    if(flag==false)
                    {
                        System.out.println("Khong co nguoi nao co ten "+name+" trong danh sach");
                    }
                    break;
                }
                case 7:{
                    arr.sort((p1,p2)->{
                        if(p1.getHoTen().compareTo(p2.getHoTen())>0)
                        {
                            return 1;
                        }
                        else 
                            return -1;
                    });
                    System.out.println("Da sap xep xong!");
                    break;
                }
            }
            
        } while (chon!=0);
    }
}
