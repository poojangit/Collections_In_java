
package HashSet;

import java.util.HashSet;
import java.util.Iterator;

class HashSetBasicOp {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("z");
        hashSet.add("Mango");
        hashSet.add("Orange");
        hashSet.add("Kiwi");
        

        for(String fruits : hashSet){
            System.out.println(fruits);
        }
        System.out.println("---------------");

        System.out.println(hashSet.contains("z") ? "yes" : "no");
        hashSet.remove("z");
        hashSet.clear();
        System.out.println(hashSet.isEmpty()? "Empty" : " not empty");
       System.out.println(hashSet.size());
        Iterator<String> fruit = hashSet.iterator();
        while (fruit.hasNext()) {
            System.out.println(fruit.next());
        }
    }
    
}