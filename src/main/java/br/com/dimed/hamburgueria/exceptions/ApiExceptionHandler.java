package br.com.dimed.hamburgueria.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ApiExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public Problem handleBusiness(BusinessException ex) {
        var status = HttpStatus.BAD_REQUEST;
        var problem = new Problem(ex.getMessage());

        return problem;
    }
}
