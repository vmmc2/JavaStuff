interface Colecao{
    void inserir(Pessoa p);
    int tamanhoColecaoNaoNull();
}


abstract class Pessoa{
    //Atributos
    protected String nome;
    protected String cpf;

    //Construtor
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //Setters
    public abstract void setNome(String nome);
    public abstract void setCpf(String cpf);

    //Getters
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
}


class Aluno extends Pessoa{
    //Atributos
    protected String matricula;
    protected String curso;

    //Construtor
    public Aluno(String nome, String cpf, String matricula, String curso){
        super(nome, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
        return;
    }
    public void setCpf(String cpf){ 
        this.cpf = cpf;
        return;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
        return;
    }
    public void setCurso(String curso){
        this.curso = curso;
        return;
    }

    //Getters
    public String getMatricula(){
        return matricula;
    }
    public String getCurso(){
        return curso;
    }
}


class Professor extends Pessoa{
    //Atributos
    protected String formacao;
    protected String area;

    //Construtor
    public Professor(String nome, String cpf, String formacao, String area){
        super(nome, cpf);
        this.formacao = formacao;
        this.area = area;
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
        return;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
        return;
    }
    public void setFormacao(String formacao){
        this.formacao = formacao;
        return;
    }
    public void setArea(String area){
        this.area = area;
        return;
    }

    //Getters
    public String getFormacao(){
        return formacao;
    }
    public String getArea(){
        return area;
    }
}


class ColecaoVetor implements Colecao{
    //Atributos
    protected Pessoa[] dados;
    protected int capacity; 
    protected int curr;

    //Construtor
    public ColecaoVetor(){
        this.dados = new Pessoa[5];
        this.capacity = 5;
        this.curr = 0;
    }

    //Metodos
    public void inserir(Pessoa p){
        if(curr < capacity){
            dados[curr] = p;
            curr = curr + 1;
        }else{
            throw new RuntimeException("A colecao teve sua capacidade esgotada!");
        }
        return;
    }
    public int tamanhoColecaoNaoNull(){
        return (capacity - curr);
    }
    public String nomePessoasInseridas(){
        StringBuilder nomes = new StringBuilder("");
        for(int i = 0; i < curr; i++){
            if(i != curr - 1){
                nomes.append(dados[i].getNome() + ", ");
            }else{
                nomes.append(dados[i].getNome() + ".");
            }
        }
        return nomes.toString();
    }
}


public class Q5{
    public static void main(String args[]){
        ColecaoVetor cv1 = new ColecaoVetor();
        cv1.inserir(new Aluno("Julio", "345.908.324-01", "5423509", "Economia"));
        System.out.println("Qtd de vagas disponiveis: " + cv1.tamanhoColecaoNaoNull());
        cv1.inserir(new Aluno("Matias", "215.633.572-99", "1234567", "Direito"));
        System.out.println("Qtd de vagas disponiveis: " + cv1.tamanhoColecaoNaoNull());
        cv1.inserir(new Professor("Rosana", "190.901.413-17", "Letras", "Literatura Brasileira"));
        System.out.println("Qtd de vagas disponiveis: " + cv1.tamanhoColecaoNaoNull());
        System.out.println("Nomes das pessoas inseridas: " + cv1.nomePessoasInseridas());

        return;
    }
}
