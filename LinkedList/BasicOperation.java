package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class BasicOperation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Start");
        list.addLast("End");
        list.add("Pooja");
        list.add(0, "Preethi");
        list.add(list.size()-1, "Im last");

        if (list.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("Not Empty");
        }

        // list.clear(); 
        // System.out.println(list);
        Collections.sort(list);
        System.out.println("----------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
}
