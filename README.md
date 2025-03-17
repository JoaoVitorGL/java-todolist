<h1 align="center">
  TODO List
</h1>

Java RESTful API para gerenciar tarefas (CRUD). Criada para o desafio de projeto do bootcamp decola tech Avanade 2025 (Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway).

## Tecnologias

- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI (Swagger)](https://springdoc.org/)
- [Railway](https://railway.com/)

## Práticas adotadas

- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Deploy
https://todo-list-production-4486.up.railway.app/swagger-ui/index.html

## API Endpoints

- Criar Tarefa 
```
$ http POST :8080/tasks

[
  {
    "title": "Title task 1",
    "description": "Desc task 1",
    "completed": false
  }
]
```

- Listar Tarefas
```
$ http GET :8080/tasks

[
  {
    "id": 1,
    "title": "Title task 1",
    "description": "Desc task 1",
    "completed": false
  }
]
```

- Ler Tarefa
```
$ http GET :8080/tasks/1

[
  {
    "id": 1,
    "title": "Title task 1",
    "description": "Desc task 1",
    "completed": false
  }
]
```

- Atualizar Tarefa
```
$ http PUT :8080/tasks/1

[
  {
    "title": "Task 1 Up",
    "description": Desc task 1 UP,
    "completed": true
  }
]
```

- Remover Tarefa
```
http DELETE :8080/tasks/1

[ ]
```
