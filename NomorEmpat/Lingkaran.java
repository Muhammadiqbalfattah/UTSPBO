package NomorEmpat;

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lingkaran {

    private double r;
    private final double PHI= 3.14;

    public Lingkaran(){
        this.r = 0;
    }
    public Lingkaran(double jari){
        this.r = jari;
    }
    public void setR(double jari) {
        this.r = jari;
    }
    public double getR(){
        return this.r;
    }
    //MENGHITUNG LUAS
    public double luas(){
        return this.PHI * Math.pow(this.r,2);
    }
    //MENGHITUNG KELILING
    public double keliling(){
        return 2 * this.PHI * Math.pow(this.r,2);
    }

    public static void main(String[] args) {

        Lingkaran lkr = new Lingkaran ();
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat();
        System.out.println(" ------------------------------------- ");
        System.out.println("   Program Menghitung Luas Lingkaran   ");
        System.out.println(" ------------------------------------- ");
        System.out.print(" Masukkan jari-jari : " );
        lkr.r = sc.nextDouble();
        System.out.println(" ------------------------------------- ");
        System.out.println(" Luas Lingkaran  = " + dc.format(lkr.luas()) + "CM");
        System.out.println(" Keliling Lingkaran = " + dc.format(lkr.keliling()) + "CM");
        System.out.println(" ------------------------------------- ");


    }
}
