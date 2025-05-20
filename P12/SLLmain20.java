package P12;

public class SLLMain20 {
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

        System.out.println("data index 1 : ");
        sll.getData20(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf20("bimon"));
        System.out.println();

        sll.removeFirst20();
        sll.removeLast20();
        sll.print20();
        sll.removeAt20(0);
        sll.print20();
         }
}