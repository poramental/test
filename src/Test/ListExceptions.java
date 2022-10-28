package Test;

public class ListExceptions extends Exception {
    public ListExceptions() {
        super();
    }
    public ListExceptions(String message) {
        super(message);
    }
    public ListExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    public ListExceptions(Throwable cause) {
        super(cause);
    }
}