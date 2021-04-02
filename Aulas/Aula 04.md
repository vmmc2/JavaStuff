# Aula 04 - Herança em Java

### Intro
* Herança é um mecanismo presente na linguagem Java que possui dois objetivos principais:
  * __Permitir a reusabilidade de código.__
  * __Tornar o código mais escalável. Isto é, fazer com que seja mais fácil estender o programa.__
* Podemos dizer que uma "classe A" herda de uma "classe B". Ou que uma "classe A" é uma subclasse da "classe B". Ou ainda, que a "classe A" estende a "classe B".
* __Em Java, temos 4 níveis de visibilidade. São eles (do mais restrito ao mais livre): "private" -> "package" (não tem nenhum modificador) -> "protected" -> "public".
* __Mas o que queremos dizer quandos falamos que uma "classe A" herda de uma "classe B"? Queremos dizer que, todos os membros public/protected da "classe B" são visíveis para a "classe A".__
* __IMPORTANTE: Se a subclasse estiver no mesmo pacote que a superclasse, a subclasse consegue "ver" os membros sem modificadores da superclasse.__
* Herança de classes possui a propriedade transitiva.
* Conforme visto na aula anterior, quando estamos trabalhando com uma única classe, podemos ter mais de um construtor (alguns mais específico e um mais geral). Vimos que um construtor mais específico, ao ser chamado, pode, dentro de sua implementação, chamar o construtor mais geral por meio da keyword ```this```. 
* __Um raciocínio semelhante se aplica à questão de subclasses e superclasses. Nesse caso, entretanto, ao invés de chamar um construtor dentro da subclasse em questão, chamamos um construtor da superclasse. Para isso, fazemos uso da keyword "super".
* __Quando estamos falando em Herança, além de termos reutilização de código também temos reutilização de tipo. Dito isso, se uma "classe B" herda de uma "classe A", então essa "classe B" tem o mesmo tipo da "classe A".__
