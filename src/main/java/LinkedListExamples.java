import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExamples {

    public static void main(String[] args) {

        // 1. Exercise LinkedList -> Fruits
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        System.out.println(shoppingList);

        shoppingList.add(1, "mango");
        System.out.println(shoppingList);

        shoppingList.removeFirst();
        System.out.println(shoppingList);

        shoppingList.addLast("sweet cherry");
        System.out.println(shoppingList);

        // 2. Exercise LinkedList -> Planets
        // This is how your code will be called.
        // Your answer should be the same LinkedList that was passed in, but with the new String in the correct position.
        // You can edit this code to try different testing cases.
        LinkedList<String> words = new LinkedList<>(Arrays.asList("Mercury", "Venus", "Mars"));
        LinkedList<String> wordsCopy = new LinkedList<>(words);
        String newWord = "Earth";
        int index = 2;
        LinkedList<String> result = LinkedListExamples.updateLinkedList(words, newWord, index);

    }

    // Add the newWord to the words list at the given index
    static LinkedList<String> updateLinkedList(LinkedList<String> words, String newWord, int index) {
        // Your code goes here.
        words.add(2, "Earth");
        return words;
    }

}
