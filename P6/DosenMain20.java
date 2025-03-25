package P6;

import java.util.Scanner;

public class DosenMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen20 data = new DataDosen20();
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampil data dosen");
            System.out.println("3. Sorting ASC (usia muda ke tua)");
            System.out.println("4. Sorting DSC (usia tua ke muda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            if (pilihan == 1) {
                System.out.print("Kode: ");
                String kode = sc.nextLine();
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("Jenis Kelamin (Laki laki/Perempuan): ");
                String jenisKelaminStr = sc.nextLine().toLowerCase();
                boolean jk = jenisKelaminStr.equals("Laki laki");
                System.out.print("Usia: ");
                int usia = sc.nextInt();
                data.tambah(new Dosen20(kode, nama, jk, usia));
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
                System.out.println("Keluar dari program.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
    
}
