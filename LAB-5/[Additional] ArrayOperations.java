import java.util.Arrays;

public class ArrayOperations {
    private int[] arr = new int[10];
    private int size = 0;

    public void inputValues(int[] values) {
        if (values.length > arr.length) {
            System.out.println("Input array is too large. Only the first 10 values will be stored.");
            size = arr.length;
} 
else {
            size = values.length;
        }

        for (int i = 0; i < size; i++) {
            arr[i] = values[i];
        }
    }

    public void displayValues() {
        System.out.print("Array values: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void displayLargestValue() {
        if (size == 0) {
            System.out.println("Array is empty.");
        } else {
            int largest = arr[0];
            for (int i = 1; i < size; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            System.out.println("Largest value in the array: " + largest);
        }
    }

    public void displayAverage() {
        if (size == 0) {
            System.out.println("Array is empty.");
        } else {
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += arr[i];
            }
            double average = (double) sum / size;
            System.out.println("Average of values in the array: " + average);
        }
    }

    public void sortAscending() {
        Arrays.sort(arr, 0, size);
    }

    public static void main(String[] args) {
        ArrayOperations arrayOps = new ArrayOperations();
        int[] values = {5, 2, 8, 1, 9, 4, 3, 7, 6, 10};

        arrayOps.inputValues(values);
        arrayOps.displayValues();
        arrayOps.displayLargestValue();
        arrayOps.displayAverage();

        arrayOps.sortAscending();
        System.out.println("Array after sorting in ascending order:");
        arrayOps.displayValues();
    }
}
