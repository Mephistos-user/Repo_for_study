package exceptions;

public class CbrNotAvailableException extends RuntimeException {
    public CbrNotAvailableException(Exception cause) {
        super("cbr api is not working now. ", cause);
    }
}
