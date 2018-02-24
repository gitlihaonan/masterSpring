package masterspring.error;

/**
 * Created by lihaonan on 2/24/18.
 */
public class EntityNotFoundException extends Exception{

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
