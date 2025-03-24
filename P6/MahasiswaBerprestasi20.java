package P6;

public class MahasiswaBerprestasi20 {
    Mahasiswa20 [] listmhs= new Mahasiswa20[5];
    int idx;

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
}
