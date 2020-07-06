package jp.kobespiral.hello_exception.exception;

public class HelloExceptionException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    public HelloExceptionException(String message) {
        super(message);
    }

}