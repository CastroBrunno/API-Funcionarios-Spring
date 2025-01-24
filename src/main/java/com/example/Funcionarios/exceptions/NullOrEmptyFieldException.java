package com.example.Funcionarios.exceptions;

public class NullOrEmptyFieldException extends RuntimeException {
    public NullOrEmptyFieldException(){
        super("Nome, cargo ou salario não podem ser nulos");
    }

    public NullOrEmptyFieldException(String message){
        super(message);
    }
}
