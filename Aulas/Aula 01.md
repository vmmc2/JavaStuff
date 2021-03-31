# Aula 01 - Java para quem programa em C e Python

### Intro
* Java é uma linguagem estaticamente tipada. Ou seja, eu tenho que especificar o tipo de quase tudo: variáveis, funções, parâmetros, métodos, etc...
* Possui polimorfismo de coerção (Exemplo: Todo int pode ser representado por um double. Logo eu posso guardar um valor inteiro em uma variável do tipo double).
* __O ponto e vírgula ```;``` é obrigatório em Java.__
* __Quase tudo em Java é um objeto.__
* O que não é um objeto em Java é o que se chama de tipo primitivo. Exemplos de tipos primitivos: int, double, char, boolean. Os valores/variáveis de tais tipos não ficam armazenados na heap, mas sim na pilha.
* Java conta com um mecanismo conhecido como "Garbage Collector (GC)", que é responsável por realizar o gerenciamento automático de memória. Ou seja, o programador não tem mais que se preocupar com isso, como acontecia em C/C++.
* Em programas Java, as variáveis podem ficar armazenadas em 3 locais diferentes da memória. Vejamos quais são eles.
  * Variáveis globais -> Ficam armazenadas na região reservada da memória. Normalmente, esse tipo de variável faz uso da keyword "static". Seu tempo de vida dura enquanto a JVM estiver rodando.
  * Variáveis locais -> Ficam armazenadas na região de memória conhecida como stack. Esse tipo de variável dura enquanto o escopo estiver sendo executado. 
  * Objetos -> Ficam armazenadas na região de memória conhecida como heap. Esse tipo de variável (objeto) é criado por meio do uso da keyword "new".
