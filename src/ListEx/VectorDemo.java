package ListEx;

import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector v1=new Vector();
        Vector v= new Vector(10,3);
        System.out.println(v.size());
        v.addElement("ganesh");
        v.addElement(0);
        v.addElement(1);
        v.addElement(2);
        v.addElement(0);
        v.addElement(2);
        v.addElement(8);
        v.addElement(8);
        v.addElement(4);
        v.addElement(3);
        System.out.println(v);

        v1.addElement("Ganesh");
        v1.addElement(0);
        v1.addElement(2);
        v1.addElement(3);
        v1.addElement(4);
        v1.addElement(6);
        v1.addElement(6);
        v1.addElement(5);
        v1.addElement("Gaitonde");
        System.out.println("the elements are"+v1);


    }
}
