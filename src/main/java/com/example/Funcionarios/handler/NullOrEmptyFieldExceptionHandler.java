package com.example.Funcionarios.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.Funcionarios.dto.ErrorDTO;
import com.example.Funcionarios.exceptions.NullOrEmptyFieldException;

@ControllerAdvice
public class NullOrEmptyFieldExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    @ExceptionHandler(NullOrEmptyFieldException.class)
    public ErrorDTO handler(NullOrEmptyFieldException ex){
        return new ErrorDTO(
            ex.getMessage()
        );
    }
}
