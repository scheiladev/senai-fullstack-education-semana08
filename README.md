# SENAI Fullstack [Education]

## Resolução dos exercícios da Semana 8

### M1S08 | Ex 1 - Spring Initializer e repositório no GitHub

Crie um projeto Spring para gerenciamento de uma instituição de ensino.</br>
**Obs:** Fique à vontade para dar nome o projeto.

**Atenção!**</br>
Não esqueça de utilizar seus commits após o desenvolvimento.

### M1S08 | Ex 2 - Alunos

A primeira implementação do projeto:

Crie uma classe _Aluno_.
A classe deve conter ao menos os atributos:

- ID (sequencial)
- Nome
- Data de nascimento

**!!! IMPORTANTE !!!**

1. A classe deve conter um método estático para controlar a sequencia dos IDs.
2. A classe deve estar devidamente encapsulada.
3. O atributo ID não deve possuir um método "`set`".

### M1S08 | Ex 3 - Cursos

O próximo passo:

Crie uma classe _Cursos_.
A classe deve conter ao menos os atributos:

- ID (sequencial)
- Nome
- Descrição
- Carga Horária

**!!! IMPORTANTE !!!**

1. A classe deve conter um método estático para controlar a sequencia dos IDs.
2. A classe deve estar devidamente encapsulada.
3. O atributo ID não deve possuir um método "`set`".

### M1S08 | Ex 4 - Service: Alunos

Com todas as nossas classes modelo criadas:

Crie uma classe _Service_ para manter a regra de negócio dos alunos:

- Cadastro de alunos
- Consulta de todos os alunos

**!!! Atenção !!!**</br>
Para concluir o exercício será necessário realizar adequações na classe _Aluno_:

- Utilize um atributo estático e privado para o armazenamento dos _alunos_ cadastrados
  - crie um método "`get`"
  - crie um método responsável pela inclusão

### M1S08 | Ex 5 - Service: Cursos

Seguindo com as classes _Service_:

Crie uma classe _Service_ para manter a regra de negócio dos cursos:

- Cadastro de cursos
- Consulta de todos os cursos

**!!! Atenção !!!**</br>
Para concluir o exercício será necessário realizar adequações na classe _Curso_:

- Utilize um atributo estático e privado para o armazenamento dos _cursos_ cadastrados
  - crie um método "`get`"
  - crie um método responsável pela inclusão

### M1S08 | Ex 6 - Controller: Alunos

Com todas os services criados:

Crie uma classe _Controller_ para os _alunos_.
O controlador deve conter métodos para:

- Cadastro de novos alunos **(POST)**
- Consulta de todos os alunos **(GET)**

**!!! Atenção !!!**</br>
Utilize a injeção de dependências para usar a classe _Service_ de alunos

### M1S08 | Ex 7 - Controller: Cursos

Assim como foi criado para os Alunos, faça o mesmo com os Cursos.

Crie uma classe _Controller_ para os _cursos_.
O controlador deve conter métodos para:

- Cadastro de novos cursos **(POST)**
- Consulta de todos os cursos **(GET)**

**!!! Atenção !!!**</br>
Utilize a injeção de dependências para usar a classe _Service_ de cursos

### M1S08 | Ex 8 - Matricular alunos

No _Controller_ de _cursos_ crie um novo método para matricular alunos no curso
O método deve receber:

- ID do curso no _Path Param_;
- ID do aluno no _RequestBody_.

Para concluir o exercício será necessário realizar adequações no projeto:

- Na classe _Curso_:
  - crie um atributo para representar uma lista de alunos matriculados;
  - utilize encapsulamento.
- No _Service_ de alunos:
  - crie um método para encontrar um _aluno_ usando seu ID.
- No _Service_ de cursos:
  - crie um método para encontrar um _curso_ usando seu ID;
  - crie um método realizar a matrícula (inclusão de um _aluno_ na lista de alunos).

**Obs:** A regra de negócios deverá sempre ser utilizada no _Service_, não utilize o controlador para realizar buscas ou inserções.