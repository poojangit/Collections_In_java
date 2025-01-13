package Vector;

import java.util.Vector;

public class BasicVectorOperations {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(29);
        vector.add(18);
        System.out.println(vector);
        vector.add(1,100);
        vector.remove(2);
        System.out.println(vector);
        System.out.println("Element at index 0: " + vector.get(0));
    }
}
