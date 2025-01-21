package com.example.Funcionarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Funcionarios.exceptions.IDNotFoundException;
import com.example.Funcionarios.model.Funcionario;
import com.example.Funcionarios.repository.FuncionariosRepository;

@Service
public class FuncionariosService {
    @Autowired
    private FuncionariosRepository repository;
    

    public ResponseEntity<String> cadastrarFuncionario(Funcionario funcionario) {
        if (funcionario.getNome() == null || funcionario.getNome().trim().isEmpty() || 
        funcionario.getCargo() == null || funcionario.getCargo().trim().isEmpty() || 
        funcionario.getSalario() <= 0){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nome, cargo ou salario não podem ser nulos");
            // throw new IllegalArgumentException("Nome, cargo ou salario não podem ser nulos");
            
        } else {
            repository.save(funcionario); 
            return null;
        }
        
    }

    public void deletarFuncionario(Long id){
        repository.findById(id).orElseThrow(IDNotFoundException::new);

        repository.deleteById(id);
    }

    public void atualizarFuncionario(Long id, Funcionario funcionario){
        Funcionario funcionarioExistente = repository.findById(id).orElseThrow(IDNotFoundException::new);
        
        funcionarioExistente.setNome(funcionario.getNome());
        funcionarioExistente.setCargo(funcionario.getCargo());
        funcionarioExistente.setSalario(funcionario.getSalario());

        repository.save(funcionarioExistente);
    }
    
}
