package P2;

public class MahasiswaMain20 {
    public static void main(String[] args) {
        Mahasiswa20 mhs1 = new Mahasiswa20 ();
       mhs1.nama= "Muhammad Ali Farhan";
       mhs1.nim= "2241720171";
       mhs1.kelas= "SI 2J";
       mhs1.ipk=3.55;

       mhs1.tampilkanInformasi();
       mhs1.ubahkelas("S1 2K");
       mhs1.updateIpk(3.60);
       mhs1.tampilkanInformasi();
    }
    
}
