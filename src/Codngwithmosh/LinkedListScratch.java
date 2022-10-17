package Codngwithmosh;

//import org.w3c.dom.Node;


import java.util.NoSuchElementException;

public class LinkedListScratch {
    private class Nodes {
        private int value;
        private Nodes next;
        public Nodes(int value){
            this.value = value;
        }

    }
    private Nodes first;
    private Nodes last;

    public void Addlast(int item){
       var node = new Nodes(item);
       if(isEmpty()){
           first = last = node;
       }
       else{
           last.next = node;
           last = node;
       }
    }

    public void Addfirst(int item){
     var node = new Nodes(item);

     if(isEmpty()){
         first = last = node;
     }
     else{
         node.next = first;
         first = node;
     }
    }

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item){
        int index = 0;
        var current  = first;
        while(current != null){
            if(current.value == item){
                return index;
            }
            else  current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    public void removefirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = last = null;
            return;
        }
          var second = first.next;
          first.next = null;
          first = second;
    }

    public void removelast(){
        var current  = first;
        while(current != null){
            if(current.next == last){
                break;
            }
            else{
                current = current.next;
            }
        }
    }
}

