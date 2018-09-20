package SetEx;
import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args ){
        HashSet hs=new HashSet();
        hs.add(1);
        hs.add(3);
        hs.add(5);
        hs.add(7);
        hs.add(2);
        hs.add(3);
        hs.add(null);
        hs.add("Vicky");
        hs.add(1);
        System.out.println("before reapitiing Null"+hs);
        hs.add(null);
        HashSet hs1=new HashSet(5,0.75f);
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);


        System.out.println(hs.isEmpty());
        //hs1.add(1);

        //Que-> how it compare int with string in order to represent in specefic order
        System.out.println(hs1);
    }


}
