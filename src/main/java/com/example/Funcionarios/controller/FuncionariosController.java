package com.example.Funcionarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Funcionarios.dto.FuncionariosResponseDTO;
import com.example.Funcionarios.model.Funcionario;
import com.example.Funcionarios.repository.FuncionariosRepository;
import com.example.Funcionarios.service.FuncionariosService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {
    //Local onde ira ficar a parte de controle do crud

    @Autowired
    private FuncionariosRepository repository;
    @Autowired
    private FuncionariosService service;

    @Operation(description = "Lista todos os funcionarios do banco de dados.")
    @GetMapping
    public List<FuncionariosResponseDTO> findAll() {
        List <FuncionariosResponseDTO> funcionarioList = repository.findAll().stream().map(FuncionariosResponseDTO::new).toList();
        return funcionarioList;
    }

    @Operation(description = "Procura um funcionario atravez de seu ID.")
    @GetMapping("/{id}")
    public Funcionario findById(@PathVariable Long id) {
        return service.findByIdService(id); 
    }

    @Operation(description = "Cadastra um novo funcionario, não é necessario inserir um ID no body.")
    @PostMapping
    public ResponseEntity<String> save(@RequestBody Funcionario funcionario) {
        service.cadastrarFuncionario(funcionario);
        System.out.println("cadastrado");
        return ResponseEntity.status(HttpStatus.CREATED).body("Funcionario cadastrado com sucesso!");
        // repository.save(funcionario);
    }

    @Operation(description = "Deleta um usuario atravez do seu ID.")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        service.deletarFuncionario(id);
        return ResponseEntity.status(HttpStatus.OK).body("Funcionario deletado!");
        // repository.deleteById(id);
    }

    @Operation(description = "Atualiza um funcionario, precisando fornecer o ID do mesmo que sera atualizado, não precisando fornecer o ID no body.")
    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Funcionario funcionario){
        service.atualizarFuncionario(id, funcionario);
        return ResponseEntity.status(HttpStatus.OK).body("Funcionario atualizado!");  
    }


    


}
