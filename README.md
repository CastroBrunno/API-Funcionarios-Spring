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

## Estrutura de Diretórios

A estrutura de diretórios do projeto é a seguinte:

```bash
src/
 ├── main/
 │    ├── java/
 │    │    ├── com/
 │    │    │    └── exemplo/
 │    │    │        └── funcionarios/
 │    │    │            ├── config/
 │    │    │            │    └── SwaggerConfig.java
 │    │    │            ├── controller/
 │    │    │            │    └── FuncionariosController.java
 │    │    │            ├── exceptions/
 │    │    │            │    └── IDNotFoundException.java
 │    │    │            ├── model/
 │    │    │            │    └── Funcionario.java
 │    │    │            ├── repository/
 │    │    │            │    ├── FuncionariosRepository.java
 │    │    │            │    └── FuncionariosResponseDTO.java
 │    │    │            ├── service/
 │    │    │            │    └── FuncionariosService.java
 │    │    │            └── FuncionariosApplication.java
 │    └── resources/
 │         ├── application.properties
 │         └── static/
 │              └── swagger-ui/
 └── test/
      └── java/
           └── com/
               └── exemplo/
                   └── funcionarios/
                       └── FuncionariosApplicationTests.java


```

## Exemplos de Endpoints:

A seguir estão alguns exemplos de como utilizar os endpoints da API:

# Criar um novo funcionário

POST `/funcionarios`

```bash
{
  "nome": "João Silva",
  "cargo": "Desenvolvedor",
  "salario": 3500.00
}
```

# Listar Todos os Funcionários
GET `/funcionarios`

# Buscar Funcionário por ID
GET `funcionario/{id}`

# Atualizar um Funcionário
PUT `funcionario/{id}`

```bash
{
  "nome": "João Silva",
  "cargo": "Senior Developer",
  "salario": 4500.00
}

```

# Excluir um Funcionário
DELETE `/funcionario`

## Contribuindo

Se você deseja contribuir para este projeto, fique à vontade para criar um fork do repositório, realizar as alterações e enviar um pull request.



