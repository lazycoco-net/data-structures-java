package net.lazycoco.datastructures;

public class EmptyStackException extends RuntimeException {
    public EmptyStackException(String message) {
        super(message);
    }

    public EmptyStackException(String message, Throwable cause) {
        super(message, cause);
    }
}
