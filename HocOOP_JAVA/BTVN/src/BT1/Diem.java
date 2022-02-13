/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Administrator
 */
public class Diem {
    private int x,y;

    public Diem() {
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
    public double TinhKhoangCach(Diem d2)
    {
        return Math.sqrt(Math.pow(x, d2.x)+Math.pow(y, d2.y));
    }
    public Diem TimDiemDXQuaOX()
    {
        Diem dx=new Diem();
        dx.x=x;
        dx.y=y*-1;
        return this;
    }
    public Diem TimDiemDXQuaOY()
    {
        Diem dx=new Diem();
        dx.x=x*-1;
        dx.y=y;
        return this;
    }
}
