package P1;
import java.util.Scanner;
public class pemilihan20 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double nilaiakhir, nilaitugas, nilaikuis, nilaiuts,nilaiuas;

    System.out.println("Program Menghitung Nilai");
    System.out.println("=======================");

    System.out.print("Masukan Nilai Tugas");
    nilaitugas = scanner.nextDouble(); 
    System.out.print("Masukan Nilai Kuis");
    nilaikuis = scanner.nextDouble();
    System.out.print("Masukan Nilai UTS");
    nilaiuts = scanner.nextDouble();
    System.out.print("Masukan Nilai UAS");
    nilaiuas = scanner.nextDouble();

    System.out.println("=======================");
    System.out.println("=======================");

    nilaiakhir = nilaitugas*0.2 + nilaikuis*0.2 + nilaiuts*0.3 + nilaiuas*0.4;

    if (nilaitugas < 0 || nilaitugas > 100) {
        System.out.println("Nilai tidak valid");
        System.out.println("=======================");
        System.out.println("=======================");
    } else if (nilaikuis < 0 || nilaikuis > 100) {
        System.out.println("Nilai tidak valid");
        System.out.println("=======================");
        System.out.println("=======================");
        
    } else if (nilaiuts < 0 || nilaiuts > 100) {
        System.out.println("Nilai tidak valid");
        System.out.println("=======================");
        System.out.println("=======================");
        
    } else if (nilaiuas < 0 || nilaiuas > 100) {
        System.out.println("Nilai tidak valid");
        System.out.println("=======================");
        System.out.println("=======================");
        
    } else if (nilaiakhir > 80 && nilaiakhir <= 100) {
        System.out.println("Nilai akhir : " + nilaiakhir);
        System.out.println("Nilai huruf : A" );
        System.out.println("=======================" );
        System.out.println("SELAMAT ANDA LULUS" );
        
        System.out.println("=======================" );
    } else if (nilaiakhir > 73 && nilaiakhir <= 80) {
        System.out.println("Nilai akhir : " + nilaiakhir);
        System.out.println("Nilai huruf : B+" );
        System.out.println("=======================" );
        System.out.println("=======================" );
        System.out.println("SELAMAT ANDA LULUS" );
        
    } else if (nilaiakhir > 65 && nilaiakhir <= 73) {
        System.out.println("Nilai akhir : " + nilaiakhir);
        System.out.println("Nilai huruf : B " );
        System.out.println("=======================" );
        System.out.println("=======================" );
        System.out.println("SELAMAT ANDA LULUS" );
        
    } else if (nilaiakhir > 60 && nilaiakhir <= 65) {
        System.out.println("Nilai akhir : " + nilaiakhir);
        System.out.println("Nilai huruf : C+ " );
        System.out.println("=======================" );
        System.out.println("=======================" );
        System.out.println("SELAMAT ANDA LULUS" );
        
    } else if (nilaiakhir > 50 && nilaiakhir <= 60) {
        System.out.println("Nilai akhir : " + nilaiakhir);
        System.out.println("Nilai huruf : C " );
        System.out.println("=======================" );
        System.out.println("=======================" );
        System.out.println("SELAMAT ANDA LULUS" );
        
    } else if (nilaiakhir > 39 && nilaiakhir <= 50) {
        System.out.println("Nilai akhir : " + nilaiakhir);
        System.out.println("Nilai huruf : D " );
        System.out.println("=======================" );
        System.out.println("=======================" );
        System.out.println("ANDA TIDAK LULUS" );
        
    } else if (nilaiakhir >= 0 && nilaiakhir <= 39) {
        System.out.println("Nilai akhir : " + nilaiakhir);
        System.out.println("Nilai Huruf : E " );
        System.out.println("=======================" );
        System.out.println("=======================" );
        System.out.println("ANDA TIDAK LULUS" );
        
    } else;
   
}
    
}