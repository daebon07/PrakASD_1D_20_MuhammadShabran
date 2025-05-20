package P12;

public class SLLmain20 {
    public static void main(String[] args) {
        SingleLinkedList20 sll = new SingleLinkedList20()
;        Mahasiswa20 mhs1 = new Mahasiswa20( "24212200", "Alvaro", "1A", 4.0);
        Mahasiswa20 mhs2 = new Mahasiswa20("23212201", "Bimon", "2B", 3.8);
        Mahasiswa20 mhs3 = new Mahasiswa20("22212202", "cintia", "3C",3.5);
        Mahasiswa20 mhs4 = new Mahasiswa20("21212203","Dirga", "4D", 3.6);

        sll.print20();
        sll.addFirst20(mhs4);
        sll.print20();
        sll.addLast20(mhs1);
        sll.print20();
        sll.insertAfter20("Dirga", mhs3);
        sll.insertAt20(2, mhs2);
        sll.print20();
         }
}
