package P13;

public class FilmDLL20 {
    FilmNode20 head;
    FilmNode20 tail;
    int size;

    public FilmDLL20() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty20() {
        return (head == null);
    }

    public void addFirst20(int id, String title, double rating) {
        if (isEmpty20()) {
            head = new FilmNode20(null, id, title, rating, null);
            tail = head;
        } else {
            FilmNode20 newNode = new FilmNode20(null, id, title, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast20(int id, String title, double rating) {
        if (isEmpty20()) {
            addFirst20(id, title, rating);
        } else {
            FilmNode20 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            FilmNode20 newNode = new FilmNode20(tmp, id, title, rating, null);
            tmp.next = newNode;
            size++;
        }
    }

    public void add20(int id, String title, double rating, int index) throws Exception {
        if (isEmpty20()) {
            addFirst20(id, title, rating);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            FilmNode20 tmp = head;
            int i = 0;
            while (i < index) {
                tmp = tmp.next;
                i++;
            }
            if (tmp.prev == null) {
                FilmNode20 newNode = new FilmNode20(null, id, title, rating, tmp);
                tmp.prev = newNode;
                head = newNode;
            } else {
                FilmNode20 newNode = new FilmNode20(tmp.prev, id, title, rating, tmp);
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
        FilmNode20 tmp = head;
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
            FilmNode20 tmp = head;
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

    public void print20() {
        if (!isEmpty20()) {
            FilmNode20 tmp = head;
            while (tmp != null) {
                System.out.println("ID Film: " + tmp.id + ", Judul: " + tmp.title + ", Rating: " + tmp.rating);
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
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
        FilmNode20 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.id;
    }

    public int get20(int index) throws Exception {
        if (isEmpty20() || index >= size) {
            throw new Exception("Nilai index di luar batas.");
        }
        FilmNode20 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.id;
    }

    public void sortByRatingDesc20() {
        if (isEmpty20()) return;
        
        for (FilmNode20 i = head; i != null; i = i.next) {
            for (FilmNode20 j = i.next; j != null; j = j.next) {
                if (i.rating < j.rating) {
                    // Tukar data
                    int tempId = i.id;
                    String tempTitle = i.title;
                    double tempRating = i.rating;
                    
                    i.id = j.id;
                    i.title = j.title;
                    i.rating = j.rating;
                    
                    j.id = tempId;
                    j.title = tempTitle;
                    j.rating = tempRating;
                }
            }
        }
    }
}

