package P12;

public class SingleLinkedList20 {
    NodeMahasiswa20 head;
    NodeMahasiswa20 tail;

    boolean isEmpty20(){
        return  (head==null);
    }

    public void print20(){
        if (!isEmpty20()){
            NodeMahasiswa20 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null){
                tmp.data.tampilInformasi20();
                tmp = tmp.next;

            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst20(Mahasiswa20 input){
        NodeMahasiswa20 ndInput = new NodeMahasiswa20(input, null);
        if (isEmpty20()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next=head;
            head = ndInput;
        }
    }

    public void addLast20(Mahasiswa20 input){
        NodeMahasiswa20 ndInput = new NodeMahasiswa20(input, null);
        if(isEmpty20()){
            head= ndInput;
            tail = ndInput;
        } else {
            tail.next= ndInput;
            tail= ndInput;
        }
    }
    
    public void insertAfter20(String key, Mahasiswa20 input) {
        NodeMahasiswa20 ndInput = new NodeMahasiswa20(input, null);
        NodeMahasiswa20 temp = head;
        do {
        if (temp.data.nama.equalsIgnoreCase(key)) {
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
            break;
        }
        temp = temp.next;
        } while (temp != null);
    }
    public void insertAt20(int index, Mahasiswa20 input) {
        if (index < 0) {
            System.out.println("x: index salah");
        } else if (index == 0) {
            addFirst20(input);
        } else {
            NodeMahasiswa20 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa20(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
