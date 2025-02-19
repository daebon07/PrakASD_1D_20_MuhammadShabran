package P2;

public class DosenMain20 {
    public static void main(String[] args) {
        
        Dosen20 d1 = new Dosen20();
        d1.tampilkanInformasi();
        
        Dosen20 d2 = new Dosen20("MMH", "Mamluatul Hani'ah, S.Kom., M.Kom", true, 2020, "Internet of Things ");
        d2.tampilkanInformasi();
        
        d2.statusaktif(false);
        System.out.println("status diubah:");
        d2.tampilkanInformasi();
        
        int masaKerja = d2.MasaKerja(2024);
        System.out.println("Masa kerja Dosen adalah : " + masaKerja + " tahun");
        
        d2.Keahlianbaru("Cloud Computing");
        System.out.println("bidang keahlian diubah:");
        d2.tampilkanInformasi();
    }
    
}
