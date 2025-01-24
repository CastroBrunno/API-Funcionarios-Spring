package com.example.Funcionarios.exceptions;


public class IDNotFoundException extends RuntimeException {
    public IDNotFoundException(){
        super("O ID fornecido não corresponde a nenhum funcionário registrado. Por favor, verifique o valor e tente novamente.");
    }
    
    public IDNotFoundException(String message){
        super(message);
    }   
}
    //TODO: implementar metodo que consiga verificar que campo esta vazio e retornar uma exception mais completa