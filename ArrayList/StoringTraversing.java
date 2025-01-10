package ArrayList;

import java.util.ArrayList;

public class StoringTraversing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------");
        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.println(list.get(j));
        }
        System.out.println(list.addAll(list));
        System.out.println(list.contains(1));
        System.out.println(list.containsAll(list));
        System.out.println(list.remove(2));
        System.out.println(list.removeAll(list));
        System.out.println(list.clone());
        list.clear();
        System.out.println(list.isEmpty());

    }
}
