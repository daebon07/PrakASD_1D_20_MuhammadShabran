package P14;

public class Binarytree20 {
    Node20 root;

    public Binarytree20 (){
        root = null;
    }

    public boolean isEmpty20(){
        return root == null;
    }
    
    public void add20(Mahasiswa20 mahasiswa) {
    Node20 newNode = new Node20(mahasiswa);
    if (isEmpty20()){
        root = newNode;
    } else {
        Node20 current = root;
        Node20 parent = null;
        while(true){
            parent = current;
            if (mahasiswa.ipk < current.mahasiswa.ipk) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }
}
boolean find20(double ipk) {
    boolean result = false;
    Node20 current = root;
    while (current != null) {
        if (current.mahasiswa.ipk == ipk) {
            result = true;
            break;
        } else if (ipk > current.mahasiswa.ipk) {
            current = current.right;
        } else {
            current = current.left;
        }
    }
    return result;
}
void traversePreOrder20(Node20 node) {
    if (node != null) {
        node.mahasiswa.tampilInformasi20();
        traversePreOrder20(node.left);
        traversePreOrder20(node.right);
    }
}

void traverseInOrder20(Node20 node) {
    if (node != null) {
        traverseInOrder20(node.left);
        node.mahasiswa.tampilInformasi20();
        traverseInOrder20(node.right);
    }
}

void traversePostOrder20(Node20 node) {
    if (node != null) {
        traversePostOrder20(node.left);
        traversePostOrder20(node.right);
        node.mahasiswa.tampilInformasi20();
    }
}

Node20 getSuccessor20(Node20 del) {
    Node20 successor = del.right;
    Node20 successorParent = del;
    
    while (successor.left != null) {
        successorParent = successor;
        successor = successor.left;
    }

    if (successor != del.right) {
        successorParent.left = successor.right;
        successor.right = del.right;
    }
    
    return successor;
}
void delete20(double ipk) {
    if (isEmpty20()) {
        System.out.println("Binary tree kosong");
        return;
    }

    Node20 parent = root;
    Node20 current = root;
    boolean isLeftChild = false;
    
    while (current != null) {
        if (current.mahasiswa.ipk == ipk) {
            break;
        } else if (ipk < current.mahasiswa.ipk) {
            parent = current;
            current = current.left;
            isLeftChild = true;
        } else {
            parent = current;
            current = current.right;
            isLeftChild = false;
        }
    }
    if (current == null) {
    System.out.println("Data tidak ditemukan");
    return;
} else {
    if (current.left == null && current.right == null) {
        if (current == root) {
            root = null;
        } else {
            if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
    } else if (current.left == null) { 
        if (current == root) {
            root = current.right;
        } else {
            if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
    } else if (current.right == null) { 
        if (current == root) {
            root = current.left;
        } else {
            if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }
    } else { 
        Node20 successor = getSuccessor20(current);
        System.out.println("2 anak, current = ");
        successor.mahasiswa.tampilInformasi20();
        if (current == root) {
            root = successor;
        } else {
            if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
        }
        successor.left = current.left;
    }
}
}

}
