import java.util.*;

enum IdentidadeDeGenero{
    CISGENERO, TRANSGENERO, GENERO_FLUIDO, NAO_BINARIO, NAO_INFORMADA;
}

class Pessoa{
    //Atributos protegidos
    protected String nome;
    protected int idade;
    protected String grauDeEscolaridade;
    protected IdentidadeDeGenero identidadeDeGenero;
    protected String orientacaoSexual;
    protected String sexoBiologico;

    //Construtores
    public Pessoa(){
        this.nome = "Nome nao informado";
        this.idade = -1;
        this.grauDeEscolaridade = "Grau de escolaridade nao informado";
        this.identidadeDeGenero = IdentidadeDeGenero.NAO_INFORMADA;
        this.orientacaoSexual = "Orientacao sexual nao informada";
        this.sexoBiologico = "Sexo biologico nao informado";
    }
    public Pessoa(String nome, int idade, String grauDeEscolaridade, IdentidadeDeGenero identidadeDeGenero, String orientacaoSexual, String sexoBiologico){
        this.nome = nome;
        this.idade = idade;
        this.grauDeEscolaridade = grauDeEscolaridade;
        this.identidadeDeGenero = identidadeDeGenero;
        this.orientacaoSexual = orientacaoSexual;
        this.sexoBiologico = sexoBiologico;
    }
    //Getters
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getGrauDeEscolaridade(){
        return this.grauDeEscolaridade;
    }
    public IdentidadeDeGenero getIdentidadeDeGenero(){
        return this.identidadeDeGenero;
    }
    public String getOrientacaoSexual(){
        return this.orientacaoSexual;
    }
    public String getSexoBiologico(){
        return this.sexoBiologico;
    }
    //Setters
    public void setNome(String nome){
        this.nome = nome;
        return;
    }
    public void setIdade(int idade){
        this.idade = idade;
        return;
    }
    public void setGrauDeEscolaridade(String grauDeEscolaridade){
        this.grauDeEscolaridade = grauDeEscolaridade;
        return;
    }
    //Metodos
    public void dormir(){
        System.out.println(this.nome + " foi dormir.");
        return;
    }
    public void cagar(){
        System.out.println(this.nome + " foi fazer o numero 2.");
        return;
    }
    public void comer(){
        System.out.println(this.nome + " foi comer.");
        return;
    }
    public void estudar(){
        System.out.println(this.nome + " foi estudar.");
        return;
    }
    public void viver(){
        System.out.println(this.nome + " foi viver.");
        return;
    }
    public void sobreviver(){
        System.out.println(this.nome + " foi sobreviver.");
        return;
    }
    public void trabalhar(){
        System.out.println(this.nome + " foi trabalhar.");
        return;
    }
    public String toString(){ //Metodo apenas para debuggar.
        String s1 = "Nome: " + this.nome + "\n";
        String s2 = "Idade: " + this.idade + "\n";
        String s3 = "Grau de Escolaridade: " + this.grauDeEscolaridade + "\n";
        String s4 = "Identidade de Genero: " + this.identidadeDeGenero + "\n";
        String s5 = "Orientacao Sexual: " + this.orientacaoSexual + "\n";
        String s6 = "Sexo Biologico: " + this.sexoBiologico;
        return (s1 + s2 + s3 + s4 + s5 + s6);
    }
}

public class Q3{
    public static void main(String args[]){
        Pessoa p1 = new Pessoa();
        System.out.println(p1);
        System.out.println(" ");
        p1.setNome("Marco");
        p1.setIdade(40);
        p1.setGrauDeEscolaridade("Ensino Medio Completo");
        System.out.println(p1);
        p1.comer();
        p1.dormir();
        p1.estudar();

        System.out.println("----------------------------------------");

        Pessoa p2 = new Pessoa("Luffy", 19, "Ensino Fundamental Completo", IdentidadeDeGenero.CISGENERO, "Heterossexual", "Homem");
        System.out.println(p2);
        p2.setIdade(20);
        System.out.println(" ");
        System.out.println(p2);
        p2.viver();
        p2.trabalhar();
        p2.cagar();
        p2.sobreviver();

        return;
    }
}
