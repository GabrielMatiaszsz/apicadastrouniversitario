Este é um projeto para gerenciar informações de alunos, incluindo criação, leitura, atualização e
 exclusão de registros (CRUD). A aplicação foi construída utilizando **Spring Boot** no backend e
 **React** no frontend.
 
 ## Tecnologias Utilizadas- **Backend**: Java, Spring Boot, Spring Data, MongoDB
  ## Pré-Requisitos
 Antes de começar, certifique-se de que você tem o seguinte instalado em sua máquina:- [Java 17 ou superior](https://adoptopenjdk.net/)- [Node.js e NPM](https://nodejs.org/)- [MongoDB](https://www.mongodb.com/try/download/community) ou [MongoDB
 Atlas](https://www.mongodb.com/cloud/atlas) para o banco de dados- [IDE recomendada para Java](https://spring.io/tools) (IntelliJ IDEA, Eclipse, etc.)

 ## Como Rodar o Backend
### Passo 1: Baixe o código do repositório
 Clone este repositório para a sua máquina:
 ```bash
 git clone https://github.com/seuusuario/seuprojeto.git
 ```
 ### Passo 2: Configure o MongoDB
 Caso esteja utilizando o **MongoDB local**, inicie o serviço do MongoDB na sua máquina. Se
 estiver usando o **MongoDB Atlas**, obtenha a URL de conexão.
 No arquivo `src/main/resources/application.properties`, defina a URL de conexão com o banco de
 dados:
 ```properties
 spring.data.mongodb.uri=mongodb://localhost:27017/seu_banco_de_dados
 ```
 ### Passo 3: Execute o Backend
 1. Vá para o diretório do backend do projeto.
 2. Compile e execute o backend com o Maven ou diretamente com o Spring Boot:
 ```bash
 ./mvnw spring-boot:run
```
 Isso fará o servidor Spring Boot iniciar e estará rodando em `http://localhost:8080`
