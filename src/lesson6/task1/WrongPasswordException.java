package lesson6.task1;

public class WrongPasswordException extends RuntimeException {

    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
