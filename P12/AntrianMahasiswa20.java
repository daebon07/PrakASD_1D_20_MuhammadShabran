package P12;

public class AntrianMahasiswa20 {
    private Node20 front, rear;
    private int size;
    private final int MAX_SIZE;

    public AntrianMahasiswa20(int kapasitas) {
        front = rear = null;
        size = 0;
        MAX_SIZE = kapasitas;
    }

    public boolean isEmpty20() {
        return front == null;
    }

    public boolean isFull20() {
        return size == MAX_SIZE;
    }

    public void enqueue20(String nama) {
        if (isFull20()) {
            System.out.println("Antrian sudah penuh, tidak dapat menambah antrian.");
            return;
        }
        Node20 newNode = new Node20(nama);
        if (rear == null) { 
            front = rear = newNode;
        } else {
            rear.next = newNode; 
            rear = newNode;
        }
        size++;
        System.out.println(nama + " telah ditambahkan ke antrian.");
    }


    public void dequeue20() {
        if (isEmpty20()) {
            System.out.println("Antrian kosong, tidak ada yang dapat diproses.");
            return;
        }
        System.out.println(front.nama + " telah dipanggil.");
        front = front.next;
        if (front == null) {
            rear = null; 
        }
        size--;
    }

    public void peekFront20() {
        if (isEmpty20()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan: " + front.nama);
        }
    }

    public void peekRear20() {
        if (isEmpty20()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir: " + rear.nama);
        }
    }

    public void displaySize20() {
        System.out.println("Jumlah mahasiswa yang mengantre: " + size);
    }

    // Menampilkan semua antrian yang ada
    public void displayQueue20() {
        if (isEmpty20()) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node20 current = front;
        System.out.println("Antrian saat ini:");
        while (current != null) {
            System.out.println(current.nama);
            current = current.next;
        }
    }

    public void clearQueue20() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
}
