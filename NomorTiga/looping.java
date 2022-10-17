package NomorTiga;

import java.util.Scanner;

public class looping {

    private int loop;

    public int getLoop() {
        return loop;
    }

    public void setLoop(int loop) {
        this.loop = loop;
    }

    public int getTotal() {
        total = loop;
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int total;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        looping lp = new looping();
        boolean x = true;
        for (lp.loop = 0; lp.loop < 11; lp.loop++) {
            System.out.println("Masukkan INT : ");
            lp.loop = sc.nextInt();
            System.out.println("Total Angka : " + lp.total);

        }
    }


    }

