package P13;
import java.util.Scanner;

public class FilmDLLMain20 {
    public static void main(String[] args)  throws Exception {
        Scanner scanner = new Scanner(System.in);
        FilmDLL20 filmList = new FilmDLL20();

        while (true) {
            System.out.println("\nDATA FILM LAYAR LEBAR");
            System.out.println("=======================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.print("Masukkan pilihan (1-10): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Masukkan ID Film: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Masukkan Judul Film: ");
                String title = scanner.nextLine();
                System.out.print("Masukkan Rating Film: ");
                double rating = scanner.nextDouble();
                filmList.addFirst20(id, title, rating);
                System.out.println("Data berhasil ditambahkan!");

            } else if (choice == 2) {
                System.out.print("Masukkan ID Film: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan Judul Film: ");
                String title = scanner.nextLine();
                System.out.print("Masukkan Rating Film: ");
                double rating = scanner.nextDouble();
                filmList.addLast20(id, title, rating);
                System.out.println("Data berhasil ditambahkan!");

            } else if (choice == 3) {
                System.out.print("Masukkan ID Film: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan Judul Film: ");
                String title = scanner.nextLine();
                System.out.print("Masukkan Rating Film: ");
                double rating = scanner.nextDouble();
                System.out.print("Masukkan Index: ");
                int index = scanner.nextInt();
                try {
                    filmList.add20(id, title, rating, index);
                    System.out.println("Data berhasil ditambahkan!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } else if (choice == 4) {
                try {
                    filmList.removeFirst20();
                    System.out.println("Data pertama berhasil dihapus!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } else if (choice == 5) {
                try {
                    filmList.removeLast20();
                    System.out.println("Data terakhir berhasil dihapus!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } else if (choice == 6) {
                System.out.print("Masukkan Index untuk dihapus: ");
                int index = scanner.nextInt();
                try {
                    filmList.remove20(index);
                    System.out.println("Data berhasil dihapus!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } else if (choice == 7) {
                filmList.print20();

            } else if (choice == 8) {
                System.out.print("Masukkan ID Film yang dicari: ");
                int id = scanner.nextInt();
                try {
                    int filmId = filmList.get20(id);
                    System.out.println("ID Film: " + filmId);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } else if (choice == 9) {
                filmList.sortByRatingDesc20();
                System.out.println("Data telah diurutkan berdasarkan rating secara DESC!");

            } else if (choice == 10) {
                System.out.println("Keluar...");
                break;
            }
        }
        scanner.close();
    }
}
