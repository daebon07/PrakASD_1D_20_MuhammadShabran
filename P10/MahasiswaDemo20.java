package P10;

import java.util.Scanner;

public class MahasiswaDemo20 {
    public static void main(String[] args) {
        StackTugasMahasiswa20 stack = new StackTugasMahasiswa20(5);
        Scanner scan = new Scanner(System.in);
        int pilih;
        do{
            System.out.println("\nmenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih){
            case 1:
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                System.out.print("NIM: ");
                String nim = scan.nextLine();
                System.out.print("Nama: ");
                String kelas = scan.nextLine();
                Mahasiswa20 mhs = new Mahasiswa20 (nama, nim, kelas);
                stack.push20(mhs);
                System.out.printf("Tugas %s berhasil dikumpulkan", mhs.nama);
                break;
            case 2:
                Mahasiswa20 dinilai = stack.pop20();
                if (dinilai != null){
                    System.out.println("Menilai tugas dari" + dinilai.nama);
                    System.out.print("Masukan nilai (0-100): ");
                    int nilai = scan.nextInt();
                    dinilai.tugasDinilai20(nilai);
                    System.out.printf(" Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                }
                break;
            case 3:
                Mahasiswa20 lihat = stack.peek20();
                if (lihat !=null ){
                    System.out.println("Tugas terakhir dikumpulkan oleh "+ lihat.nama);
                }
                break;
            case 4:
                System.out.println("Daftar semua tugas");
                System.out.println(" Nama\tNIM\tKelas");
                stack.print20();
                break;
            default :
                System.out.println("pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
