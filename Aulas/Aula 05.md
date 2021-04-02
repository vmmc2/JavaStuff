# Aula 05 - Ligação Dinâmica e Sobrescrita de Métodos

### Intro
* Em Java, uma subclasse pode ter __apenas uma__ superclasse. (Diferente do que acontece em C++, onde uma subclasse pode ter mais de uma superclasse).
* __Além disso, no construtor da subclasse, devemos chamar, de maneira explicíta, o construtor da superclasse.__ Se não fizermos isso, Java implicitamente faz o seguinte:
```java
Soma(Expressao primeiro, Expressao segundo){ //Soma é uma subclasse da superclasse Expressao
  super(); //Isso nao tem problema, desde que exista um construtor default/padrão na superclasse.
  this.primeiro = primeiro;
  this.segundo = segundo;
}
```
* Se for usar "super", isso tem que ser a primeira coisa a ser chamada no construtor da subclasse.
* __Além disso, eu só preciso chamar "super" explicitamente no construtor da subclasse, se a superclasse só possuir construtores que recebem parâmetros.__
* Conversão de Tipos de Subclasses e Superclasses. Observe o exemplo abaixo:
```java
public class Expressoes{
  public static void main(String args[]){
    Expressao exp = new Soma(new Valor(42), new Mult(new Valor(10), new Valor(3))); //Isso é valido, pois é possível atribuir um valor de uma subclasse a uma variável cujo tipo é sua superclasse.
    //Nao da para fazer: Soma sominha = exp; // Pois, o compilador vai checar os tipos das variáveis, e não o tipo da variável e o tipo do valor guardado na outra variável.
    if(exp instanceof Soma){ //Operador que checa se o valor guardado na variável exp é do tipo Soma
      Soma sominha = (Soma) exp; //Um Cast não é uma conversão de tipo. Você tá garantindo ao compilador que tem certeza que o valor guardado em exp é do tipo Soma.
      System.out.println(sominha.avaliar());
    }
    System.out.println(exp.avaliar());
    
    return;
  }
}
```
* Ainda no exemplo acima, quando chamamos o metodo ```.avaliar()```, Java só vai definir qual das implementações desse método utilizar __em tempo de execução__. E a linguagem Java não vai usar o tipo da classe/variável para determinar isso. __Java usa o tipo do objeto/valor em questão.__ Ou seja, no exemplo acima, quando chamamos ```sominha.avaliar()```, estamos chamando a implementação ```.avaliar()``` de Soma e não de Expressao. Isso porque, em Expressao, temos um objeto/valor do tipo Soma.
