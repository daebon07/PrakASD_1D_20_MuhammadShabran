package P12;

public class Mahasiswa20 {
    String nim;
    String nama;
    String kelas;
    Double ipk;

     public Mahasiswa20(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk=ipk;
    }

    public void tampilInformasi20() {
        System.out.println(nim + " - " + nama  + " - " + kelas + " - " + ipk);
    }
}
