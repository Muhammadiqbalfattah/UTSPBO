package NomorDua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
    private double beratbadan;

    public double getBeratbadan() {
        return beratbadan;
    }

    public void setBeratbadan(double beratbadan) {
        this.beratbadan = beratbadan;
    }
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    private double bmi;

    public double getBmi() {
        bmi = (tinggi * tinggi)/beratbadan ;
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMI x = new BMI();
        DecimalFormat dc = new DecimalFormat();

        System.out.println(" --------------------------- ");
        System.out.println("          Program BMI        ");
        System.out.println(" --------------------------- ");
        System.out.print(" Masukkan Berat Badan :  ");
        x.beratbadan = sc.nextDouble();
        System.out.print(" Masukkan Tinggi Badan (M):  ");
        x.tinggi = sc.nextDouble();
        System.out.println(" --------------------------- ");

        System.out.println(" BMI : " + dc.format(x.getBmi()));
        System.out.print(" Kategori : " );
        if (x.bmi >= 18.5 && x.bmi <= 29.5) {
            System.out.println("Kamu Ideal");
        } else if (x.bmi >=  29.5) {
            System.out.println("Kamu OverWeight");
        } else {
            System.out.println("Kamu Underweight");
        }

        //Program dengan cara biasa
        double berat,tinggi,bmi;
        System.out.println(" ------------------------ ");
        System.out.print(" Masukkan berat badan :  ");
        berat  = sc.nextDouble();
        System.out.print(" Masukkan Tinggi :  ");
        tinggi = sc.nextDouble();
        bmi = berat / (tinggi * tinggi);
        System.out.println(" BMI : " + bmi);
        System.out.print("Kategori : " );
        if (bmi >= 18.5 && bmi <= 29.5) {
            System.out.println("Kamu Ideal");
        } else if (bmi >=  29.5) {
            System.out.println("Kamu OverWeight");
        } else {
            System.out.println("Kamu Underweight");
        }
    }
}
