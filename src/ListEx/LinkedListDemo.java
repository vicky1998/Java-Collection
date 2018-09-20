package ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(3);
        al.add(6);
        al.add(null);

        LinkedList l1=new LinkedList();
        l1.addAll(al);
        l1.addFirst("Ganesh");
        l1.addLast("Gaitonde");
        System.out.println(l1);

    }
}
