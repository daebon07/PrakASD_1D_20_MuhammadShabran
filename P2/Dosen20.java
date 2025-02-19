package P2;

public class Dosen20 {
    String id,nama,Keahlian;
    boolean status;
    int tahungabung;
    
    public Dosen20() {
   
    }

    public Dosen20(String id, String nm, boolean sttus, int tahun, String ahli) {
        this.id = id;
        nama = nm;
        status = sttus;
        tahungabung = tahun;
        Keahlian = ahli;
    }

    public void tampilkanInformasi() {
        System.out.println("ID Dosen: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (status ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahungabung);
        System.out.println("Bidang Keahlian: " + Keahlian);
        System.out.println();
    }

    public void statusaktif(boolean status) {
        this.status = status;
    }

    public int MasaKerja(int thnini) {
        return thnini - this.tahungabung;
    }

    public void Keahlianbaru(String bidang) {
        Keahlian = bidang;
    }
    
}
