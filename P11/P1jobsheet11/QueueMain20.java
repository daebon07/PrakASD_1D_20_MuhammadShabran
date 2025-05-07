package P11.P1jobsheet11;
import java.util.Scanner;

public class QueueMain20 {
    public static void menu(){
        System.out.println("Masukan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. clear");
        System.out.println("--------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukan kapasitas queue: ");
        int n = sc.nextInt();
        queue20 Q = new queue20(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1 :
                System.out.print("Masukan data baru");
                int datamasuk = sc.nextInt();
                Q.Enqueue20(datamasuk);
                break;
                case 2:
                int datakeluar =Q.Dequeue20();
                if (datakeluar != 0){
                    System.out.println("Data yang dikeluarkan: " + datakeluar );
                    break;
                }
                case 3:
                Q.print20();
                break;
                case 4:
                Q.peek20();
                break;
                case 5:
                Q.clear20();
                break;
            }
        }while (pilih ==1 ||pilih ==2 ||pilih ==3 ||pilih ==4 ||pilih ==5 );

    }

}
