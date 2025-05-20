package P12;

public class Main20 {
    public static void main(String[] args) {
        AntrianMahasiswa20 queue = new AntrianMahasiswa20(5);

        queue.enqueue20("Mahasiswa A");
        queue.enqueue20("Mahasiswa B");
        queue.enqueue20("Mahasiswa C");

        queue.peekFront20();
        queue.peekRear20();

        queue.displaySize20();

        queue.displayQueue20();

        queue.dequeue20();

        queue.displayQueue20();
        queue.peekFront20();
        queue.peekRear20();

        queue.clearQueue20();

        queue.displayQueue20();
    }
}