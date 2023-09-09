class Square {
    public static double square(double x) {
        return x * x;
    }

    public static void main(String[] args) {
        // Test cases
        double num1 = 3;
        double num2 = 0.2;

        double result1 = square(num1);
        double result2 = square(num2);

        System.out.println("Square of " + num1 + " is: " + result1);
        System.out.println("Square of " + num2 + " is: " + result2);
    }
}

