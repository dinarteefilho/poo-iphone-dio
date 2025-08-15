# Desafio POO – Modelagem e Diagramação de um Componente iPhone

Este repositório contém a solução para o desafio de **Programação Orientada a Objetos** da [DIO](https://www.dio.me/), onde foi necessário modelar e implementar as funcionalidades básicas do iPhone de 2007.

O projeto foi desenvolvido em **Java** utilizando **interfaces** e **classes concretas** para representar as três principais funções:  
- Reprodutor Musical  
- Aparelho Telefônico  
- Navegador na Internet  

---

## Funcionalidades Implementadas

### **Reprodutor Musical**
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### **Aparelho Telefônico**
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### **Navegador na Internet**
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

---

## Diagrama UML

```mermaid
classDiagram
    direction LR

    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class IPhone {
        -String musicaAtual
        -String paginaAtual
        -String numeroChamando
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    IPhone ..|> ReprodutorMusical
    IPhone ..|> AparelhoTelefonico
    IPhone ..|> NavegadorInternet
````

---

## Estrutura de Pastas

```
src/
 ├── AparelhoTelefonico.java
 ├── IPhone.java
 ├── Main.java
 ├── NavegadorInternet.java
 └── ReprodutorMusical.java
```

---

## Como Executar

### Compilar

```bash
cd src
javac pooiphone/*.java
```

### Executar

```bash
java pooiphone.Main
```

---

## Exemplo de Saída

```
[MUSICA] Selecionada: Grandes coisas - Fernandinho
[MUSICA] Tocando: Grandes coisas - Fernandinho
[MUSICA] Pausado: Grandes coisas - Fernandinho
[TELEFONE] Ligando para (4002-8922)...
[TELEFONE] Acessando o Correio de Voz...
[TELEFONE] Encerrando chamada com (4002-8922)
[NAVEGADOR] Exibindo: https://github.com/dinarteefilho
[NAVEGADOR] Nova aba adicionada.
[NAVEGADOR] Atualizando: https://github.com/dinarteefilho
```

---

## Tecnologias Utilizadas

* Java 17+
* Paradigma Orientado a Objetos
* Interface e Implementação de Classe

---

## Autor

Desenvolvido por **Dinarte Filho**

