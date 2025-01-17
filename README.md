# Sistema Gerenciador de Locadora de Filmes

- Este projeto é um sistema de gerenciamento de locadora de filmes, desenvolvido em Java utilizando JavaFX para a interface gráfica. O sistema permite o cadastro e login de usuários, a listagem de filmes, o aluguel de filmes e o gerenciamento de sessões de usuário.

- Projeto final da disciplina de Linguagem de Programação II (IMD0040), desenvolvido pelos alunos: EMILLY MILLER MOREIRA, FLAWBERT LORRAN DA SILVA COSTA, MARIANA TIMBÓ DE OLIVEIRA

## Funcionalidades

- **Cadastro de usuário**: Os usuários podem se registrar no sistema com nome, CPF, e-mail e senha.
- **Login de usuário**: Permite que os usuários façam login utilizando seu e-mail e senha.
- **Visualização de filmes**: O sistema exibe uma lista de filmes categorizados por gênero, como ação, comédia, drama, etc.
- **Aluguel de filmes**: Os usuários podem alugar filmes, onde o preço é calculado com base no gênero do filme e nos dias de locação.
- **Gerenciamento de sessões**: O sistema mantém o usuário logado durante sua interação com o sistema até que ele faça logout.

## Estrutura de Diretórios

src/
├── com.ufrn.moviebox     # Contém a classe Main.java que inicializa a aplicação JavaFX e os controllers LoginController, RegisterController, etc.
├── DAO/                  # Contém as classes responsáveis pela persistência de dados (MovieDAO, usersDAO).
├── Enum/                 # Contém os enums para gêneros de filmes (Movie_genre).
├── models/               # Contém as classes que representam o domínio do sistema (User, Movie, Person, etc.).


## Dependências

- Java 11 ou superior
- JavaFX
- IntelliJ IDEA (ambiente de desenvolvimento utilizado)

## Como Rodar o Projeto

- Abra o projeto no IntelliJ IDEA.
- Certifique-se de que o JavaFX está configurado corretamente no seu IntelliJ IDEA. Se necessário, adicione as dependências do JavaFX.
- Execute o arquivo Main.java para iniciar a aplicação.

## Descrição das Classes

- **Main.java**: Classe principal que inicia a aplicação JavaFX e gerencia as mudanças de telas no sistema (login, registro, etc.).
- **MovieDAO.java**: Classe responsável por gerenciar a lista de filmes da locadora.
- **usersDAO.java**: Classe que gerencia os dados dos usuários, incluindo a persistência dos dados em um arquivo.
- **IService.java**: Interface que define o método calculatePrice para calcular o preço de aluguel de um filme.
- **Movie.java**: Representa um filme, contendo informações como título, gênero e preço de aluguel.
- **Person.java**: Representa uma pessoa, com atributos como nome e CPF, sendo a classe pai para User.
- **Session.java**: Gerencia a sessão de um usuário, mantendo o controle do usuário logado.
- **User.java**: Representa um usuário, herda de Person e contém informações como e-mail, senha e os filmes alugados.