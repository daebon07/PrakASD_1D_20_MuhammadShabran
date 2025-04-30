package P10;

import java.util.Scanner;

public class suratdemo20 {
    public static void main(String[] args) {
        Stacksurat20 stack = new Stacksurat20 (5);
        Scanner sc = new Scanner(System.in);
        

        int pilih;
        do {
            System.out.println("\n=== Menu Pengajuan Surat Izin ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin (berdasarkan nama mahasiswa)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat     : ");
                    String id = sc.nextLine();
                    System.out.print("Nama         : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas        : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    stack.push20(new surat20(id, nama, kelas, jenis, durasi));
                    break;

                case 2:
                    surat20 diproses = stack.pop20();
                    if (diproses != null) {
                        System.out.println("Surat diproses:");
                        diproses.tampilkanInfo20();
                    }
                    break;

                case 3:
                    surat20 terakhir = stack.peek20();
                    if (terakhir != null) {
                        System.out.println("Surat Terakhir:");
                        terakhir.tampilkanInfo20();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    stack.carisurat20(cariNama);
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih >= 1 && pilih <= 5);
    }
}