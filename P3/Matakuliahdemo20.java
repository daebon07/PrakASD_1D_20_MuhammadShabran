package P3;

import java.util.Scanner;

public class Matakuliahdemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah20[] arrayOfMatakuliah20 = new Matakuliah20[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahMatakuliah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah20[i] = new Matakuliah20();
            arrayOfMatakuliah20[i].tambahData();
        }

        for(int i=0; i < jumlahMatakuliah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah20[i].cetakInfo();
            

        }
    }
    
}
