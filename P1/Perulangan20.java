package P1;
import java.util.Scanner;
public class Perulangan20 {
    public static void main(String[] args) {
    String nim;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukan NIM : ");
    nim = scanner.nextLine();
    System.out.println("============================");

    int n = Integer.parseInt(nim.substring(nim.length() - 2));
    if (n < 10) {
        n += 10;
    }

    System.out.println("n : " + n);

    for (int i=1 ;i<=n ;i++){
        if (i == 6 || i == 10) {
            continue;
        }
        if (i % 2 == 0) {
            System.out.print(i + " ");
        } else {
            System.out.print("* ");
        }
    }


    }
}
