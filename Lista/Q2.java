// Palavra: Sequencia de caracteres alfanumericos.
// Palavras sao separadas por espacos, tabs ou pontuacao.
import java.util.*;

class Texto{
    private String content;

    public Texto(String content){
        this.content = content;
    }
    public void imprimir(){
        System.out.println(content);
        return;
    }
    public int numeroDePalavrasNoTexto(){
        String[] palavras = content.split("[ .,?;:!-]+"); //Regex para poder pegar os espacos em branco, tabs e sinais de pontuacao.
        /*for(int i = 0; i < palavras.length; i++){
            System.out.println(palavras[i]);
        }*/
        return palavras.length;
    }
    public int freqSubstringNoTexto(String substring){
        int answer = 0;
        for(int i = 0; i < content.length(); i++){
            if(substring.charAt(0) == content.charAt(i)){
                if(content.regionMatches(i, substring, 0, substring.length()) == true){
                    answer = answer + 1;
                }
            }
        }
        return answer;
    }
    public void substituirOcorrenciasPalavra(String palavraAntiga, String palavraNova){
        StringBuilder newContent = new StringBuilder("");
        int i = 0;
        while(i < content.length()){
            if(content.charAt(i) == palavraAntiga.charAt(0)){
                if(content.regionMatches(i, palavraAntiga, 0, palavraAntiga.length()) == true){
                    newContent.append(palavraNova);
                    i = i + palavraAntiga.length();
                }else{
                    newContent.append(content.charAt(i));
                    i = i + 1;
                }
            }else{
                newContent.append(content.charAt(i));
                i = i + 1;
            }
        }
        content = newContent.toString();
        return;
    }
}


public class Q2{
    public static void main(String args[]){
        Texto t1 = new Texto("Ola, meu nome eh Victor. Como vai vc, Victor?!");
        t1.imprimir();
        System.out.println(t1.freqSubstringNoTexto("Victor"));
        System.out.println(t1.numeroDePalavrasNoTexto());
        t1.substituirOcorrenciasPalavra("Victor", "Felipe");
        t1.imprimir();
        return;
    }
}
