package inter;      //Archivo Unario.java
import analizadorLexico.*; import Simbolos.*;
public class Unario extends Op{
    public Expr expr;
    public Unario(Token tok, Expr x){
        super(tok, null);  expr = x;
        tipo = Tipo.max(Tipo.Int, expr.tipo);
        if (tipo == null) error("error de tipo");
    }
    public Expr gen() { return new Unario(op, expr.reducir());}
    public String toString() {return op.toString()+" "+expr.toString();}
}

