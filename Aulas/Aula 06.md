# Aula 06 - Classes Abstratas

### Intro
* Novamente, nós usamos o conceito de herança presente em Java para:
  * Reutilizar trechos de código, deixando o nosso programa mais enxuto.
  * Criar uma hierarquia de classes (superclasses e subclasses) que faça sentido.

### Exemplo de modelagem de hierarquia de classes em Java
* Nesse exemplo, queremos modelar uma classe que represente uma ContaImposto, na qual, a cada retirada de um certo valor da poupança, é debitado também um valor extra calculado com base em um valor previamente definido chamado CPMF.
* Modelagem usando hierarquia de classes:
```java
public class ContaImpostoM extends Conta{
  private static final double CPMF = 0.001;
  
  public ContaImpostoM(String numero){
    super(numero);
  }
  
  public void debitar(double valor){
    double imposto = (valor * CPMF);
    super.debitar(valor + imposto);
  }
}
```
