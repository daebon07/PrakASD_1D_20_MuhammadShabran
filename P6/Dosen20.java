package P6;

public class Dosen20 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen20(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampil() {
        System.out.println("Kode : " + kode );
        System.out.println("Nama : " + nama );
        System.out.println("jenis kelamin : " + (jenisKelamin ? "Laki laki" : "Perempuan") );
        System.out.println("Usia : " + usia );
        System.out.println("-----------------------------------" );
    }
    
}
