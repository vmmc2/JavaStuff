# Aula 03 - Sobrecarga e pacotes.

### Sobrecarga
* Como visto anteriormente, Java permite que uma classe possa ter mais de um construtor dentro de si.
* __Entretanto, isso só é válido quando esses construtores possuem listas de parâmetros distintas. Ou seja, os construtores devem possui ou uma quantidade de parâmetros diferentes ou parâmetros de tipos diferentes ou podemos ter parâmetros em ordens diferentes. É importante mencionar que isso também vale para métodos dentro de uma classe.__
* Essa característica da linguagem Java se chama __sobrecarga__ e é um tipo de polimorfismo.

### Pacotes
* Basicamente é um sistema de nomes hierárquico e que permite esconder certas "coisas" de uma aplicação.
* Exemplo:
```java
java.util.ArrayList<Horario> listinha = new java.util.ArrayList<Horario>();
// A linha acima quer dizer o seguinte: Eu tenho uma pacote chamado "java", dentro do qual existe um pacote chamado "util", dentro do qual existe uma classe chamada "ArrayList".
listinha.add(h1);
listinha.add(h2);
listinha.add(h3);
```
