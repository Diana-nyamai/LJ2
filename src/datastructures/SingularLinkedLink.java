package datastructures;

public class SingularLinkedLink {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    define the head and tail of the linked list
    public Node head = null;
    public Node tail = null;

//    create an insert method
    public void insert(int data){
//       creating a node object
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }

//    display data in the list
    public void displayList(){
        Node current = head;
        if(head == null){
            System.out.println("the given list is empty");
            return;
        }
        System.out.println("the data in the list is");
        while(current!=null){
            System.out.println(current.data + "");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SingularLinkedLink list = new SingularLinkedLink();
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.displayList();
    }
}
