package P14;

public class Binarytreearray20 {
     Mahasiswa20[] dataMahasiswa;
    int idxLast;

    public Binarytreearray20() {
        this.dataMahasiswa = new Mahasiswa20[10];
    }

    void populateData20(Mahasiswa20 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder20(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder20(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi20();
                traverseInOrder20(2*idxStart+2);
            }
        }
    }
    
}
