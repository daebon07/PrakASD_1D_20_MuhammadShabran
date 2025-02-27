package P3;

import java.util.Scanner;

public class DosenDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine(); 

        Dosen20[] daftarDosen = new Dosen20[jumlahDosen];


        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("Pria");

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); 

            daftarDosen[i] = new Dosen20(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------");
        }

        DataDosen20.dataSemuaDosen(daftarDosen);
        DataDosen20.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen20.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen20.infoDosenPalingTua(daftarDosen);
        DataDosen20.infoDosenPalingMuda(daftarDosen);

        sc.close();
    }
    
}
