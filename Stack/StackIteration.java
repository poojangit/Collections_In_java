package Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackIteration {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        for(String abc : stack){
            System.out.println(abc);
        }
        for(int i=0; i< stack.size(); i++){
            System.out.println(stack.get(i));
        }
        Iterator<String> i = stack.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}