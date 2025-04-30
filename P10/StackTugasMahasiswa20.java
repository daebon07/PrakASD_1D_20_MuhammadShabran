package P10;

public class StackTugasMahasiswa20 {
    Mahasiswa20[] stack;
    int top;
    int size;

public StackTugasMahasiswa20(int size){
    this.size = size;
    stack = new Mahasiswa20 [size];
    top = -1;
}

public boolean isFull20(){
    if (top == size -1){
        return true;
    } else{
        return false;
    }
}

public boolean isEmpty20(){
    if (top == -1){
        return true;
    } else {
        return false;
    }
}

public void push20 (Mahasiswa20 mhs){
    if (!isFull20()){
        top++;
        stack[top] = mhs;
    } else {
        System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi");
    }
}
public Mahasiswa20 pop20 () {
    if(!isEmpty20()){
        Mahasiswa20 m = stack [top];
        top--;
        return m;
    } else {
        System.out.println("Stack kosong! Tidak ada tugas Untuk dinilai.");
        return null;
    }
}
public Mahasiswa20 peek20() {
    if (!isEmpty20()){
        return stack [top];
    } else {
        System.out.println( "Stack kosong ! Tidak ada tugas yang dikumpulkan");
        return null;
    }
 }
 public Mahasiswa20 peekbottom20 () {
    if (!isEmpty20()) {
        return stack[0]; 
    } else {
        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
        return null;
    }
}
 public void print20 (){
    for (int i = top; i >= 0; i--){
        System.out.println(stack[i].nama + "\t" + stack [i].nim + "\t" + stack[i].kelas);
    } 
    System.out.println( " ");
 }
}
