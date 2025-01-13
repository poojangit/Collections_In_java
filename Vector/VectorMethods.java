package Vector;

import java.util.Vector;

public class VectorMethods {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");
        vector.add("Four");

        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
        System.out.println("Contains two :" + vector.contains("Two"));
        System.out.println("last element : " + vector.lastElement());
        System.out.println("first element : " + vector.firstElement());
    }
}
