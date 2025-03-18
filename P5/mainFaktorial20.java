package P5;
import java.util.Scanner;
public class mainFaktorial20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukan nilai: ");
        int nilai = input.nextInt();

        Faktorial20 fk = new Faktorial20();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " +fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " +fk.faktorialDc(nilai));
    }
}
