package com.example.Funcionarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Funcionarios.exceptions.IDNotFoundException;
import com.example.Funcionarios.model.Funcionario;
import com.example.Funcionarios.repository.FuncionariosRepository;

@Service
public class FuncionariosService {
    @Autowired
    private FuncionariosRepository repository;
    

    public void cadastrarFuncionario(Funcionario funcionario) {
        if (funcionario.getNome() == null || funcionario.getNome().trim().isEmpty() || 
        funcionario.getCargo() == null || funcionario.getCargo().trim().isEmpty() || 
        funcionario.getSalario() <= 0){
            throw new IllegalArgumentException("Nome, cargo ou salario não podem ser nulos");
        } else {
            repository.save(funcionario); 
        }
        
    }
    
}
// repository.findById(id).orElseThrow(IDNotFoundException::new);
