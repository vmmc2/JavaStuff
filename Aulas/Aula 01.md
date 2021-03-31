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
* __Em Java, para criar uma função que não é um método, use a keyword "static". A keyword "static" permite que possamos executar um método de uma classe sem que tenhamos que criar um objeto dessa classe antes. A gente executa esse método da seguinte forma: "nomeDaClasse.nomeDoMetodoStatic".__
* __Convenções adotadas na nomenclatura:__
  * Nomes de classes sempre começam com letra maiúscula.
  * Nomes de funções começam com letra minúsculas e adotam a convenção camelCase.
  * Nomes de constantes são sempre em letras maiúsculas e separadas por underline, se necessário.
* __Em Java, a alocação de arrays de tamanho fixo é feita de forma dinâmica. Ou seja, em Java, arrays são objetos.__
* __A função "System.out.println()" pode receber qualquer coisa que seja transformável em uma String. Se passarmos um objeto cuja transformação em String não foi especificada, a função irá apenas "printar" a localização desse objeto na memória.__
