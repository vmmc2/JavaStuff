# Aula 06 - Classes Abstratas

### Intro
* Novamente, nós usamos o conceito de herança presente em Java para:
  * Reutilizar trechos de código, deixando o nosso programa mais enxuto.
  * Criar uma hierarquia de classes (superclasses e subclasses) que faça sentido.

### Exemplo de modelagem de hierarquia de classes em Java
* Nesse exemplo, queremos modelar uma classe que represente uma ContaImposto, na qual, a cada retirada de um certo valor da conta, é debitado também um valor extra calculado com base em um valor previamente definido chamado CPMF.
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

### Subclasses e Comportamento
* Objetos da subclasse __devem__ se comportar como os objetos da superclasse.
  * Afinal de contas, queremos usar os objetos da subclasse onde os objetos da superclasse são utilizados.
* Redefinições de métodos devem preservar o comportamento (semântica) do método original.
  * No que diz respeito ao comportamento (e atributos) herdado.
* Grande impacto sobre manutenção/evolução de software.
* Considerando apenas o retorno do método ```m```, as duas opções a seguir são equivalentes? Em que contextos?
```java
double m(Conta c){
 c.creditar(10);
 c.debitar(10);
 return c.getSaldo();
}

double m(Conta c){
 return c.getSaldo();
}
```
* Deveria ser possível raciocinar sobre o código usando-se apenas a definição dos tipos das variáveis envolvidas (Conta).
* O comportamento do código deveria ser independente do tipo do objeto (Conta, ContaEspecial, ContaImposto) associado a uma dada variável em tempo de execução. Não pode haver mudança na semântica do método.
* __ContaImpostoM muda a semântica do método ```debitar``` e, se herdar de Conta, quebra a noção de subtipos!!__ 
* Uma possível solução é redefinir a estrutura hierárquica das classes envolvidas na hierarquia.
* Qual seria, de fato, a alternativa para resolver esse problema?
  * __O que existe de comum entre ```Conta``` e ```ContaImposto```?__
    --> Vamos criar uma nova classe (acima dessas duas na hierarquia) que contenha essa parte comum.
    --> ```Conta``` e ```ContaImposto``` devem herdar dessa nova classe criada.
  * __Atenção: O método ```debitar``` é diferente nas duas classes:__
    --> Mas ambas as contas devem permitir debitar um valor...
* Nova implementação, fazendo uso de classes abstratas:
```java
public abstract class ContaAbstrata{
 private String numero;
 private double saldo;
 
 public ContaAbstrata(String numero){
  this.numero = numero;
  this.saldo = 0.0;
 }
 public void creditar(double valor){
  this.saldo = this.saldo + valor;
  return;
 }
 public double getSaldo(){
  return this.saldo;
 }
 public String getNumero(){
  return this.numero;
 }
 protected void setSaldo(double saldo){
  this.saldo = saldo;
 }
 public abstract void debitar(double valor);
}
```
* __O método abstrato não tem implementação, mas:__
  * Permite programar (não executar), chamando o método da classe abstrata (na classe ```Banco```, por exemplo).
  * Obriga que as subclasses concretas implementem o método.
* Não dá para criar um objeto a partir de uma classe abstrata.

### Mais sobre Classes Abstratas
* Possibilita herança de código preservando comportamento (semântica).
  * Não do método ```debitar```, claro.
* Métodos Abstratos:
  * Geralmente existe pelo menos um desses métodos em uma classe abstrata.
  * São implementados nas subclasses.
* Não se cria objetos a partir de classes abstratas:
  * Mas devem ter construtores para reuso.
  * Se necessário, métodos ```protected``` para serem acessados nas subclasses.
