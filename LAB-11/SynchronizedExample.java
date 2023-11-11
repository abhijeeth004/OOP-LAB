import java.util.Scanner;

class SharedResource {
    private int count = 0;

    public synchronized void incrementWithMethod() {
        count++;
    }

    public void incrementWithBlock() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

class ThreadUsingMethod extends Thread {
    private SharedResource resource;
    private int iterations;

    public ThreadUsingMethod(SharedResource resource, int iterations) {
        this.resource = resource;
        this.iterations = iterations;
    }

    public void run() {
        for (int i = 0; i < iterations; i++) {
            resource.incrementWithMethod();
        }
    }
}

class ThreadUsingBlock extends Thread {
    private SharedResource resource;
    private int iterations;

    public ThreadUsingBlock(SharedResource resource, int iterations) {
        this.resource = resource;
        this.iterations = iterations;
    }

    public void run() {
        for (int i = 0; i < iterations; i++) {
            resource.incrementWithBlock();
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of iterations: ");
        int iterations = scanner.nextInt();
        scanner.close();

        SharedResource resource = new SharedResource();

        ThreadUsingMethod thread1 = new ThreadUsingMethod(resource, iterations);
        ThreadUsingMethod thread2 = new ThreadUsingMethod(resource, iterations);

        ThreadUsingBlock thread3 = new ThreadUsingBlock(resource, iterations);
        ThreadUsingBlock thread4 = new ThreadUsingBlock(resource, iterations);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Using synchronized methods - Result: " + resource.getCount());

        resource = new SharedResource(); // Reset the shared resource

        thread1 = new ThreadUsingMethod(resource, iterations);
        thread2 = new ThreadUsingMethod(resource, iterations);

        thread3 = new ThreadUsingBlock(resource, iterations);
        thread4 = new ThreadUsingBlock(resource, iterations);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Using synchronized blocks - Result: " + resource.getCount());
    }
}
