# Aula 02

### Intro
* Classes funcionam como "blueprints" para a criação de objetos.
* __Lembrando que um objeto é um valor em tempo de execução que possui tanto estado (atributos) como comportamento (métodos).__
* Observe um exemplo abaixo de criação de uma classe:
```java
public class Aula02{
  public static void main(String args[]){
    Horario h1 = new Horario(); //Toda vez que um objeto for ser criado em Java, devemos usar a keyword "new".
    //Importante ter em mente que quando vamos criamos um objeto e o atribuimos, como foi feito acima, estamos na verdade criando duas variaveis.
    //O objeto em si (criado usando a keyword "new", que fica armazenado na heap. E um ponteiro implicito h1, que ta armazenado na stack/pilha e que aponta para esse objeto presente na heap.
    return;
  }
}

class Horario{
  int hora;
  int minuto;
  int segundo;
  
  public String toString(){
    return hora + "h" + minuto + "m" + segundo + "s"; //Em Java, temos que quando concatenamos alguma coisa com String, esse "alguma coisa" vira uma String.
  }
}
```
* Quando queremos printar um objeto em Java usando "System.out.println()", devemos, na classe referente a esse objeto, implementar o metodo "toString()", responsavel por "criar" uma representacao em String do tal objeto.

### Java vs. Python
* Java: Linguagem estaticamente tipada. Espera que muitas coisas sejam definidas em tempo de compilação.
* Python: Linguagem dinamicamente tipada. Espera que muitas coisas sejam definidas em tempo de execução.
* __Em Python, é permitido criar uma classe completamente vazia (isto é, sem atributos e nem métodos). Dito isso, é permitido ao programador inserir novos atributos em tempo de execução. (Não sei se isso vale para métodos).__

### Construtores
* Um construtor é um método especial que é utilizado para criar instâncias de uma classe. Ou seja, é um método específico usado para criar objetos.
* No construtor, podemos passar parâmetros, os quais serão usados para atribuir valores a atributos do objeto em questão.
* Observe o exemplo a seguir de uma classe que faz uso de construtores:
```java
class Horario{
  int hora;
  int minuto;
  int segundo;
  
  Horario(int hora, int minuto, int segundo){
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
  }
  
  public String toString(){
    return this.hora + "h" + this.minuto + "m" + this.segundo + "s";
  }
}
```
* __Vale destacar que quando o programador não define um construtor em uma classe, Java, implicitamente, define um construtor padrão que não possui nenhum parâmetro e não faz nada.__
