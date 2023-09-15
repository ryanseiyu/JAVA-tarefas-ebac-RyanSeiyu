package exceptions;

public class ElementoException extends Exception {
    private static final long serialVersionUID = -2268140970978666251L;

    public ElementoException(String msg) {
        this(msg, null);
    }

    public ElementoException(String msg, Throwable e) {
        super(msg, e);
    }
}
