package src.exe8.exception;

public class UnsupportedFunctionException extends RuntimeException {

    private final int ERROR_CODE;

    public UnsupportedFunctionException(String message, int errCode) {
        super(message);
        ERROR_CODE = errCode;
    }

    public UnsupportedFunctionException(String message) {
        this(message, 100);
    }

    @Override
    public String getMessage() {
        return "[" + getErrorCode() + "]" + super.getMessage();
    }

    public int getErrorCode() {
        return ERROR_CODE;
    }


}