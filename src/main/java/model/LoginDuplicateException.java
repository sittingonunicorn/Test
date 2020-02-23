package model;

public class LoginDuplicateException extends Exception {
    public LoginDuplicateException() {
    }

    public LoginDuplicateException(String message) {
        super(message);
    }
}
