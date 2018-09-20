package SetEx;

import java.util.*;

public class SortedSetDemo {

    public static void main(String[] args) {
        //->cannot create object since it's an interface
        SortedSet sc = new SortedSet() {
            @Override
            public Comparator comparator() {
                return null;
            }

            @Override
            public SortedSet subSet(Object fromElement, Object toElement) {
                return null;
            }

            @Override
            public SortedSet headSet(Object toElement) {
                return null;
            }

            @Override
            public SortedSet tailSet(Object fromElement) {
                return null;
            }

            @Override
            public Object first() {
                return null;
            }

            @Override
            public Object last() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        SortedSet ts = new TreeSet();
        ts.add(1);
        ts.add(3);
        ts.add(5);
        ts.add(4);
        ts.add(0);
        //Que->how does Tree set can use the methods of Sorted det inter face
        System.out.println("after sorting ->" + ts);
        System.out.println("using headset func" + ts.headSet(2));
        //it will print no's <(less) than element

        System.out.println("using tailset fun" + ts.tailSet(3));
        //it will print no's >=(greater & equals) to element

        System.out.println("using subset fun" + ts.subSet(0, 4));
        //it will print element which are(>=) greater & equal to 1st element &(<)less than 2nd element

        SortedSet<String> s1 = new TreeSet<String>();
        s1.add("v");
        s1.add("i");
        s1.add("c");
        s1.add("k");
        s1.add("y");
        System.out.println(s1);


    }


}
