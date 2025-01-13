package Vector;

import java.util.Collections;
import java.util.Vector;

public class VectorSorting {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(20);
        vector.add(10);
        vector.add(40);
        vector.add(30);

        System.out.println("Before sorting : "+vector);
        Collections.sort(vector);
        System.out.println("After sorting "+ vector);
        Collections.sort(vector, Collections.reverseOrder());
        System.out.println(vector);
    }
}
