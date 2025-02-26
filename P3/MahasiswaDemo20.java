package P3;
import java.util.Scanner;
public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Mahasiswa20[] arrayOfMahasiswa20 = new Mahasiswa20[3];
        String dummy;

        for (int i=0; i <3; i++){
        arrayOfMahasiswa20 [i] = new Mahasiswa20();

        System.out.println("Masukan Data Mahasiswa ke-" + (i+1));
        System.out.print("NIM    :");
        arrayOfMahasiswa20 [i].nim = sc.nextLine();
        System.out.print("Nama   :");
        arrayOfMahasiswa20 [i].nama = sc.nextLine();
        System.out.print("Kelas  :");
        arrayOfMahasiswa20 [i].kelas =sc.nextLine();
        System.out.print("IPK    :");
        dummy = sc.nextLine();
        arrayOfMahasiswa20 [i].ipk = Float.parseFloat(dummy);
        System.out.println("--------------------------------------");
        }
        for (int i=0; i <3; i++){
        System.out.println("Data Mahasiswa ke-" + (i+1));
        System.out.println("NIM     :" + arrayOfMahasiswa20[i].nim);
        System.out.println("Nama    :" + arrayOfMahasiswa20[i].nama);
        System.out.println("kelas   :" + arrayOfMahasiswa20[i].kelas);
        System.out.println("IPK     :" + arrayOfMahasiswa20[i].ipk);
        System.out.println("--------------------------------------");
        }
    
    }
}
