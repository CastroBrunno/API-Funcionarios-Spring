package com.example.Funcionarios.repository;

import com.example.Funcionarios.model.Funcionario;

public record FuncionariosResponseDTO(Long id, String nome, String cargo, Double salario) {
    
    public FuncionariosResponseDTO(Funcionario funcionario) {
        this(funcionario.getId(), funcionario.getNome(), funcionario.getCargo(), funcionario.getSalario());
    }
}
