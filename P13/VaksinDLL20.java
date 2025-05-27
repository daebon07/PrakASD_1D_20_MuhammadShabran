package P13;

public class VaksinDLL20 {
     VaksinNode20 head;
    VaksinNode20 tail;
    int size;

    public VaksinDLL20() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty20() {
        return (head == null);
    }

    public void addFirst20(int id, String name) {
        if (isEmpty20()) {
            head = new VaksinNode20(null, id, name, null);
        } else {
            VaksinNode20 newNode = new VaksinNode20(null, id, name, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast20(int id, String name) {
        if (isEmpty20()) {
            addFirst20(id, name);
        } else {
            VaksinNode20 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            VaksinNode20 newNode = new VaksinNode20(tmp, id, name, null);
            tmp.next = newNode;
            size++;
        }
    }

    public void add20(int id, String name, int index) throws Exception {
        if (isEmpty20()) {
            addFirst20(id, name);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            VaksinNode20 tmp = head;
            int i = 0;
            while (i < index) {
                tmp = tmp.next;
                i++;
            }
            if (tmp.prev == null) {
                VaksinNode20 newNode = new VaksinNode20(null, id, name, tmp);
                tmp.prev = newNode;
                head = newNode;
            } else {
                VaksinNode20 newNode = new VaksinNode20(tmp.prev, id, name, tmp);
                tmp.prev.next = newNode;
                tmp.prev = newNode;
            }
        }
        size++;
    }

    public void removeFirst20() throws Exception {
        if (isEmpty20()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast20() throws Exception {
        if (isEmpty20()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        VaksinNode20 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.prev.next = null;
        size--;
    }

    public void remove20(int index) throws Exception {
        if (isEmpty20() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0) {
            removeFirst20();
        } else {
            VaksinNode20 tmp = head;
            int i = 0;
            while (i < index) {
                tmp = tmp.next;
                i++;
            }
            if (tmp.next == null) {
                tmp.prev.next = null;
            } else {
                tmp.prev.next = tmp.next;
                tmp.next.prev = tmp.prev;
            }
            size--;
        }
    }

    public int getFirst20() throws Exception {
        if (isEmpty20()) {
            throw new Exception("Linked List kosong");
        }
        return head.id;
    }

    public int getLast20() throws Exception {
        if (isEmpty20()) {
            throw new Exception("Linked List kosong");
        }
        VaksinNode20 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.id;
    }

    public int get20(int index) throws Exception {
        if (isEmpty20() || index >= size) {
            throw new Exception("Nilai index di luar batas.");
        }
        VaksinNode20 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.id;
    }

    public void print20() {
        if (!isEmpty20()) {
            VaksinNode20 tmp = head;
            while (tmp != null) {
                System.out.println(tmp.id + "\t" + tmp.name);
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public int size20() {
        return size;
    }
}
