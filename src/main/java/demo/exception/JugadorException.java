package demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;



@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class  JugadorException extends RuntimeException{
    public JugadorException(Long id) {
        super("NO EXIST jugador WITH ID: "+ id);
    }
}
