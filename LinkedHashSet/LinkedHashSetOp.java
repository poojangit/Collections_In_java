package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetOp {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits  = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Orange");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
        fruits.add(null);
        fruits.add(null);
        System.out.println(fruits.isEmpty()? "Yes" : "no");
        System.out.println("-------------------");
        System.out.println(fruits.contains(null) ? "Null is present" : "Null not present");
        Iterator<String> fruit = fruits.iterator();
        while (fruit.hasNext()) {
            System.out.println(fruit.next());
        }
        
    }
}
