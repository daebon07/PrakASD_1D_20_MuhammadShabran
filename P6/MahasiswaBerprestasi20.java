package P6;

public class MahasiswaBerprestasi20 {
    Mahasiswa20[] listmhs;
    int idx;

    // Konstruktor baru untuk ukuran dinamis
    public MahasiswaBerprestasi20(int jumlah) {
        listmhs = new Mahasiswa20[jumlah];
        idx = 0;
    }

    void tambah(Mahasiswa20 m) {
        if (idx < listmhs.length) {
            listmhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa20 m : listmhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("----------------------------");
            }
        }
    }

    void bubblesort() {
        for (int i = 0; i < listmhs.length - 1; i++) {
            for (int j = 1; j < listmhs.length - i; j++) {
                if (listmhs[j].ipk > listmhs[j - 1].ipk) {
                    Mahasiswa20 tmp = listmhs[j];
                    listmhs[j] = listmhs[j - 1];
                    listmhs[j - 1] = tmp;
                }
            }
        }
    }
}
