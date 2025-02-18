package P1;

import java.util.Scanner;
public class Fungsi20 {
    static int [][] stock = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}  
    };
    static int[] harga = {75000, 50000, 60000, 10000};
    static String[] cabang = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
    static int[] bMati = {-1, -2, 0 ,-5};

    public static void main(String[] args) {
        pendapatansemuacabang();
        tampilstock();
        BungaMati();
    }
    static void pendapatansemuacabang() { 
        System.out.println(" Pendapatan setiap cabang jika semua bunga terjual = ");
        for ( int i = 0; i < stock.length; i ++) {
            int tPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                tPendapatan += stock[i][j] *  harga[j]   ;   
               
                System.out.println(cabang[i] + " = Rp " + tPendapatan);     }
        }

        
    }

    static void tampilstock(){
        System.out.println(" Stock Setiap jenis bunga sebelum pengurangan : ");
        System.out.println("Cabang\t\tAglonema\tKeladi\tAlocasia\tMawar");
        for (int i = 0; i < stock.length; i++){
            System.out.printf("%s\t%d\t\t%d\t%d\t\t%d\n", cabang[i], stock[i][0], stock[i][1], stock[i][2], stock[i][3]);
        }
    }

    static void BungaMati() {
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0 ; j < stock[i].length ; j++) {
                stock [i][j] += bMati[j];
                if (stock[i][j] < 0 ) stock [i] [j] = 0;
            }
        }
    }

    static void stockbungaSetelahkurang () {
        System.out.println( " Stok setelah pengurangan bunga yang mati = " );
        System.out.println("Cabang\t\tAglonema\tKeladi\tAlocasia\tMawar");
             for (int i = 0; i < stock.length; i++){
                 System.out.printf("%s\t%d\t\t%d\t%d\t\t%d\n", cabang[i], stock[i][0], stock[i][1], stock[i][2], stock[i][3]);}
    }
    
}