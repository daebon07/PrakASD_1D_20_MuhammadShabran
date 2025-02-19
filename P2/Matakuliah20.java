package P2;

public class Matakuliah20 {
    
    String kMatkul;
    String nama;
    int sks;
    int jmlhJam;

    
    public Matakuliah20() {
       
    }

    public Matakuliah20(String kode, String nm, int sks, int jmlJam) {
        kMatkul = kode;
        nama = nm;
        this.sks = sks;
        jmlhJam = jmlJam;
    }

    public void tampilkanInformasi() {
        System.out.println("Kode Matkul   : " + kMatkul);
        System.out.println("Nama Matkul   : " + nama);
        System.out.println("SKS       : " + sks);
        System.out.println("Jumlah Jam: " + jmlhJam);
        System.out.println();
    }

    
    public void ubahjumlahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS : " + sksBaru);
    }

    
    public void tambahjumlahJam(int jam) {
        this.jmlhJam += jam;
        System.out.println(jam + " jumlah jam : " + jmlhJam);
    }

    
    public void kurangijumlahJam(int jam) {
        if (jmlhJam >= jam) {
            jmlhJam -= jam;
            System.out.println(jam + "  jumlah jam : " + jmlhJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan.");
        }
    }
}
