package com.example.Funcionarios.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDTO {
    private String message;
    private String timesTamp;

    public ErrorDTO(String message) {
        this.message = message;
        this.timesTamp = LocalDateTime.now().toString();
    }
}
