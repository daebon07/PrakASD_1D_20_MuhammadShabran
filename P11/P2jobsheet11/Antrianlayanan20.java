package P11.P2jobsheet11;

public class Antrianlayanan20 {
    Mahasiswa20[] data;
    int front;
    int rear;
    int size;
    int max;

    public Antrianlayanan20 (int max) {
        this.max = max;
        this.data = new Mahasiswa20[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    public boolean IsEmpty20(){
        if ( size==0){
            return true;
        } else {
            return false;
        }
    }
    public boolean Isfull20(){
        if (size==max) {
            return true;
        }else{
            return false;
        }
    }
    public void lihatTerdepan20() {
        if (IsEmpty20()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData20();
        }
    }
    public void tampilkanSemua20() {
        if (IsEmpty20()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData20();
        }
    }
    public void tambahAntrian20(Mahasiswa20 mhs) {
        if (Isfull20()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }
    
    public Mahasiswa20 layaniMahasiswa20() {
        if (IsEmpty20()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa20 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    public int getJumlahAntrian20() {
        return size;
    }
   
}
