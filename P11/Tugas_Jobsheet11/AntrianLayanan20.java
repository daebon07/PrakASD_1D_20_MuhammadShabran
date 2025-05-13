package P11.Tugas_Jobsheet11;

public class AntrianLayanan20 {
    Mahasiswa20[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan20(int max) {
        this.max = max;
        this.data = new Mahasiswa20[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty20() {
        return size == 0;
    }

    public boolean isFull20() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa20 mhs) {
        if (isFull20()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa20 layaniMahasiswa20() {
        if (isEmpty20()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa20 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatTerdepan20() {
        if (isEmpty20()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            data[front].tampilkanData20();
        }
    }

    public void tampilkanSemua20() {
        if (isEmpty20()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData20();
        }
    }

    public void lihatAkhir20() {
        if (isEmpty20()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa di posisi belakang: ");
            data[rear].tampilkanData20();
        }
    }

    public int getJumlahAntrian20() {
        return size;
    }

    public void kosongkanAntrian20() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
    
}
