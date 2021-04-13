abstract class Livro{
    protected String titulo;
    protected String ISBN;
    protected String autor;
    protected String ano;
    protected String editora;

    public Livro(String titulo, String ISBN, String autor, String ano, String editora){
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }   
    public void setTitulo(String titulo){
        this.titulo = titulo;
        return;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
        return;
    }
    public void setAutor(String autor){
        this.autor = autor;
        return;
    }
    public void setAno(String ano){
        this.ano = ano;
        return;
    }
    public void setEditora(String editora){
        this.editora = editora;
        return;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getISBN(){
        return this.ISBN;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getAno(){
        return this.ano;
    }
    public String getEditora(){
        return this.editora;
    }
    public abstract void venderLivro();
    public abstract void emprestarLivro();
}

class LivroLivraria extends Livro{
    private boolean livroVendido;

    public LivroLivraria(String titulo, String ISBN, String autor, String ano, String editora){
        super(titulo, ISBN, autor, ano, editora);
        this.livroVendido = false;
    }
    public void venderLivro(){
        this.livroVendido = true;
        return;
    }
    public void emprestarLivro(){
        return;
    }
    public String toString(){ //Apenas criado para debuggar.
        String aux1 = "Titulo: " + this.titulo + "\n";
        String aux2 = "ISBN: " + this.ISBN + "\n";
        String aux3 = "Autor: " + this.autor + "\n";
        String aux4 = "Ano: " + this.ano + "\n";
        String aux5 = "Editora: " + this.editora + "\n";
        String aux6 = "";
        if(this.livroVendido == true){
            aux6 = "Vendido: Sim\n";
        }else{
            aux6 = "Vendido: Nao\n";
        }
        return (aux1 + aux2 + aux3 + aux4 + aux5 + aux6);
    }
}

class LivroBiblioteca extends Livro{
    private boolean livroEmprestado;

    public LivroBiblioteca(String titulo, String ISBN, String autor, String ano, String editora){
        super(titulo, ISBN, autor, ano, editora);
        this.livroEmprestado = false;
    }
    public void venderLivro(){
        return;
    }
    public void emprestarLivro(){
        this.livroEmprestado = true;
        return;
    }
    public String toString(){ //Apenas criado para debuggar.
        String aux1 = "Titulo: " + this.titulo + "\n";
        String aux2 = "ISBN: " + this.ISBN + "\n";
        String aux3 = "Autor: " + this.autor + "\n";
        String aux4 = "Ano: " + this.ano + "\n";
        String aux5 = "Editora: " + this.editora + "\n";
        String aux6 = "";
        if(this.livroEmprestado == true){
            aux6 = "Emprestado: Sim\n";
        }else{
            aux6 = "Emprestado: Nao\n";
        }
        return (aux1 + aux2 + aux3 + aux4 + aux5 + aux6);
    }
}

public class Q1{
    public static void main(String args[]){
        Livro l1 = new LivroBiblioteca("Maus", "85-359-0277-5", "Art Spigelman", "1996", "Companhia das Letras");
        Livro l2 = new LivroLivraria("Condado de Essex", "85-359-0697-5", "Jeff Lemire", "2012", "Companhia das Letras");
        
        System.out.println(l1);
        System.out.print("");
        l1.emprestarLivro();
        System.out.println(l1);

        System.out.println(l2);
        System.out.print("");
        l2.venderLivro();
        System.out.println(l2);

        return;
    }
}
