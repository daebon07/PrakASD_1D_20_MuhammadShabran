package P2;

public class MatakuliahMain20 {
    public static void main(String[] args) {
        Matakuliah20 Matkul1 = new Matakuliah20();
        Matkul1.tampilkanInformasi();

        Matakuliah20 Matkul2 = new Matakuliah20("ALSD_TI", "Algoritma dan Struktur Data", 2, 4);
        Matkul2.tampilkanInformasi();

        Matkul2.ubahjumlahSKS(4);
        Matkul2.tambahjumlahJam(2);
        Matkul2.kurangijumlahJam(3);
        Matkul2.tampilkanInformasi();
    }
}
