# Cadastro de Funcionários - Sistema com Java Spring Boot

Este projeto tem como objetivo a implementação de um sistema de cadastro de funcionários com as operações básicas de CRUD (Create, Read, Update, Delete) utilizando Java, Spring Boot, JPA (Java Persistence API) e PostgreSQL como banco de dados. Além disso, o projeto integra o Swagger para documentação e testes da API.

## Funcionalidades

O sistema permite as seguintes operações sobre os dados dos funcionários:

- **Criar (Create)**: Adicionar um novo funcionário ao sistema.
- **Ler (Read)**: Visualizar informações de todos os funcionários cadastrados ou um funcionário específico.
- **Atualizar (Update)**: Modificar as informações de um funcionário existente.
- **Excluir (Delete)**: Remover um funcionário do sistema.

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Framework**: Spring Boot
- **Persistência de Dados**: JPA (Hibernate)
- **Banco de Dados**: PostgreSQL
- **Documentação e Testes da API**: Swagger
- **Estrutura de Dados**: PostgreSQL (relacional)

## Estrutura do Projeto

O projeto está organizado de maneira clara e modular, facilitando o entendimento e a manutenção. Abaixo estão os componentes principais do sistema:

- **Modelo Funcionario**: Classe que representa os dados do funcionário, com os atributos `id`, `nome`, `cargo`, `salario`, etc. Inclui validações básicas.
  
- **Repositório (Repository)**: Interface que estende `JpaRepository`, proporcionando métodos para as operações CRUD no banco de dados.
  
- **Serviço (Service)**: Camada de lógica de negócio que implementa as regras do CRUD, delegando as operações ao repositório.

- **Controlador (Controller)**: Classe que expõe as APIs REST, utilizando o Spring MVC para gerenciar as requisições HTTP.

- **Swagger Config**: Configuração do Swagger para gerar automaticamente a documentação da API e permitir testes interativos.

- **Aplicação Principal**: Classe com o método `main` para inicializar o Spring Boot.

## Como Rodar o Projeto

Para executar o projeto, siga os seguintes passos:

### 1. Clone este repositório:

```bash
git clone https://github.com/seuusuario/cadastro-funcionarios.git
```

### 2. Navegue até a pasta do projeto:

```bash
cd API-Funcionarios-Spring
```

### 3. Configure o Banco de Dados:

- Crie um banco de dados no PostgreSQL chamado `funcionarios`.
- Defina as credenciais no arquivo `application.properties`.

```bash
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/funcionarios
spring.datasource.username=seuusername
spring.datasource.password=seupassword
spring.jpa.hibernate.ddl-auto=update
```

### 4. Compile e execute o projeto:

- Para compilar e rodar o projeto, use o comando:

```bash
./mvnw spring-boot:run
```

- Ou se preferir, execute o comando meaven:

```bash
mvn spring-boot:run
```

### 5. Acesse a API:

- A API está disponivel em `http://localhost:8080.`
- Você pode acessar a documentação interativa da API gerada pelo Swagger em `http://localhost:8080/swagger-ui.html.`


