import java.util.ArrayDeque;
import java.util.Deque;

public class StackExamples {

    public static void main(String[] args) {

        // 1. Exercise Stack -> Requests
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First request");
        stack.push("Second request");
        stack.push("Third request");
        System.out.println(stack);  // [Third request, Second request, First request]

        System.out.println(stack.peek()); // Third request

        stack.pop();
        System.out.println(stack); // [Second request, First request]

        stack.poll();
        System.out.println(stack); // [First request]


        // 2. Exercise Stack -> Numbers
        // This is how your code will be called.
        // Your answer should be the same Stack as given in the input, but with the top number replaced.
        // You can edit this code to try different testing cases.
        Deque<Integer> stacks = new ArrayDeque<>();
        stacks.push(2);
        stacks.push(3);
        stacks.push(5);
        stacks.push(7);
        stacks.push(10);

        int newTop = 11;
        Deque<Integer> result = StackExamples.updateStack(stacks, newTop);

    }

    // Return the same Stack as given in the input, but with the top number replaced by newTop.
    static Deque<Integer> updateStack(Deque<Integer> stacks, int newTop) {
        // Your code goes here.
        System.out.println(stacks);
        stacks.pop(); // removes the old top number from the stack
        stacks.push(newTop); // adds your new number onto the top of the stack
        System.out.println(stacks);
        return stacks;
    }
}
