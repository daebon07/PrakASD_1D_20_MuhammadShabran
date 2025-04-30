package P10;

public class Stackkonversi20 {
    
int[] tumpukanBiner;
int size;
int top;

public Stackkonversi20() {
    this.size = 32; 
    tumpukanBiner = new int[size];
    top = -1;
}

public boolean isEmpty20() {
    return top == -1;
}

public boolean isFull20() {
    return top == size - 1;
}
public void push20(int data) {
    if (isFull20()) {
        System.out.println("Stack penuh");
    } else {
        top++;
        tumpukanBiner[top] = data;
    }
}

public int pop20() {
    if (isEmpty20()) {
        System.out.println("Stack kosong.");
        return -1;
    } else {
        int data = tumpukanBiner[top];
        top--;
        return data;
    }
}
}
