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
 
