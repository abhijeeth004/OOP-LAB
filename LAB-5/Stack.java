import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

class Stack<T> {
    private List<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }
    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = stack.size() - 1;
        T poppedItem = stack.get(lastIndex);
        stack.remove(lastIndex);
        return poppedItem;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void clear() {
        stack.clear();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: " + stack);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Stack after pops: " + stack);

        System.out.println("Peek: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Stack size: " + stack.size());

        stack.clear();
        System.out.println("Stack after clear: " + stack);
    }
}
