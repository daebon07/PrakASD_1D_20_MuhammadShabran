package P14;

public class Binarytreemain20 {
   public static void main(String[] args) {
     Binarytree20 bst = new Binarytree20();

bst.add20(new Mahasiswa20("244160121", "Ali", "A", 3.57));
bst.add20(new Mahasiswa20("244160221", "Badar", "B", 3.85));
bst.add20(new Mahasiswa20("244160415", "Candra", "C", 3.45));
bst.add20(new Mahasiswa20("244160220", "Dewi", "B", 3.54));

System.out.println("\nDaftar semua mahasiswa (in order traversal).");
bst.traverseInOrder20(bst.root);

System.out.println("\nPencarian data mahasiswa:");
System.out.println("Cari mahasiswa dengan ipk: 3.54 ");
String hasilCari = bst.find20(3.54) ? "tes" : "yoman";
System.out.println(hasilCari);

System.out.println("\nCari mahasiswa dengan ipk: 3.22 ");
hasilCari = bst.find20(3.22) ? "Ditemukan" : "Tidak ditemukan";
System.out.println(hasilCari);

System.out.println("\nPencarian data mahasiswa:");
System.out.println("Cari mahasiswa dengan ipk: 3.72 ");
hasilCari = bst.find20(3.72) ? "Ditemukan" : "Tidak ditemukan";
System.out.println(hasilCari);

System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
bst.add20(new Mahasiswa20("244160503", "Ethan", "D", 3.37));
bst.add20(new Mahasiswa20("244160201", "Friki", "E", 3.24));
bst.add20(new Mahasiswa20("244160519", "Firda", "F", 3.24));

System.out.println("\nInOrder Traversal:");
bst.traverseInOrder20(bst.root);

System.out.println("\nPreOrder Traversal:");
bst.traversePreOrder20(bst.root);

System.out.println("\nPostOrder Traversal:");
bst.traversePostOrder20(bst.root);

System.out.println("\nPenghapusan data mahasiswa:");
bst.delete20(3.57);

System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
bst.traverseInOrder20(bst.root);
   }
}
