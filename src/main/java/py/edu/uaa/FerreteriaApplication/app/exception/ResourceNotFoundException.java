package py.edu.uaa.FerreteriaApplication.app.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
        super("Resource not found");
    }
}
