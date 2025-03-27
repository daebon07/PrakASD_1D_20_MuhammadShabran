package P6;

public class MahasiswaBerprestasi20 {
    Mahasiswa20 [] listmhs= new Mahasiswa20[5];
    int idx;

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listmhs.length; j++){
            if (listmhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos != -1){
            System.out.println("data mahasiswa dengan IPK :" + x + " ditemukan pada indeks " + pos);
        }
        else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos != -1){
            System.out.println("nim\t : " + listmhs[pos].nim);
            System.out.println("nama\t : " + listmhs[pos].nama);
            System.out.println("kelas\t : " + listmhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }


    void tambah (Mahasiswa20 m){
        if (idx<listmhs.length){
            listmhs[idx]=m;
            idx++;
    }else{
        System.out.println("data sudah penuh");
    }
    }
    void tampil(){
        for (Mahasiswa20 m:listmhs){
            m.tampilInformasi();
            System.out.println("-------------------------------");
        }
    }

    void bubblesort(){
        for (int i=0; i<listmhs.length-1; i++){
            for (int j=1; j<listmhs.length-i;j++){
                if(listmhs[j].ipk>listmhs[j-1].ipk){
                    Mahasiswa20 tmp = listmhs[j];
                    listmhs[j]= listmhs[j-1];
                    listmhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listmhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listmhs.length; j++) {
                if (listmhs[j].ipk < listmhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa20 tmp = listmhs[idxMin];
            listmhs[idxMin] = listmhs[i];
            listmhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listmhs.length; i++) {
            Mahasiswa20 temp = listmhs[i];
            int j = i;
            while (j > 0 && listmhs[j - 1].ipk < temp.ipk) {
                listmhs[j] = listmhs[j - 1];
                j--;
            }
            listmhs[j] = temp;
        }
    
    
    

}
}