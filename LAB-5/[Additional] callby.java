class CallBy {
    int value;

    CallBy(int value) {
        this.value = value;
    }
}

public class SwapExample {
    public static void main(String[] args) {
        CallBy x = new CallBy(5);
        CallBy y = new CallBy(10);

        // Swap by value (using a custom object)
        swapByValue(x, y);

        System.out.println("After swapping by value:");
        System.out.println("x = " + x.value);
        System.out.println("y = " + y.value);
    }

    public static void swapByValue(CallBy a, CallBy b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}
