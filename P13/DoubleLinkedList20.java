package P13;

import java.lang.classfile.components.ClassPrinter.Node;

public class DoubleLinkedList20 {
    Node20 head;
    int size;

    public  DoubleLinkedList20(){
        head = null;
        size = 0;
    }

     boolean isEmpty20(){
        return  (head==null);
    }

    public void  addFirst20 (int item){
        if (isEmpty20()){
            head = new Node20(null, item, null);
        } else {
            Node20 newNode= new Node20 (null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast20 (int item){
        if(isEmpty20()){
            addFirst20(item);
        }else{
            Node20 tmp = head;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            Node20 newNode20 = new Node20(tmp, item, null);
            tmp.next = newNode20;
            size++;;
        }
    }

    public void add20(int item, int index) throws Exception {
        if (isEmpty20()){
            addFirst20(item);
        } else if(index< 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node20 tmp = head;
            int i = 0;
            while (i<index){
                tmp = tmp.next;
                i++;
            }
            if (tmp.prev==null){
                Node20 newNode20= new Node20(null, item, tmp);
                tmp.prev= newNode20;
                head = newNode20; 
            } else {
                Node20 newNode20 = new Node20(tmp.prev, item, tmp);
                newNode20.prev =tmp.prev;
                newNode20.next = tmp;
                tmp.prev.next= newNode20;
                tmp.prev= newNode20;
            }
        }
        size++;
    }
    
    public int size20(){
        return size;
    }

    public void clear20(){
        head = null;
        size = 0;
    }

    public void print20(){
        if(!isEmpty20()){
            Node20 tmp = head;
            while (tmp != null){
                System.out.println(tmp.data+ "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
