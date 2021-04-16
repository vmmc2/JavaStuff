enum TipoExpressao{
    ARITMETICA, LOGICA;
}

interface Expression{
    String avaliar(String exp);
    String imprimirArvore(String exp);
}

class ExprAritmetica implements Expression{
    //Atributos
    private String expr;

    //Construtor
    public ExprAritmetica(String expr){
        this.expr = expr;
    }

    //Metodos
    public String avaliar(String exp){
        //Ordem de prioridade: (+) -> (-) -> (*) -> (/)
        String result = "";
        for(int i = exp.length() - 1; i >= 0; i--){ // (+)
            if(exp.charAt(i) == '+'){
                String expLeft = avaliar(exp.substring(0, i));
                String expRight = avaliar(exp.substring(i + 1, exp.length()));
                result = Double.toString(Double.valueOf(expLeft) + Double.valueOf(expRight));
                return result;
            }
        }
        for(int i = exp.length() - 1; i >= 0; i--){ // (-)
            if(exp.charAt(i) == '-'){
                String expLeft = avaliar(exp.substring(0, i));
                String expRight = avaliar(exp.substring(i + 1, exp.length()));
                result = Double.toString(Double.valueOf(expLeft) - Double.valueOf(expRight));
                return result;
            }
        }
        for(int i = exp.length() - 1; i >= 0; i--){ // (*)
            if(exp.charAt(i) == '*'){
                String expLeft = avaliar(exp.substring(0, i));
                String expRight = avaliar(exp.substring(i + 1, exp.length()));
                result =  Double.toString(Double.valueOf(expLeft) * Double.valueOf(expRight));
                return result;
            }
        }
        for(int i = exp.length() - 1; i >= 0; i--){ // (/)
            if(exp.charAt(i) == '/'){
                String expLeft = avaliar(exp.substring(0, i));
                String expRight = avaliar(exp.substring(i + 1, exp.length()));
                result =  Double.toString(Double.valueOf(expLeft) / Double.valueOf(expRight));
                return result;
            }
        }
        return exp;
    }
    public String imprimirArvore(String exp){
        for(int i = exp.length() - 1; i >= 0; i--){ // (+)
            if(exp.charAt(i) == '+'){
                return "(" + imprimirArvore(exp.substring(0, i)) + "+" + imprimirArvore(exp.substring(i + 1, exp.length())) + ")";
            }
        }
        for(int i = exp.length() - 1; i >= 0; i--){ // (-)
            if(exp.charAt(i) == '-'){
                return "(" + imprimirArvore(exp.substring(0, i)) + "-" + imprimirArvore(exp.substring(i + 1, exp.length())) + ")";
            }
        }
        for(int i = exp.length() - 1; i >= 0; i--){ // (*)
            if(exp.charAt(i) == '*'){
                return "(" + imprimirArvore(exp.substring(0, i)) + "*" + imprimirArvore(exp.substring(i + 1, exp.length())) + ")";
            }
        }
        for(int i = exp.length() - 1; i >= 0; i--){ // (/)
            if(exp.charAt(i) == '/'){
                return "(" + imprimirArvore(exp.substring(0, i)) + "/" + imprimirArvore(exp.substring(i + 1, exp.length())) + ")";
            }
        }
        return "(" + exp + ")";
    }
    public String toString(){
        return "";
    }
    public String getExpr(){
        return expr;
    }
    public void setExpr(String expr){
        this.expr = expr;
        return;
    }
}

class ExprLogica implements Expression{
    //Atributos
    private String expr;

    //Construtor
    public ExprLogica(String expr){
        this.expr = expr;
    }

