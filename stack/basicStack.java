package stack;

import java.util.ArrayDeque;

public class basicStack {
    public static void main(String[] args) {
        ArrayDeque<Integer> s = new ArrayDeque<>();

        s.push(1); // Pushing 1 to the top
        s.push(2); // Pushing 2 to the top
        s.push(3); // Pushing 3 to the top
        s.push(4); // Pushing 4 to the top
        s.push(5); // Pushing 5 to the top

        // Printing in reverse order
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }

        // The output will be "5 4 3 2 1"
    }
}
