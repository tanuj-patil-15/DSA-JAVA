public class Stack<T> {
private ArrayList<T> stack;

public Stack() {
    stack = new ArrayList<>();
}

// Pushes an item onto the top of the stack
public void push(T item) {
    stack.add(item);
}

// Removes the top item from the stack and returns it
public T pop() {
    if (isEmpty()) {
        throw new IllegalStateException("Cannot pop from an empty stack");
    }
    return stack.remove(stack.size() - 1);
}

// Returns the top item from the stack without removing it
public T peek() {
    if (isEmpty()) {
        throw new IllegalStateException("Cannot peek on an empty stack");
    }
    return stack.get(stack.size() - 1);
}

// Returns true if the stack is empty
public boolean isEmpty() {
    return stack.isEmpty();
}

// Returns the number of items in the stack
public int size() {
    return stack.size();
}

}
