=======
# Global Solution - Microservices e Web Engineering

**Curso:** Bacharelado em Sistemas de Informação   
**RA:** 99949  
**Tema:** Cadastro de Refúgiados em um centro comunitário


--- Programa desenvolvido para gerenciar o cadastro de refugiados em um centro comunitário, permitindo o registro eficiente das informações pessoais, status e necessidades dos refugiados atendidos. O sistema facilita a organização, o acompanhamento e o suporte oferecido, promovendo um atendimento mais ágil e humanizado.

## Tecnologias

- Java 17  
- Spring Boot  
- H2 Database  
- Swagger (OpenAPI)  

---

## Endpoints

- `POST /produtos` → Criar Produto  
- `PUT /produtos/{id}` → Atualizar Produto  
- `DELETE /produtos/{id}` → Deletar Produto  
- `GET /produtos/{id}` → Buscar Produto por ID  
- `GET /produtos` → Listar todos Produtos  

---
### Passos

```bash
git clone https://github.com/RaphaelBatizati/GlobalSolutionMS.git
cd GlobalSolutionMS
mvn spring-boot:run
```

### Pessoas
- Raphael Batizati rm99949
- Sergio Nogueira rm98577

## Acesso rápido

- API: http://localhost:8080/
- Swagger: http://localhost:8080/swagger-ui.html
- H2 Console: http://localhost:8080/h2-console
