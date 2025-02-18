package P1;
import java.util.Scanner;
public class Tugas2 {
    public static int opsiperhitungan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" perhitungan yang ingin anda lakukan:");
        System.out.println("1. Menghitung Volume Kubus");
        System.out.println("2. Menghitung Luas Permukaan Kubus");
        System.out.println("3. Menghitung Keliling Kubus");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihanperhitungan = scanner.nextInt();
        return pilihanperhitungan;
    }

   
    public static double MenghitungVolumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }

    
    public static double MenghitungLuasPermukaanKubus(double sisi) {
        return 6 * (sisi * sisi);
    }

   
    public static double MenghitungKelilingKubus(double sisi) {
        return 12 * sisi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sisi;

        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = scanner.nextDouble();

        int pilihanperhitungan = opsiperhitungan();

        switch (pilihanperhitungan) {
            case 1:
                System.out.println("Volume Kubus: " + MenghitungVolumeKubus(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus: " + MenghitungLuasPermukaanKubus(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus: " + MenghitungKelilingKubus(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
    
}
