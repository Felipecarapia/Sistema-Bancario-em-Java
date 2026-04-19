# Sistema Bancário em Java

Projeto desenvolvido com o objetivo de praticar **Programação Orientada a Objetos (POO)** e estruturas de dados em Java, simulando operações básicas de um sistema bancário via terminal.

---

## Funcionalidades

* Criar conta bancária
* Listar contas cadastradas
* Selecionar conta pelo número
* Depositar valores
* Sacar valores
* Consultar saldo
* Validação de conta existente
* Tratamento de exceções

---

## Conceitos aplicados

Este projeto foi desenvolvido aplicando:

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Estrutura de dados:

  * `List` (`ArrayList`)
  * `Map` (`HashMap`)
* Estruturas de controle (`if/else`, `while`)
* Tratamento de exceções (`try/catch`)
* Entrada de dados com `Scanner`

---

## Estrutura do projeto

```plaintext
bancojava/
│
├── model/
│   └── Conta.java
│
├── service/
│   └── Banco.java
│
├── app/
│   └── Main.java
```

---

## Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/felipecarapia/sistema-bancario-java.git
```

2. Acesse a pasta do projeto:

```bash
cd sistema-bancario-java
```

3. Compile o projeto:

```bash
javac app/Main.java
```

4. Execute:

```bash
java app.Main
```

---

## Exemplo de uso

Menu principal:

```plaintext
1 - Criar Conta  
2 - Listar Contas  
3 - Sair  
```

Menu de operações:

```plaintext
1 - Depositar  
2 - Sacar  
3 - Ver saldo  
4 - Sair  
```

---

## Objetivo

O objetivo deste projeto é consolidar conhecimentos fundamentais em Java, com foco em lógica de programação, organização de código e aplicação prática de conceitos de POO.

---

## Próximas melhorias

* [ ] Persistência de dados (arquivo ou banco de dados)
* [ ] Interface gráfica (GUI)
* [ ] API REST com Spring Boot
* [ ] Melhor tratamento de entrada de dados

---

## Autor

Desenvolvido por **Felipe Carapia**

LinkedIn: https://www.linkedin.com/in/felipe-carapi%C3%A1-924064274/
GitHub: https://github.com/felipecarapia

---

## Considerações finais

Projeto desenvolvido com foco em aprendizado e evolução prática em Java.
Aberto a melhorias e feedbacks.
