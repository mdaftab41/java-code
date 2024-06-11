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

    void InsertAtPos(int data , int pos){
        Node node = new Node(data);// creating new node 
        Node current = head;
        pos=pos-1;
        while (current.next!=null && pos >1) {
            current = current.next;
             pos-- ;  
        }

        if (current == null || current.next == null) {
            System.out.println("Position is outside the linked list.");
            return;
        }
        
        if(pos == 1 ){
         node.next= current.next;
        current.next= node; 
        }
         
        if(pos==0){
            node.next= head;
            head= node ;
        }

    }
    // code to find Middle Element of linkList
    int Middle() {
        Node slow = head;
        Node fast = head;
    
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
    
    // FInd cycle in link list 
    void DetectCycle() {
        Node slow = head;
        Node fast = head;
    
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                System.out.println(" Cycle Detect in Link list");
                return ;
            }

        }
        System.out.println(" Cycle Not Detect in Link list");
         
    }

    // reverse the  linkList 
    Node reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
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
        list.InsertAtPos(31,0);
        list.InsertAtPos(19,1);
        list.InsertAtPos(50,5);
        list.InsertAtPos(99,20);
        System.out.println(" link list is : ");
        list.print();
        System.out.println( "  ");
        System.out.println( " Value of middle node is :" +"  " + list.Middle()) ; // calling for middle node 
       list.DetectCycle();
       list.reverse();
       System.out.println(" Reverse link list");

        list.print();
    }
}
