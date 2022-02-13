/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author PC
 */
public class COODINATE {
    private int hoanh;
    private int tung;
    
    public COODINATE()
    {
        this.hoanh=0;
        this.tung=0;
    }
    public COODINATE(int hoanh, int tung) {
        this.hoanh = hoanh;
        this.tung = tung;
    }

    public int getHoanh() {
        return hoanh;
    }

    public int getTung() {
        return tung;
    }
    
    public COODINATE TongHaiDiem(COODINATE p1)
    {
        COODINATE d=new COODINATE();
         d.hoanh=this.hoanh+p1.hoanh;
         d.tung=this.tung+p1.tung;
         return d;
    }
    public COODINATE TimDiemDoiXung()
    {
        COODINATE d1=new COODINATE();
        d1.tung=-this.tung;
        d1.hoanh=this.hoanh;
        return d1;
    }
    public void output()
    {
        System.out.println("("+hoanh+","+tung+")");
    }
}
