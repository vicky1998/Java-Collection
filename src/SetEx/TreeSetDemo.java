package SetEx;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("v");
        //  ts.add(null);//it doesn't allow null insertion it was allow in previous ver of java
        //it gives null point exception
        ts.add("i");
        ts.add("c");
        ts.add("k");
        ts.add("y");

        System.out.println(ts);


    }

}
