# Tecnologias 👨🏻‍💻

## Arquitetura: Micro services
### Dependencias
- Java 17 (Padrão Spring Initializr)
- Spring boot 3.3.2 (Padrão Spring Initializr)
- DevTools (Facilitar setup no ambiente de desenvolvimento dando Restart no servidor a cada modificação feita)
- Lombok (Facilitar criação de métodos acessores e construtores quando necessário)
- Spring Web (Para usar uma API REST)
- Open API (Habilitar Swagger)
- Spring Data JPA
- GIT (Controle de versão do projeto)
- IDE's (Intellij, VS Code)
- Postman (Testes da API)
- PgAdmin (Consultar dados)
- Docker (Para subir os containers, foi criado uma network, colocamos os containers Postgres e PgAdmin na mesma rede)- 
  -- docker network create --driver bridge my-web
  -- docker run --name postgres-fiap -p 5433:5432 -e POSTGRES_PASSWORD=root -d postgres
  -- docker run --name my-pgadmin --network=my-web -p 5480:80 -e PGADMIN_DEFAULT_EMAIL=eliteinfa@gmail.com -e PGADMIN_DEFAULT_PASSWORD=postgres -d dpage/pgadmin4


# Decisões ✍🏻

Arquitetura de micro-service: Como é um sistema que precisa ser escalável, separar algumas responsabilidades, utilizar mensageria para processamento assíncrono nos permite ser mais performático em certos casos. Como esse sistema dificilmente haverá concorrência, justamente porque usuários diferentes não acessarão os mesmos recursos, a API foi criada com spring boot para compor a nova arquitetura da empresa de paquímetros. No caso de uma implementação em cloud, conseguiríamos criar load balancers e distribuir as cargas entre nossos micro serviços, mas como não é o foco de implantação em nuvem, seguimos.

Tratamentos de erros: Os erros são tratados via exceptions handler e algumas propriedades adicionadas a todos micro serviços que não deixa a aplicação cuspir o trace de erro.