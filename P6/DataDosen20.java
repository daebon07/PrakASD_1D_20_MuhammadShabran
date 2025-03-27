package P6;

public class DataDosen20 {
    Dosen20[] dataDosen = new Dosen20[10];
    int idx = 0;

    int sequentialSearching(String cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (dataDosen[j].nama.equalsIgnoreCase(cari)) { 
                posisi = j;
                break;
            }
        }
        return posisi;
    }


    int binarySearch(int usia, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
    
            if (dataDosen[mid].usia == usia) {
                return mid;
            } else if (dataDosen[mid].usia > usia) {
                return binarySearch(usia, left, mid - 1);
            } else {
                return binarySearch(usia, mid + 1, right);
            }
        }
        return -1;
    }


    void tampilPosisi(String nama, int pos) {
        if (pos != -1) {
            System.out.println("Dosen dengan nama \"" + nama + "\" ditemukan pada indeks " + pos);
        } else {
            System.out.println("Dosen dengan nama \"" + nama + "\" tidak ditemukan.");
        }
    }
    
    void tampilDataSearch(String nama, int pos) {
        if (pos != -1) {
            System.out.println("Kode\t: " + dataDosen[pos].kode);
            System.out.println("Nama\t: " + dataDosen[pos].nama);
            System.out.println("Jenis Kelamin\t: " + (dataDosen[pos].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia\t: " + dataDosen[pos].usia);
        } else {
            System.out.println("Dosen dengan nama \"" + nama + "\" tidak ditemukan.");
        }
    }

    void tambah(Dosen20 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen20 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }

    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen20 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}
