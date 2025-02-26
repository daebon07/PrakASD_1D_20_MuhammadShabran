package P3;

public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Mahasiswa20[] arrayOfMahasiswa20 = new Mahasiswa20[3];
        arrayOfMahasiswa20 [0] = new Mahasiswa20();
        arrayOfMahasiswa20 [0].nim = "244107060033";
        arrayOfMahasiswa20 [0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa20 [0].kelas = "SIB-1E";
        arrayOfMahasiswa20 [0].ipk = (float) 3.75;

        arrayOfMahasiswa20 [1] = new Mahasiswa20();
        arrayOfMahasiswa20 [1].nim = "2341720172";
        arrayOfMahasiswa20 [1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa20 [1].kelas = "TI-2A";
        arrayOfMahasiswa20 [1].ipk = (float) 3.36;

        arrayOfMahasiswa20 [2] = new Mahasiswa20();
        arrayOfMahasiswa20 [2].nim = "244107023006";
        arrayOfMahasiswa20 [2].nama = "DIRHAMAN PUTRANTO";
        arrayOfMahasiswa20 [2].kelas = "TI-2E";
        arrayOfMahasiswa20 [2].ipk = (float) 3.80;

        System.out.println("NIM     :" + arrayOfMahasiswa20[0].nim);
        System.out.println("Nama    :" + arrayOfMahasiswa20[0].nama);
        System.out.println("kelas   :" + arrayOfMahasiswa20[0].kelas);
        System.out.println("IPK     :" + arrayOfMahasiswa20[0].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM     :" + arrayOfMahasiswa20[1].nim);
        System.out.println("Nama    :" + arrayOfMahasiswa20[1].nama);
        System.out.println("kelas   :" + arrayOfMahasiswa20[1].kelas);
        System.out.println("IPK     :" + arrayOfMahasiswa20[1].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM     :" + arrayOfMahasiswa20[2].nim);
        System.out.println("Nama    :" + arrayOfMahasiswa20[2].nama);
        System.out.println("kelas   :" + arrayOfMahasiswa20[2].kelas);
        System.out.println("IPK     :" + arrayOfMahasiswa20[2].ipk);
        System.out.println("--------------------------------------");
    }
}
