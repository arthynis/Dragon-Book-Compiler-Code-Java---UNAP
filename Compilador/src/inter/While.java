package inter;
import Simbolos.*;
public class While extends Instr{
    Expr expr; Instr instr;
    public While(){ expr = null; instr = null;}
    public void inic(Expr x, Instr s){
        expr = x; instr = s;
        if( expr.tipo != Tipo.Bool) expr.error("se requiere booble en while");
    }
    public void gen(int b, int a){
        despues = a;
        expr.salto(0,a);
        int etiqueta = nuevaEtiqueta();
        emitirEtiqueta(etiqueta); instr.gen(etiqueta,b);
        emitir("goto L" +b);
    }
}