    //Metodos
    public String avaliar(String exp){
        //Achar o operador logico: (<), (>), (<=), (=>), (==), (!=)
        if(exp.indexOf("<") != -1){
            int index = exp.indexOf("<");
            ExprAritmetica expLeft = new ExprAritmetica(exp.substring(0, index));
            ExprAritmetica expRight = new ExprAritmetica(exp.substring(index + 1, exp.length()));
            Double resultLeft = Double.valueOf(expLeft.avaliar(expLeft.getExpr()));
            Double resultRight = Double.valueOf(expRight.avaliar(expRight.getExpr()));
            if(resultLeft < resultRight){
                return "True";
            }else{
                return "False";
            }
        }else if(exp.indexOf(">") != -1){
            int index = exp.indexOf(">");
            ExprAritmetica expLeft = new ExprAritmetica(exp.substring(0, index));
            ExprAritmetica expRight = new ExprAritmetica(exp.substring(index + 1, exp.length()));
            Double resultLeft = Double.valueOf(expLeft.avaliar(expLeft.getExpr()));
            Double resultRight = Double.valueOf(expRight.avaliar(expRight.getExpr()));
            if(resultLeft > resultRight){
                return "True";
            }else{
                return "False";
            }
        }else if(exp.indexOf("<=") != -1){
            int index = exp.indexOf("<=");
            ExprAritmetica expLeft = new ExprAritmetica(exp.substring(0, index));
            ExprAritmetica expRight = new ExprAritmetica(exp.substring(index + 2, exp.length()));
            Double resultLeft = Double.valueOf(expLeft.avaliar(expLeft.getExpr()));
            Double resultRight = Double.valueOf(expRight.avaliar(expRight.getExpr()));
            if(resultLeft <= resultRight){
                return "True";
            }else{
                return "False";
            }
        }else if(exp.indexOf(">=") != -1){
            int index = exp.indexOf(">=");
            ExprAritmetica expLeft = new ExprAritmetica(exp.substring(0, index));
            ExprAritmetica expRight = new ExprAritmetica(exp.substring(index + 2, exp.length()));
            Double resultLeft = Double.valueOf(expLeft.avaliar(expLeft.getExpr()));
            Double resultRight = Double.valueOf(expRight.avaliar(expRight.getExpr()));
            if(resultLeft >= resultRight){
                return "True";
            }else{
                return "False";
            }
        }else if(exp.indexOf("==") != -1){
            int index = exp.indexOf("==");
            ExprAritmetica expLeft = new ExprAritmetica(exp.substring(0, index));
            ExprAritmetica expRight = new ExprAritmetica(exp.substring(index + 2, exp.length()));
            Double resultLeft = Double.valueOf(expLeft.avaliar(expLeft.getExpr()));
            Double resultRight = Double.valueOf(expRight.avaliar(expRight.getExpr()));
            if(resultLeft == resultRight){
                return "True";
            }else{
                return "False";
            }
        }else{
            int index = exp.indexOf("!=");
            ExprAritmetica expLeft = new ExprAritmetica(exp.substring(0, index));
            ExprAritmetica expRight = new ExprAritmetica(exp.substring(index + 2, exp.length()));
            Double resultLeft = Double.valueOf(expLeft.avaliar(expLeft.getExpr()));
            Double resultRight = Double.valueOf(expRight.avaliar(expRight.getExpr()));
            if(resultLeft != resultRight){
                return "True";
            }else{
                return "False";
            }
        }
    }
    public String imprimirArvore(String exp){
        //Ordem de prioridade: Achar o operador logico: (<), (>), (<=), (=>), (==), (!=)
        //Depois quebrar de acordo com os operadores na ordem de prioridade: (+) -> (-) -> (*) -> (/)
        if(exp.indexOf(">") != -1){
            int index = exp.indexOf(">");
            return "(" + imprimirArvore(exp.substring(0, index)) + ">" + imprimirArvore(exp.substring(index + 1, exp.length())) + ")";
        }else if(exp.indexOf("<") != -1){
            int index = exp.indexOf("<");
            return "(" + imprimirArvore(exp.substring(0, index)) + "<" + imprimirArvore(exp.substring(index + 1, exp.length())) + ")";
        }else if(exp.indexOf(">=") != -1){
            int index = exp.indexOf(">=");
            return "(" + imprimirArvore(exp.substring(0, index)) + ">=" + imprimirArvore(exp.substring(index + 2, exp.length())) + ")";
        }else if(exp.indexOf("<=") != -1){
            int index = exp.indexOf("<=");
            return "(" + imprimirArvore(exp.substring(0, index)) + "<=" + imprimirArvore(exp.substring(index + 2, exp.length())) + ")";
        }else if(exp.indexOf("!=") != -1){
            int index = exp.indexOf("!=");
            return "(" + imprimirArvore(exp.substring(0, index)) + "!=" + imprimirArvore(exp.substring(index + 2, exp.length())) + ")";
        }else if(exp.indexOf("==") != -1){
            int index = exp.indexOf("==");
            return "(" + imprimirArvore(exp.substring(0, index)) + "==" + imprimirArvore(exp.substring(index + 2, exp.length())) + ")";
        }
        for(int i = exp.length() - 1; i >= 0; i--){ // (+)
            if(exp.charAt(i) == '+'){
                return "(" + imprimirArvore(exp.substring(0, i)) + "+" + imprimirArvore(exp.substring(i + 1, exp.length())) + ")";
            }
        }
        for(int i = exp.length() - 1; i >= 0; i--){ // (-)
            if(exp.charAt(i) == '-'){
                return "(" + imprimirArvore(exp.substring(0, i)) + "-" + imprimirArvore(exp.substring(i + 1, exp.length())) + ")";
            }
        }
        for(int i = exp.length() - 1; i >= 0; i--){ // (*)
            if(exp.charAt(i) == '*'){
                return "(" + imprimirArvore(exp.substring(0, i)) + "*" + imprimirArvore(exp.substring(i + 1, exp.length())) + ")";
            }
        }
        for(int i = exp.length() - 1; i >= 0; i--){ // (/)
            if(exp.charAt(i) == '/'){
                return "(" + imprimirArvore(exp.substring(0, i)) + "/" + imprimirArvore(exp.substring(i + 1, exp.length())) + ")";
            }
        }
        return "(" + exp + ")";
    }
    public String toString(){
        return "";
    }
    public String getExpr(){
        return expr;
    }
    public void setExpr(String expr){
        this.expr = expr;
        return;
    }
}

public class Q6{
    public static void main(String args[]){
        String expr = "2+5/10<12+16";
        TipoExpressao tipo = descobreTipoDeExpr(expr);
        if(tipo == TipoExpressao.ARITMETICA){
            ExprAritmetica example = new ExprAritmetica(expr);
            System.out.println(example.avaliar(example.getExpr()));
            System.out.println(example.imprimirArvore(example.getExpr()));
        }else if(tipo == TipoExpressao.LOGICA){
            ExprLogica example = new ExprLogica(expr);
            System.out.println(example.avaliar(example.getExpr()));
            System.out.println(example.imprimirArvore(example.getExpr()));
        }
        return;
    }
    public static TipoExpressao descobreTipoDeExpr(String expr){
        if(expr.contains(">") == true || expr.contains("<") == true){
            return TipoExpressao.LOGICA;
        }else if(expr.contains(">=") == true || expr.contains("<=") == true){
            return TipoExpressao.LOGICA;
        }else if(expr.contains("!=") == true || expr.contains("==") == true){
            return TipoExpressao.LOGICA;
        }
        return TipoExpressao.ARITMETICA;
    }
}
/*
"2/3+4*5-1" -> 19.6666667


*/
