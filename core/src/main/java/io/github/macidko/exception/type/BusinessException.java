package io.github.macidko.exception.type;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BusinessException extends RuntimeException{
    public BusinessException(String message) {
        super(message);
    }
}
