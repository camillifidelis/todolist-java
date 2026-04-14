<div align="center">
  <h1 align="center">
    <code>─── TODOLIST-JAVA ───</code>
  </h1>
  <p>API REST para gerenciamento de tarefas (To-do List) desenvolvida em Java <br> com Spring Boot, focando em segurança, persistência e boas práticas.</p>
</div>

🔗 **API em produção:** https://todolist-java-fnic.onrender.com

## 🛠 Tecnologias
- **Java 21**
- **Spring Boot 4**
- **Spring Data JPA**
- **Spring Security** (BCrypt para segurança de senhas)
- **H2 Database** (em memória, apenas para desenvolvimento/testes)
- **Docker** (Containerização da aplicação)
- **Render** (Plataforma de Cloud para o Deploy)

## ⚙️ Funcionalidades
- **CRUD completo de tarefas** com associação por usuário
- **Controle de acesso por autenticação Basic Auth**
- **Isolamento de dados por usuário** (cada usuário acessa apenas suas tarefas)
- **Validações de negócio** para datas e consistência dos dados
- **Criptografia de senha com BCrypt**

## 📌 Endpoints principais

### Usuários
POST /users → Criar usuário

### Tarefas
POST /tasks → Criar tarefa  
GET /tasks → Listar tarefas  
PUT /tasks/{id} → Atualizar tarefa

## 🐳 Docker
A aplicação foi preparada para rodar em containers, facilitando a portabilidade e o deploy. Para executar localmente via Docker:

### Gerar o arquivo .jar do projeto
```bash 
./mvnw clean package
```

### Construir a imagem Docker
docker build -t todolist-java .

### Iniciar o container
docker run -p 8080:8080 todolist-java

## 🚀 Deploy (Render)
O deploy foi realizado no Render seguindo estas etapas:

1. Configuração do Dockerfile na raiz do projeto.
2. Integração do repositório GitHub com o Render.
3. Deploy automatizado baseado na imagem Docker gerada no build.
4. Exposição da API em ambiente de produção seguro.

## 🟣 Como executar (Manual)

### 1) Clonar o repositório
```bash 
git clone [https://github.com/camillifidelis/todolist-java.git](https://github.com/camillifidelis/todolist-java.git)
```

```bash 
cd todolist-java
```

### 2) Rodar via Maven
```./mvnw spring-boot:run```

A API estará disponível em `http://localhost:8080`

### 🎓 Créditos e Certificação
Este projeto foi desenvolvido durante o evento Next Level Week (NLW) da Rocketseat, focando no ecossistema Spring Boot e práticas modernas de desenvolvimento.

- **Certificado de Conclusão**: [Visualizar Certificado](https://app.rocketseat.com.br/certificates/91de8307-a7be-43d9-98ec-791f98f0b5f6)
---
<div align="center">
  <picture>
    <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/camillifidelis/cami-projeto-mongo/main/assets/logo-dark.svg">
    <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/camillifidelis/cami-projeto-mongo/main/assets/logo-light.svg">
    <img alt="CamiDev Logo" src="https://raw.githubusercontent.com/camillifidelis/cami-projeto-mongo/main/assets/logo-dark.svg" width="300">
  </picture>
</div>
