package net.lazycoco.datastructures;

public class MyStack<T> {
    private class Node {
        private T element;
        private Node previous;

        private Node(T element, Node previous) {
            this.element = element;
            this.previous = previous;
        }
    }

    private Node top;

    public MyStack() {
        top = null;
    }

    public void push(T element) {
        if (element == null) {
            throw new NullPointerException("Element is null");
        }
        top = new Node(element, top);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException("No elements left in stack");
        }
        T result = top.element;
        top = top.previous;
        return result;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException("No elements left in stack");
        }
        return top.element;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
