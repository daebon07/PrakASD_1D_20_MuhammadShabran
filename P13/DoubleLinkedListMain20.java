package P13;

public class DoubleLinkedListMain20 {
    public static void main(String[] args) throws Exception {
    
    DoubleLinkedList20 dll= new DoubleLinkedList20();
    dll.print20();
    System.out.println("Size: " +dll.size20());
    System.out.println("==========================================");
    dll.addFirst20(3);
    dll.addLast20(4);
    dll.addFirst20(7);
    dll.print20();
    System.out.println("Size: " +dll.size20());
    System.out.println("==========================================");
    dll.add20(40, 1);
    dll.print20();
    System.out.println("Size: " +dll.size20());
    System.out.println("==========================================");
    dll.clear20();
    dll.print20();
    System.out.println("Size: " +dll.size20());
    dll.addLast20(50);
    dll.addLast20(40);
    dll.addLast20(10);
    dll.addLast20(20);
    dll.print20();
    System.out.println("Size : "+dll.size20());
    System.out.println("===============================");
    dll.removeFirst20();
    dll.print20();
    System.out.println("Size : "+dll.size20());
    System.out.println("===============================");
    dll.removeLast20();
    dll.print20();
    System.out.println("Size : "+dll.size20());
    System.out.println("===============================");
    dll.remove20(1);
    dll.print20();
    System.out.println("Size : "+dll.size20());
        }
}
