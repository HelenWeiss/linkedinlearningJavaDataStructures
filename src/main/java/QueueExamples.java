import java.util.*;

public class QueueExamples {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Person one");
        queue.offer("Person two");
        queue.offer("Person three");
        System.out.println(queue); // [Person one, Person two, Person three]

        System.out.println(queue.peek()); // Person one

        queue.poll();
        System.out.println(queue); // [Person two, Person three]

/*
        Queue<String> queueLinkedList = new LinkedList<>();
        queueLinkedList.offer("Person one");
        queueLinkedList.offer("Person two");
        queueLinkedList.offer("Person three");
        System.out.println(queueLinkedList); // [Person one, Person two, Person three]

        System.out.println(queueLinkedList.peek()); // Person one

        queueLinkedList.poll();
        System.out.println(queueLinkedList); // [Person two, Person three]
*/
/*
        Queue<String> queuePriorityQueue = new PriorityQueue<>();
        queuePriorityQueue.offer("Person one");
        queuePriorityQueue.offer("Person two");
        queuePriorityQueue.offer("Person three");
        System.out.println(queuePriorityQueue); // [Person one, Person two, Person three]

        System.out.println(queuePriorityQueue.peek()); // Person one

        queuePriorityQueue.poll();
        System.out.println(queuePriorityQueue); // [Person three, Person two]

 */

        // This is how your code will be called.
        // Your answer should be the same ArrayDeque given as input, but with the first 3 numbers removed from the front.
        // You can edit this code to try different testing cases.
        Queue<Integer> queueInteger = new ArrayDeque<>(Arrays.asList(1, 93, -13, 6, 105));
        Queue<Integer> queueCopy = new ArrayDeque<>(queueInteger);
        Queue<Integer> result = QueueExamples.shortenQueue(queueInteger);
    }

    // Return the same ArrayDeque given as input, but with the first 3 numbers removed from the front.
    static Queue<Integer> shortenQueue(Queue<Integer> queueInteger) {

        // Your code goes here.
        queueInteger.poll();
        queueInteger.poll();
        queueInteger.poll();
        System.out.println(queueInteger); // [1, 93, -13, 6, 105] -> [6, 105]

        return queueInteger;
    }

}
