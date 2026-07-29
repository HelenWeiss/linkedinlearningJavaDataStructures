import java.util.Arrays;

public class ArrayExercise {

    // ArrayExamples
    public static void main(String[] args) {

        // This is how your code will be called.
        // You can edit this code to try different testing cases.
        int[] numbers = { 7, 17, -13, 19, 5 };
        int[] result = ArrayExercise.incrementArrayInt(numbers);



        String[] weekdays = new String[7]; //the size won't be changed; to make it bigger -> create the whole new Array
        System.out.println(Arrays.toString(weekdays));

        weekdays[0] = "Monday";
        System.out.println(Arrays.toString(weekdays));

        weekdays = new String[] {"Mon", "Tue", "Wed"};
        System.out.println(Arrays.toString(weekdays));

        for(String day : weekdays) {
            System.out.println("Weekday: " + day);
        }

        for(int i = 0; i < weekdays.length; i++) {
            weekdays[i] = weekdays[i].toUpperCase();
        }
        System.out.println(Arrays.toString(weekdays));

    }

    // Increment each number in the 'numbers' array by one
    static int[] incrementArrayInt(int[] numbers) {

        int[] result = new int[numbers.length];

        for(int j = 0; j < numbers.length; j++) {
            result[j] = numbers[j] + 1;
        }
        System.out.println(Arrays.toString(result));

        return result;
    }

    public void arrayToUpperCase(String[] input) {
        System.out.println(input);
    }

    public void incrementArray(int[] input) {
        System.out.println(input);
    }



}
