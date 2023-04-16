import java.util.Arrays;
import java.util.Scanner;

public class ArraySortSumAvg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] numbers = new int[size];

        // Get the values of the array from the user
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the value of element %d: ", i);
            numbers[i] = scanner.nextInt();
        }

        // Sort the array using the built-in sort method of the Arrays class
        Arrays.sort(numbers);

        // Calculate the sum of the array elements
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }

        // Calculate the average of the array elements
        double average = (double) sum / size;

        // Print the sorted array, sum, and average
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}
