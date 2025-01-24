package com.example.Funcionarios.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.Funcionarios.dto.ErrorDTO;
import com.example.Funcionarios.exceptions.IDNotFoundException;

@ControllerAdvice
public class IDNotFoundExceptionHandler {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    @ExceptionHandler(IDNotFoundException.class)
    public ErrorDTO handler(IDNotFoundException ex){
        return new ErrorDTO(
            ex.getMessage()
        );
    }
}
