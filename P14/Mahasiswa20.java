package P14;

public class Mahasiswa20 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa20(){
    }

    public Mahasiswa20(String nim, String nama, String kelas, double ipk){
        this.nim=nim;
        this.nama=nama;
        this. kelas=kelas;
        this.ipk=ipk;
    }

    public void tampilInformasi20(){
        System.out.println("NIM: "+this.nim+" "+
        "Nama: "+this.nama+" "+
        "Kelas: "+" "+
        "IPK: "+this.ipk);
    }
}
