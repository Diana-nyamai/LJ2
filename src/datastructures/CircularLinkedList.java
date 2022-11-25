package datastructures;

public class CircularLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            newnode.next = head;
        }
        else{
            tail.next = newnode;
            tail = newnode;
            tail.next=head;
        }
    }

    public void displaylist(){
        Node current = head;
        if(head == null){
            System.out.println("the list is empty");
        }
        else{
            System.out.println("the list is: ");
            do{
                System.out.println(" " + current.data);
                current = current.next;
            }
            while(current!=head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list =  new CircularLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.displaylist();
    }
}
