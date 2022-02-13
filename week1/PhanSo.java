/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PhanSo {

    private double TuSo;
    private double MauSo;

    public double getTuSo() {
        return TuSo;
    }

    public double getMauSo() {
        return MauSo;
    }

    public void setTuSo(double TuSo) {
        this.TuSo = TuSo;
    }

    public void setMauSo(double MauSo) {
        this.MauSo = MauSo;
    }

    public PhanSo(double TuSo, double MauSo) {
        this.TuSo = TuSo;
        this.MauSo = MauSo;
    }

    public PhanSo() {
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so:");
        TuSo = sc.nextDouble();
        System.out.println("Nhap mau so:");
        MauSo = sc.nextDouble();
    }

    public void output() {

        if (MauSo==1) {
            System.out.println(TuSo);
        }
        else if(MauSo==TuSo)
        {
            System.out.println(1);
        }
        else {
            System.out.println(TuSo + "/" + MauSo);
        }
    }

    public PhanSo RutGon() {
        double a, b;
        a = Math.abs(TuSo);
        b = Math.abs(MauSo);
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        TuSo /= a;
        MauSo /= a;
        return this;
    }

    public PhanSo Cong2PS(PhanSo ps2) {
        PhanSo kq = new PhanSo();
        kq.TuSo = TuSo * ps2.MauSo + MauSo * ps2.TuSo;
        kq.MauSo = MauSo * ps2.MauSo;
        return kq;
    }

    public PhanSo Tich2PS(PhanSo ps2) {
        PhanSo kq = new PhanSo();
        kq.TuSo = TuSo * ps2.TuSo;
        kq.MauSo = MauSo * ps2.MauSo;
        return kq;
    }

    public PhanSo ChuanHoa() {
        if (MauSo < 0 && TuSo < 0) {
            this.MauSo *= -1;
            this.TuSo *= -1;
        }
        if (MauSo < 0 && TuSo > 0) {
            this.MauSo *= -1;
            this.TuSo *= -1;
        }
        return this;
    }
}
