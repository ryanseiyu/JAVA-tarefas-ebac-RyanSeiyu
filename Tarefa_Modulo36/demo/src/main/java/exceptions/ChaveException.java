package exceptions;

public class ChaveException extends Exception {
    private static final long serialVersionUID = -1389494676398525746L;

    public ChaveException(String msg) {
        this(msg, null);
    }

    public ChaveException(String msg, Throwable e) {
        super(msg, e);
    }
}
