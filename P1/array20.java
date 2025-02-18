package P1;

import java.util.Scanner;

public class array20 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================================");
        System.out.println(" Program Menghitung IP Semester");
        System.out.println("==========================================================");

        String [] mk = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };
        int jumlahmk = mk.length;

        double[][] nilai = new double[jumlahmk][3];
        String[] nilaiHuruf = new String[jumlahmk];

        int[] sks = {2, 3, 3, 4, 2, 3, 3, 3};

        double tnilai = 0, ips;
        int tsks = 0;


        for (int i = 0; i <jumlahmk; i ++){
            System.out.print(" Masukkan nilai Angka untuk MK " + mk[i] + " = ");
            nilai[i][0] = scanner.nextDouble();
        }

        for (int i = 0; i < jumlahmk; i ++){
            double angkaNilai = nilai[i][0];

            if (angkaNilai >= 80) {
                nilaiHuruf[i] = "A";
                nilai[i][1] = 4.0;
            } else if (angkaNilai >= 73) {
                nilaiHuruf[i] = "B+";
                nilai[i][1] = 3.5;
            } else if (angkaNilai >= 65) {
                nilaiHuruf[i] = "B";
                nilai[i][1] = 3.0;
            } else if (angkaNilai >= 60) {
                nilaiHuruf[i] = "C+";
                nilai[i][1] = 2.5;
            } else if (angkaNilai >= 50) {
                nilaiHuruf[i] = "C";
                nilai[i][1] = 2.0;
            } else if (angkaNilai >= 39) {
                nilaiHuruf[i] = "D";
                nilai[i][1] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilai[i][1] = 0.0;
            }

            nilai[i][2] = sks[i];

            tnilai += nilai[i][1] * sks[i];
            tsks += sks[i];
        }

        System.out.println("==========================================================");
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==========================================================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("==========================================================");

        for (int i = 0; i < jumlahmk; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", mk[i], nilai[i][0], nilaiHuruf[i], nilai[i][1]);
        }

        System.out.println("==========================================================");
        
        ips = tnilai / tsks;
        System.out.println(" IP : "  + ips);

        System.out.println("==========================================================");

        scanner.close();
    }
    
}
