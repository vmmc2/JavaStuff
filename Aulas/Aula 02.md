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

public class Horario{
  int hora;
  int minuto;
  int segundo;
  
  public String toString(){
    return hora + "h" + minuto + "m" + segundo + "s"; //Em Java, temos que quando concatenamos alguma coisa com String, esse "alguma coisa" vira uma String.
  }
}
```
* Quando queremos printar um objeto em Java usando "System.out.println()", devemos, na classe referente a esse objeto, implementar o metodo "toString()", responsavel por "criar" uma representacao em String do tal objeto.
