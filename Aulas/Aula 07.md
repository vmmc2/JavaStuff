# Aula 07 - Interfaces

### Intro
* Interface define um padrão de acesso a um conjunto de serviços.

### Interfaces no contexto de Software
* Através do encapsulamento, os atributos e a implementação dos métodos de uma certa classe não são visíveis aos usuários da classe.
* Conhecendo-se apenas a __interface__ de uma classe, podemos utilizar seus objetos sem conhecer detalhes de implementação.
* __Uma interface contém os métodos disponíveis e suas respectivas assinaturas.__
* Além disso, existem casos nos quais existe a necessidade de se ter uma classe mas não querermos implementá-la.
  * Pode-se terceirizar a implementação, fornecendo como especificação, a interface desejada.
* __Exemplo:__ Criar um zoologico virtual que implementa alguns animais: Morcego, Zebra, Ornitorrinco.
```java
//Em uma interface, todos os métodos devem ser publicos e abstratos. (Não preciso colocar as keywords).
public interface Animal{
  void nascer();
  void passear();
  void dormir();
  double peso();
}

class Morcego implements Animal(){
  public void nascer(){
    System.out.println("Nasce um lindo morcego!");
  }
  public void passear(){
    System.out.println("Passeia um lindo morcego!");
  }
  public void dormir(){
    System.out.println("Dorme um lindo morcego!");
  }
  public double peso(){
    return 4.5;
  }
}
// Nada impede que novos métodos e atributos sejam criados em uma classe que implementa uma interface.
```
* Em cada arquivo deve existir no máximo uma classe pública.
* __Em Java, é permitido que uma classe implemente mais de uma interface. Separar as interfaces em questão por vírgulas. Se uma classe implementa uma interface, a classe deve implementar todos os métodos da interface.__
* Criando uma interface para armazenar contas bancárias de maneiras distintas:
```java
public interface RepositorioContas{
  void inserir(ContaAbstrata conta);
  ContaAbstrata procurar(String numero);
  void remover(String numero);
  void atualizar(ContaAbstrata conta);
  boolean existe(String numero);
}
```
