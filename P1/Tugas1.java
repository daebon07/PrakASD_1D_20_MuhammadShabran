package P1;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        char KODE [] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String KOTA [][] = {{"BANTEN"},{"JAKARTA"},{"BANDUNG"},{"CIREBON"},{"BOGOR"},{"PEKALONGAN"},{"SEMARANG"},{"SURABAYA"},{"MALANG"},{"TEGAL"}};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char kodeplat = scanner.next().charAt(0);
        scanner.close();

        boolean carikode = false;

        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodeplat) {
                System.out.println("Kota: " + KOTA[i][0]);
                carikode = true;
                break;
            }
        }

        if (!carikode) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
