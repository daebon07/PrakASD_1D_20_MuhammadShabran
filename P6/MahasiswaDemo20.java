package P6;
import java.util.Scanner;
public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20 (jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Kelas: ");
            String kelas = scanner.nextLine();
            System.out.print("IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); // Membuang newline

            Mahasiswa20 m = new Mahasiswa20(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubblesort();
        list.tampil();

        scanner.close();
    }
}
