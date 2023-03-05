package homework.ss15_exception_debug.exrcise;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String errMessage) {
        super(errMessage);
    }
}
