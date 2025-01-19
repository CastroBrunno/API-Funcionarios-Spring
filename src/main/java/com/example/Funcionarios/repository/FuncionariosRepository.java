package com.example.Funcionarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Funcionarios.model.Funcionario;

public interface FuncionariosRepository extends JpaRepository<Funcionario, Long> {
}
