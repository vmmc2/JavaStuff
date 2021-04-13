class Senha{
    //Atributos
    protected String senhaAlfanumerica;
    protected long senhaNumerica;

    //Construtor
    protected Senha(String senhaAlfanumerica, long senhaNumerica){
        this.senhaAlfanumerica = senhaAlfanumerica;
        this.senhaNumerica = senhaNumerica;
    }

    //Getters
    protected String getSenhaAlfanumerica(){
        return this.senhaAlfanumerica;
    }
    protected long getSenhaNumerica(){
        return this.senhaNumerica;
    }

    //Setters
    protected void setSenhaAlfanumerica(String senhaAlfanumerica){
        this.senhaAlfanumerica = senhaAlfanumerica;
        return;
    }
    protected void setSenhaNumerica(long senhaNumerica){
        this.senhaNumerica = senhaNumerica;
        return;
    }
}

class Conta{
    //Atributos
    protected String agencia;
    protected String numeroDeIdentificacao;
    protected Senha senha;

    //Construtor
    protected Conta(String agencia, String numeroDeIdentificacao, Senha senha){
        this.agencia = agencia;
        this.numeroDeIdentificacao = numeroDeIdentificacao;
        this.senha = senha;
    }

    //Getters
    protected String getAgencia(){
        return this.agencia;
    }
    protected String getNumeroDeIdentificacao(){
        return this.numeroDeIdentificacao;
    }
    protected Senha getSenha(){
        return this.senha;
    }

    //Setters
    protected void setAgencia(String agencia){
        this.agencia = agencia;
        return;
    }
    protected void setNumeroDeIdentificacao(String numeroDeIdentificacao){
        this.numeroDeIdentificacao = numeroDeIdentificacao;
        return;
    }
    protected void setSenha(Senha senha){
        this.senha = senha;
        return;
    }
}


public class Q4{
    public static void main(String args[]){
        Conta c1 = new Conta("3930-1", "76543-1", new Senha("A1A1A1", 1234567890));
        System.out.println("Senha Alfanumerica da Conta: " + c1.getSenha().getSenhaAlfanumerica());
        System.out.println("Numero de Identificacao da Conta: " + c1.getNumeroDeIdentificacao());
        c1.getSenha().setSenhaAlfanumerica("B2B2B2");
        System.out.println("Senha Alfanumerica da Conta: " + c1.getSenha().getSenhaAlfanumerica());
        return;
    }
}
