import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1; // rand.nextInt(100) returns 0–99
        }


        System.out.print("Array: ");
        for (int num : numbers) System.out.print(num + " ");
        System.out.println();


        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
