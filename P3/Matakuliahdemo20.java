package P3;

import java.util.Scanner;

public class Matakuliahdemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah20[] arrayOfMatakuliah20 = new Matakuliah20[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfMatakuliah20[i] = new Matakuliah20(kode, nama, sks, jumlahJam);
        }
        for(int i=0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMatakuliah20[i].kode);
            System.out.println("Nama        : " + arrayOfMatakuliah20[i].nama);
            System.out.println("Sks         : " + arrayOfMatakuliah20[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMatakuliah20[i].jumlahjam);
            System.out.println("------------------------------");

        }
    }
    
}
