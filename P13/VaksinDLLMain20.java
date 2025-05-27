package P13;
import java.util.Scanner;

public class VaksinDLLMain20 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        VaksinDLL20 queue = new VaksinDLL20();

        while (true) {
            System.out.println("\nPENGANTRI VAKSIN ");
            System.out.println("=========================");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantre Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Masukkan Nomor Antrean: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Masukkan Nama Penerima: ");
                String name = scanner.nextLine();
                queue.addLast20(id, name);
                System.out.println("Data berhasil ditambahkan!");

            } else if (choice == 2) {
                if (!queue.isEmpty20()) {
                    System.out.println("Data telah divaksin: " + queue.getFirst20());
                    queue.removeFirst20();
                } else {
                    System.out.println("Antrean kosong!");
                }

            } else if (choice == 3) {
                System.out.println("\nDaftar Penerima Vaksin:");
                queue.print20();
                System.out.println("Sisa Antrean: " + queue.size20());

            } else if (choice == 4) {
                System.out.println("Keluar...");
                break;
            }
        }
        scanner.close();
    }
}

