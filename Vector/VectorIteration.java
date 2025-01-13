package Vector;

import java.util.Vector;

public class VectorIteration {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(5);

        System.out.println("--------------");
        for(int number : numbers){
            System.out.println(number);
        }
        var iterartor = numbers.iterator();
        while (iterartor.hasNext()) {
            System.out.println(iterartor.next());
        }
        System.out.println("-------------------");
        for(int i= 0; i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
    }
}
