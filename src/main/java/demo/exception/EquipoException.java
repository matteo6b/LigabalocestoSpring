package demo.exception;

/**
 * Created by mateo.bistuer on 04/11/2015.
 */
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;



@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class  EquipoException extends RuntimeException{
    public EquipoException(Long id) {
        super("NO EXIST EQUIPO WITH ID: "+ id);
    }
}