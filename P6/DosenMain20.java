package P6;

import java.util.Scanner;

public class DosenMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen20 data = new DataDosen20();
        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutkan Data (ASC: Muda ke Tua)");
            System.out.println("4. Urutkan Data (DSC: Tua ke Muda)");
            System.out.println("5. Cari Dosen (Nama) - Sequential Search");
            System.out.println("6. Cari Dosen (Usia) - Binary Search");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            if (pilihan == 1) {  
                System.out.print("Kode: ");
                String kode = sc.nextLine();
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("Jenis Kelamin (Pria/Wanita): ");
                String jenisKelaminStr = sc.nextLine().toLowerCase();
                boolean jenisKelamin = jenisKelaminStr.equals("pria");
                System.out.print("Usia: ");
                int usia = sc.nextInt();

                data.tambah(new Dosen20(kode, nama, jenisKelamin, usia));

            } else if (pilihan == 2) {  
                data.tampil();

            } else if (pilihan == 3) {  
                data.sortingASC();
                System.out.println("Data telah diurutkan dari usia muda ke tua.");
                data.tampil();

            } else if (pilihan == 4) {  
                data.sortingDSC();
                System.out.println("Data telah diurutkan dari usia tua ke muda.");
                data.tampil();

            } else if (pilihan == 5) {  
                System.out.print("Masukkan nama dosen yang dicari: ");
                String namaCari = sc.nextLine();
                int hasilSeq = data.sequentialSearching(namaCari);
                data.tampilPosisi(namaCari, hasilSeq);
                data.tampilDataSearch(namaCari, hasilSeq);

            } else if (pilihan == 6) {  
                System.out.print("Masukkan usia dosen yang dicari: ");
                int usiaCari = sc.nextInt();
                int hasilBin = data.binarySearch(usiaCari, 0, data.idx - 1);
                data.tampilPosisi(String.valueOf(usiaCari), hasilBin);
                data.tampilDataSearch(String.valueOf(usiaCari), hasilBin);

            } else if (pilihan == 7) {  
                System.out.println("Keluar dari program...");

            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi!");
            }

        } while (pilihan != 7);

        sc.close();
    }
}
