# Desafio de Código: Gerenciador de Heróis

## Descrição do Desafio

O desafio consiste em criar um sistema simples para gerenciar heróis em uma aventura. A tarefa é desenvolver uma classe `Hero` que represente um herói com as propriedades de nome, idade e tipo. O tipo pode ser "mago", "guerreiro", "monge" ou "ninja". A classe deve incluir um método chamado `atacar` que retorna uma mensagem sobre o tipo de ataque baseado no tipo do herói. A saída deve ser formatada de maneira a exibir uma mensagem indicando qual tipo de herói atacou e qual ataque foi utilizado.

Além disso, é necessário criar uma classe `Main` que:
1. Solicita ao usuário o tipo, nome e idade do herói.
2. Cria uma instância da classe `Hero` com as informações fornecidas.
3. Exibe a mensagem formatada com base no tipo de ataque retornado pelo método `atacar`.

## Diagrama do Sistema

```mermaid
graph TD
    A[Desafio de Código] --> B[Classe Hero]
    B --> C[Propriedades]
    C --> C1[nome]
    C --> C2[idade]
    C --> C3[tipo]
    
    B --> D[Método atacar]
    D --> D1[Retorna mensagem baseada no tipo]
    
    A --> E[Classe Main]
    E --> F[Entrada do Usuário]
    F --> F1[tipo]
    F --> F2[nome]
    F --> F3[idade]
    
    E --> G[Criação do Herói]
    G --> B
    
    E --> H[Exibição da Mensagem]
    H --> H1["o {tipo} atacou usando {ataque}"]

    style A fill:#f9f,stroke:#333,stroke-width:4px
    style B fill:#ffcccb,stroke:#333,stroke-width:2px
    style C fill:#cfc,stroke:#333,stroke-width:2px
    style D fill:#cfc,stroke:#333,stroke-width:2px
    style E fill:#add8e6,stroke:#333,stroke-width:2px
    style F fill:#cfc,stroke:#333,stroke-width:2px
    style G fill:#cfc,stroke:#333,stroke-width:2px
    style H fill:#cfc,stroke:#333,stroke-width:2px

