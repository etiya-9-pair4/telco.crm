package io.github.macidko.exception;



import io.github.macidko.exception.response.BusinessExceptionResponse;
import io.github.macidko.exception.type.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // Fallback method
    // Exception handler -> Uygulamada belirlediğim türdeki ex. nerede fırlarsa fırlasın. Bu methoda gelsin.
    // Ex. Handler methodların 1. parametresi oto. olarak fırlayan ex. doldurulur.
    @ExceptionHandler({ MethodArgumentNotValidException.class })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> handleValidationException(MethodArgumentNotValidException exception) {
        Map<String,String> errors = new HashMap<>();

        for (FieldError error:
                exception.getBindingResult().getFieldErrors()) {
            errors.put(error.getField(), error.getDefaultMessage());
        }
        // stock, must be greater than or equal to 0
        // name, must not be empty
        return errors;
    }


    // TODO: Buradaki yapıyı tüm hata yönetimlerine uygula.
    @ExceptionHandler({BusinessException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public BusinessExceptionResponse handleBusinessException(BusinessException exception)
    {
        return new BusinessExceptionResponse(HttpStatus.BAD_REQUEST.value(),exception.getMessage());
    }

    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public BusinessExceptionResponse handleRuntimeException(){
        String err= "Unknowm error";
        return new BusinessExceptionResponse(HttpStatus.BAD_REQUEST.value(),err);
    }

}