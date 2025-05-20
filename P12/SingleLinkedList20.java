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

    public void getData20(int index) {
        NodeMahasiswa20 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi20();
    }

    public int indexOf20(String key) {
        NodeMahasiswa20 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst20() {
        if (isEmpty20()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast20() {
        if (isEmpty20()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa20 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove20(String key) {
        if (isEmpty20()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa20 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst20();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt20(int index) {
        if (index == 0) {
            removeFirst20();
        } else {
            NodeMahasiswa20 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
