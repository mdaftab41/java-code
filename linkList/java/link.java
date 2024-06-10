package linkList.java;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    Node head = null;

    void InserAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void InserAtLast(int data){
        Node newNode= new Node(data);
        Node current = head;
        while(current.next!=null){
            current = current.next ; 
        }
        current.next=newNode;
        newNode.next=null;

    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print( "Null "); 
    }
}

public class link {
    public static void main(String[] args) {
        LL list = new LL();
        list.InserAtFirst(2);
        list.InserAtFirst(3);
        list.InserAtFirst(4);
        list.InserAtFirst(5);
        list.InserAtFirst(6);
        list.InserAtFirst(7);
        list.InserAtLast(8);
        list.InserAtLast(6);
        list.InserAtLast(9);

        list.print();
    }
}
