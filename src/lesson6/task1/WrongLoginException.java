package lesson6.task1;

public class WrongLoginException extends RuntimeException{

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
