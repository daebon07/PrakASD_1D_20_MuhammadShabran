 import java.util.Scanner;
 public class Mainsum20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Jumlah elemen : ");
        int elemen = input.nextInt();

        Sum20 sm= new Sum20 (elemen);
        for (int i=0;i<elemen;i++){
            System.out.print("masukan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i]=input.nextDouble();
        }
    System.out.println("total keuntungan menggunaka BruteForce:"+sm.totalBF());
    System.out.println("total keuntungan menggunaka Divide and Conquer:"+sm.totalDC(sm.keuntungan,0,elemen-1));

    }
}
