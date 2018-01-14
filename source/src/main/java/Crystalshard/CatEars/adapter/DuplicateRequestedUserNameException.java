package crystalshard.catears.adapter;

public class DuplicateRequestedUserNameException extends RuntimeException {
    public DuplicateRequestedUserNameException(String message) {
        super(message);
    }
}
