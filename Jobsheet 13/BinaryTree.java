public class BinaryTree {
    Node root;   

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addRecursive(Mahasiswa25 mhs) {
        Node newNode = new Node(mhs);
        root = addHelper(root, newNode);
    }

    public Node addHelper(Node root, Node node) {
        if (root == null) {
            root = node;
            return root;
        }

        if (node.mhs.ipk < root.mhs.ipk) {
            root.left = addHelper(root.left, node);
        } else {
            root.right = addHelper(root.right, node);
        }

        return root;
    }

    public void add (Mahasiswa25 mhs) {
        Node newNode = new Node(mhs);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node current = root;
            Node parent = null;
            while (true) {
                parent = current;
                if (mhs.ipk < current.mhs.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else if (mhs.ipk > current.mhs.ipk) {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    Mahasiswa25 cariMinIpk() {
        Node current = root;

        while (current.left != null) {
            current = current.left;
        }
        
        return current.mhs;
    }

    Mahasiswa25 cariMaxIpk() {
        Node current = root;

        while (current.right != null) {
            current = current.right;
        }
        
        return current.mhs;
    }

    boolean find(double ipk) {
        boolean result = false;
        Node current = root;

        while (current != null) {
            if (current.mhs.ipk == ipk) {
                return true;
            } else if (ipk > current.mhs.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node node) {
        if (node == null) {
            return;
        }

        node.mhs.tampilInformasi();
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }

    void traverseInOrder(Node node) {
        if (node == null) {
            return;
        }

        traverseInOrder(node.left);
        node.mhs.tampilInformasi();
        traverseInOrder(node.right);
    }

    void traversePostOrder(Node node) {
        if (node == null) {
            return;
        }

        traversePostOrder(node.left);
        traversePostOrder(node.right);
        node.mhs.tampilInformasi();
    }

    void traverseIpk(Node node, double ipkBatas) {
        if (node == null) {
            return;
        }
        
        if (node.mhs.ipk >= ipkBatas) {
        traverseIpk(node.left, ipkBatas);
        node.mhs.tampilInformasi();
        }
    
        traverseIpk(node.right, ipkBatas);
    }

    void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan ipk di atas " + ipkBatas + " : ");
        traverseIpk(root, ipkBatas);
    }

    Node getSuccessor(Node node) {
        Node successor = node.right;
        Node successorParent = node;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != node.right) {
            successorParent.left = successor.right;
            successor.right = node.right;

        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mhs.ipk == ipk) {
                break;
            } else if (ipk < current.mhs.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("data tidak ditemukan");
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
                    parent.right = current.left;
                }
            }
        } else if(current.right == null) {
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
            Node successor = getSuccessor(current);
            System.out.println("Jika 2 anak, current = ");
            successor.mhs.tampilInformasi();
            if (current == root) {
                root = successor;
            } else {
                if(isLeftChild) {
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


