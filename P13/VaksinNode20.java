package P13;

class VaksinNode20 {
    int id;
    String name;
    VaksinNode20 next;
    VaksinNode20 prev;

    public VaksinNode20(VaksinNode20 prev, int id, String name, VaksinNode20 next) {
        this.id = id;
        this.name = name;
        this.next = next;
        this.prev = prev;
    }
};