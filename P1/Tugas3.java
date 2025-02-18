package P1;

import java.util.Scanner;

public class Tugas3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] matkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

       
        for (int i = 0; i < n; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            matkul[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah ");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    seluruhjadwalmatkul(matkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String hari = scanner.nextLine();
                    menampilkanjadwalkuliahsesuaihari(matkul, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int sem = scanner.nextInt();
                    menampilkanjadwalkuliahsesuaisemester(matkul, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String nama = scanner.nextLine();
                    mencarimatakuliahberdasarkannama(matkul, sks, semester, hariKuliah, nama);
                    break;
                case 5:
                    System.out.println("Keluar program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    
    public static void seluruhjadwalmatkul(String[] matkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nSeluruh Jadwal Kuliah:");
        for (int i = 0; i < matkul.length; i++) {
            System.out.println(matkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - Hari " + hariKuliah[i]);
        }
    }

    
    public static void menampilkanjadwalkuliahsesuaihari(String[] matkul, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah Hari " + hari + ":");
        boolean cari = false;
        for (int i = 0; i < matkul.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(matkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i]);
                cari = true;
            }
        }
        if (!cari) {
            System.out.println("Tidak ada jadwal kuliah di hari " + hari);
        }
    }

    
    public static void menampilkanjadwalkuliahsesuaisemester(String[] matkul, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\nJadwal Kuliah Semester " + sem + ":");
        boolean cari = false;
        for (int i = 0; i < matkul.length; i++) {
            if (semester[i] == sem) {
                System.out.println(matkul[i] + " - " + sks[i] + " SKS - Hari " + hariKuliah[i]);
                cari = true;
            }
        }
        if (!cari) {
            System.out.println("Tidak ada jadwal kuliah di semester " + sem);
        }
    }

    
    public static void mencarimatakuliahberdasarkannama(String[] matkul, int[] sks, int[] semester, String[] hariKuliah, String nama) {
        System.out.println("\nHasil Pencarian Mata Kuliah: " + nama);
        boolean cari = false;
        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i].equalsIgnoreCase(nama)) {
                System.out.println(matkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - Hari " + hariKuliah[i]);
                cari = true;
                break;
            }
        }
        if (!cari) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
    
}
