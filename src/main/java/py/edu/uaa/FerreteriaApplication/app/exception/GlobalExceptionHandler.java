package py.edu.uaa.FerreteriaApplication.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ ResourceNotFoundException.class })
    public ResponseEntity<Map<String, String>> handleAccessDeniedException(Exception exception) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("code", "404");
        hashMap.put("errorMessage", exception.getMessage());
        return new ResponseEntity<>(hashMap, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({ Exception.class })
    public ResponseEntity<Map<String, String>> handleException(Exception exception) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("code", "500");
        hashMap.put("errorMessage", "An unexpected error has ocurred");
        return new ResponseEntity<>(hashMap, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
