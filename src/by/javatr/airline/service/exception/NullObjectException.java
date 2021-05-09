package by.javatr.airline.service.exception;

public class NullObjectException extends Exception{
    public NullObjectException() {
    }

    public NullObjectException(String message) {
        super(message);
    }

    public NullObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullObjectException(Throwable cause) {
        super(cause);
    }
}
