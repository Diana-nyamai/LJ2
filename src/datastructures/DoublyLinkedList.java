package datastructures;

public class DoublyLinkedList {
    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head,tail = null;
    public void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            head.prev = null;
            tail.next = null;
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
            tail.next = null;
        }
    }

    public void displaylist(){
        Node current = head;
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        System.out.println("the data in doubly list are");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.displaylist();
    }

}
