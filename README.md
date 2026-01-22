# TaskFlow API (Java + Spring Boot)

API REST simples para gerenciamento de tarefas, construída em **Java 17** com **Spring Boot**.  
Documentação automática via **Swagger (OpenAPI)**.

## Funcionalidades
- Health check: `GET /health`
- Listar tarefas (em memória): `GET /tasks`
- Criar tarefa (em memória): `POST /tasks`

## Stack
- Java 17
- Spring Boot (Web)
- Maven
- Swagger / OpenAPI (springdoc)

## Como rodar
No Windows (PowerShell):

```powershell
.\mvnw.cmd spring-boot:run


### Quick copy (para copiar tudo)
```text
A aplicação iniciará em:
http://localhost:8080

Swagger UI:
http://localhost:8080/swagger-ui.html

Observações:
- As tarefas são armazenadas apenas em memória (sem banco de dados).
- Projeto criado com fins educacionais para estudo de Spring Boot e APIs REST.
