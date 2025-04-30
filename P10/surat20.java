package P10;

public class surat20 {
    String idsurat20;
    String Namaamahasiswa;
    String kelas;
    char jenisizin;
    int durasi;
    
    surat20(String idsurat20, String Namaamahasiswa, String kelas ,char jenisizin ,int durasi){
        this.idsurat20=idsurat20;
        this.Namaamahasiswa =Namaamahasiswa;
        this.kelas= kelas;
        this.jenisizin= jenisizin;
       this.durasi=durasi;

    }

    public void tampilkanInfo20() {
        System.out.println("ID surat20     : " + idsurat20);
        System.out.println("Nama         : " + Namaamahasiswa);
        System.out.println("Kelas        : " + kelas);
        System.out.println("Jenis Izin   : " + (jenisizin == 'S' ? "Sakit" : "Izin"));
        System.out.println("Durasi (hari): " + durasi);
        System.out.println("---------------------------------");
    }
}