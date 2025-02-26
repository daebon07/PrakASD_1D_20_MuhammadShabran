package P3;
import java.util.Scanner;
public class Matakuliah20 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahjam;

  public Matakuliah20() {
   
        }
    public Matakuliah20(String kode, String nama,int sks,int jumlahjam){
        this.kode= kode;
        this.nama= nama;
        this.sks= sks;
        this.jumlahjam=jumlahjam;
    }
    
    public void tambahData() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Kode        : ");
        this.kode = sc.nextLine();
        System.out.print("Nama        : ");
        this.nama = sc.nextLine();
        System.out.print("Sks         : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam  : ");
        this.jumlahjam = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------------");
    }
    
}
