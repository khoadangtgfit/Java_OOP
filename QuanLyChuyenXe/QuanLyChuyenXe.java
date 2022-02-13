
//  Họ và tên: Đặng Phước Khoa
 // Lớp:19DTHE1
 //MSSV:1911066165
package Tuan4;

/**
 *
 * @author Administrator
 */
public class QuanLyChuyenXe {
    private ChuyenXe a[];
    private int slcx;

    public QuanLyChuyenXe() {
        slcx=0;
        a=new ChuyenXe[100]; //cấp phát bộ nhớ cho mảng
    }

    public QuanLyChuyenXe(ChuyenXe[] a, int slcx) {
        this.a = a;
        this.slcx = slcx;
    }
    public void Nhap1ChuyenXeNoiThanh()
    {
        if(a.length<slcx)
            System.err.println("Qua so luong cho phep!"); 
        else
        {
            ChuyenXeNT b=new ChuyenXeNT();
            b.Nhap();
            a[slcx]=b;
            slcx++;
        }
    }
    public void Nhap1ChuyenXeNgoaiThanh()
    {
        if(a.length<slcx)
            System.err.println("Qua so luong cho phep!");
        else
        {
            ChuyenXeNgT b=new ChuyenXeNgT();
            b.Nhap();
            a[slcx]=b;
            slcx++;
        }
    }
    public void XuatChuyenXeNT()
    {
        if(slcx==0)
            System.err.println("Danh sach rong");
        else{
        boolean flag=false;
        System.out.println("Thong tin cac chuyen xe noi thanh:");
        for(int i=0;i<slcx;i++)
        {
            if(a[i] instanceof ChuyenXeNT){ // kiểm tra chuyến xe thứ i có phải nội thành ko
                System.out.println(a[i].toString());//nếu có thì xuất ra
                System.out.println("");
                flag=true;
            }
        }
        if(flag == false)
        {
            System.err.println("Khong co chuyen xe noi thanh nao trong danh sach");
        }
        }
    }
    public void XuatChuyenXeNgT()
    {
        
        if(slcx==0)
            System.err.println("Danh sach rong");
        else{
        boolean flag=false;
        System.out.println("Thong tin cac chuyen xe ngoai thanh:");
        for(int i=0;i<slcx;i++)
        {
            if(a[i] instanceof ChuyenXeNgT){  // kiểm tra chuyến xe thứ i có phải ngoại thành ko
                System.out.println(a[i].toString()); //nếu có thì xuất ra
                System.out.println("");
                flag=true;
            }
        }
        if(flag==false)
        {
            System.err.println("Khong co chuyen xe ngoai thanh nao trong danh sach");
        }
        }
    }
    public void Xoa1ChuyenXe(String ma)
    {
        int vt=0;
        boolean flag=false;
        for(int i=0;i<slcx;i++)
        {
            if(a[i].getMaSoChuyen().equals(ma))
            {
                vt=i;                           //Tìm vị trí chuyến xe có mã truyền vào
                flag=true;  // dùng cờ hiệu để ra hiệu mã chuyến xe có tồn tại trong danh sách
                break;    // thoát ra khỏi vòng for ngay khi đã tìm được vị trí chuyễn xe
            }
        }
        if(flag==true)
        {
            for(int i=vt;i<slcx;i++)
            {
                a[i]=a[i+1];  //xóa phần tử trong mảng bằng cách dời mảng sang trái 1 đơn vị
            }
            slcx--;
            System.out.println("Da xoa 1 chuyen xe co ma "+ma); 
        }
        else{
            System.err.println("Khong tim thay chuyen xe nao co ma "+ma);
        }
    }
    public void SuaThongTin1ChuyenXeNoiThanh(String ma)
    {
        boolean flag=false;
        for(int i=0;i<slcx;i++)
        {
            if((a[i].getMaSoChuyen().equals(ma))&&(a[i] instanceof ChuyenXeNT))
            {
                System.out.println("Da tim thay chuyen xe noi thanh co ma "+ma+" trong danh sach");
                System.out.println("Moi ban nhap thong tin can sua:");
                ChuyenXeNT b=new ChuyenXeNT();
                b.Nhap();
                a[i]=b;
                flag=true;
            }
        }
        if(flag == false)
        {
            System.out.println("Khong tim thay chuyen xe noi thanh nao co ma "+ma+" trong danh sach");
        }
    }
    public void SuaThongTin1ChuyenXeNgoaiThanh(String ma)
    {
        boolean flag=false;
        for(int i=0;i<slcx;i++)
        {
            if((a[i].getMaSoChuyen().equals(ma))&&(a[i] instanceof ChuyenXeNgT))
            {
                System.out.println("Da tim thay chuyen xe ngoai thanh co ma "+ma+" trong danh sach");
                System.out.println("Moi ban nhap thong tin can sua:");
                ChuyenXeNgT b=new ChuyenXeNgT();
                b.Nhap();
                a[i]=b;
                flag=true;
            }
        }
        if(flag == false)
        {
            System.out.println("Khong tim thay chuyen xe ngoai thanh nao co ma "+ma+" trong danh sach");
        }
    }
    public void TimKiem(String ma)
    {
        boolean flag=false;
        for(int i=0;i<slcx;i++)
        {
            if(a[i].getMaSoChuyen().equals(ma))
            {
                System.out.println("co ma r");
                a[i].toString();
                System.out.println("");
                flag=true;
                
            }
        }
        if(flag==false)
            System.err.println("Khong co chuyen xe nao co ma "+ma+"trong danh sach");
    }
}
