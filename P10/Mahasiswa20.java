package P10;

public class Mahasiswa20 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    Mahasiswa20 ( String nama, String nim, String kelas){
        this.nama=nama;
        this.nim=nim;
        this.kelas=kelas;
        nilai = -1;
    }

    void tugasDinilai20(int nilai){
        this.nilai= nilai;
    }
}
