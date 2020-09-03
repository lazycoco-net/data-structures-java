package net.lazycoco.datastructures;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    @Test
    public void testIntegerPushThreeAndPopOne() {
        // Given
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // When
        int element = stack.pop();

        // Then
        assertEquals(3, element);
        assertEquals(2, stack.peek());
        assertEquals(2, stack.peek());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testIntegerPushThreeAndPopThree() {
        // Given
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // When
        boolean firstEmptyCheck = stack.isEmpty();
        int firstPeek = stack.peek();
        boolean secondEmptyCheck = stack.isEmpty();
        int firstPoppedElement = stack.pop();
        boolean thirdEmptyCheck = stack.isEmpty();
        int secondPeek = stack.peek();
        boolean fourthEmptyCheck = stack.isEmpty();
        int secondPoppedElement = stack.pop();
        boolean fifthEmptyCheck = stack.isEmpty();
        int thirdPeek = stack.peek();
        boolean sixthEmptyCheck = stack.isEmpty();
        int thirdPoppedElement = stack.pop();
        boolean seventhEmptyCheck = stack.isEmpty();

        // Then
        assertEquals(3, firstPeek);
        assertEquals(3, firstPoppedElement);
        assertEquals(2, secondPeek);
        assertEquals(2, secondPoppedElement);
        assertEquals(1, thirdPeek);
        assertEquals(1, thirdPoppedElement);
        assertFalse(firstEmptyCheck);
        assertFalse(secondEmptyCheck);
        assertFalse(thirdEmptyCheck);
        assertFalse(fourthEmptyCheck);
        assertFalse(fifthEmptyCheck);
        assertFalse(sixthEmptyCheck);
        assertTrue(seventhEmptyCheck);
    }

    @Test
    public void testStringPushOneAndPopOne() {
        // Given
        MyStack<String> stack = new MyStack<>();
        stack.push("one");

        // When
        String element = stack.pop();

        // Then
        assertEquals("one", element);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopThrowsExceptionWhenEmpty() {
        // Given
        MyStack<Integer> stack = new MyStack<>();

        // When // Then
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    public void testPeekThrowsExceptionWhenEmpty() {
        // Given
        MyStack<Integer> stack = new MyStack<>();

        // When // Then
        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test
    public void testPushThrowsExceptionWhenElementIsNull() {
        // Given
        MyStack<Integer> stack = new MyStack<>();

        // When // Then
        assertThrows(NullPointerException.class, () -> stack.push(null));
    }
}
