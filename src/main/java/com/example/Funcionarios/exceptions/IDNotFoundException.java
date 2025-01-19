package com.example.Funcionarios.exceptions;

public class IDNotFoundException extends RuntimeException {
    
    public IDNotFoundException(){
        super("Id não encontrado!");
    }

    public IDNotFoundException(String message){
        super(message);
    }
}

// public IdNotFoundException(Long id) {
//     super("Id não encontrado: " + id);
// }