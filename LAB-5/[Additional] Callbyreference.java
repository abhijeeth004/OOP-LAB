public class CallByRefernce {
    public static void main(String[] args) {
        int[] arr = {5, 10};

        // Swap by reference (using an array)
        swapByReference(arr, 0, 1);

        System.out.println("After swapping by reference:");
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
    }

    public static void swapByReference(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
