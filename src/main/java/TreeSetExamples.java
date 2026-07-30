import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {

    public static void main(String[] args) {

        // 1. Exercise TreeSet -> Numbers

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);
        System.out.println(treeSet); // [1, 6, 47, 300]

        treeSet.add(6);
        System.out.println(treeSet); // [1, 6, 47, 300]


        // 2. Exercise TreeSet -> Words
        Set<String> wordSet = new TreeSet<>();
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        System.out.println(wordSet); // [bear, giraffe, tiger]



        Set<String> animalsSet = new TreeSet<>(Comparator.comparing(String::length));
        animalsSet.add("tiger");
        animalsSet.add("giraffe");
        animalsSet.add("bear");
        System.out.println(animalsSet); // [bear, tiger, giraffe]
        animalsSet.add("wolf"); // tiger.length=5, giraffe.length=7, bear.length=4, is not added wolf.length=4, already exists bear
        System.out.println(animalsSet); // [bear, tiger, giraffe]
        animalsSet.remove("giraffe");
        System.out.println(animalsSet); // [bear, tiger]


        // 3. Exercise TreeSet -> Colors
        // This is how your code will be called.
        // Your answer should be a TreeSet containing the three words, ordered by length.
        // You can edit this code to try different testing cases.
        String word1 = "red";
        String word2 = "yellow";
        String word3 = "blue";

        TreeSet<String> result = TreeSetExamples.createSortedTreeSet(word1, word2, word3);
    }

    // Return a TreeSet containing the three words, ordered by length.
    static TreeSet<String> createSortedTreeSet(String word1, String word2, String word3) {
        // Your code goes here.
        TreeSet<String> colors =
                new TreeSet<>(Comparator.comparing(String::length));

        //colors.add(word1);
        //colors.add(word2);
        //colors.add(word3);

        // insted 3 steps colors.add(word); see optimized row 63 below
        colors.addAll(Arrays.asList(word1, word2, word3));

        System.out.println(colors);

        return colors;
    }
}
