package Codngwithmosh;

public class LinkedListMain {
    public static void main(String[] args) {
     var list = new LinkedListScratch();
     list.Addlast(20);
     list.Addlast(30);
     list.Addlast(40);
     list.removefirst();
        System.out.println(list.indexOf(30));
    }
}
