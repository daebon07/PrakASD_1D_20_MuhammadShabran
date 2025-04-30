package P10;

public class Stacksurat20 {
    surat20 [] stack;
    int top;
    int size;

public Stacksurat20(int size){
        this.size = size;
        stack = new surat20 [size];
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
    public void push20(surat20 s) {
        if (!isFull20()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat20.");
        }
    }

    public surat20 pop20() {
        if (!isEmpty20()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public surat20 peek20() {
        if (!isEmpty20()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void carisurat20(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].Namaamahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("surat20 ditemukan:");
                stack[i].tampilkanInfo20();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("surat20 dengan nama " + nama + " tidak ditemukan.");
        }
    }
}
