package NomorSatu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pulsa {

private int awal;
private int akhir;

private int harga;

public int getHarga() {
        harga = (PULSA * (awal-akhir)) * 150;
        return harga;
        }

public void setHarga(int harga) {
        this.harga = harga;

        }

public int getAwal() {
        return awal;
        }

public void setAwal(int awal) {
        this.awal = awal;
        }

public int getAkhir() {
        return akhir;
        }

public void setAkhir(int akhir) {
        this.akhir = akhir;
        }

public int getPULSA() {
        return PULSA;
        }

private final int PULSA = 5;

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pulsa akhir = new Pulsa();
        DecimalFormat dc = new DecimalFormat();
        System.out.println("---------------------------------------------");
        System.out.println("               TOTAL TAGIHAN                 ");
        System.out.println("---------------------------------------------");
        System.out.print(" Awal Mula (JJMMDD) : ");
        akhir.awal = sc.nextInt();
        System.out.print(" Akhir (JJMMDD) : ");
        akhir.akhir = sc.nextInt();
        akhir.harga = ((akhir.PULSA* (akhir.akhir - akhir.awal )) * 15)/10;
        System.out.println(" Tagihan yang harus dibayarkan : RP." + dc.format(akhir.harga));
        System.out.println("---------------------------------------------");
        System.out.println(" Terima kasih telah menggunakan layananan kami ! ");


        }
        }
