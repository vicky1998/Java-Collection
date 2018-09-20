package ListEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(1);
        a1.add("viks");
        a1.add(2);
        a1.add(9);
        a1.add(8);
        a1.add(4);
        a1.add(7);
        a1.add(6);
        a1.add(5);
        a1.add(3);

        System.out.println("Element in 5th posn "+a1.get(5));
        a1.add(5,"niks");
        a1.get(5);

        System.out.println( a1.size());
        System.out.println(a1.contains(1));
        Iterator i=a1.iterator();
        System.out.println("Elements are"+a1);

     while (i.hasNext()){
         System.out.println("next element is :"+i.next());
     }



    }

}
