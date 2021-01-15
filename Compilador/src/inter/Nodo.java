package inter;
import analizadorLexico.*;
public class Nodo {
    int lineales = 0;
    Nodo() { lineales = AnalizadorLexico.linea;}
    void error(String s) {throw new Error("cerca de la linea "+lineales+": "+s);}
    static int etiquetas = 0;
    public int nuevaEtiqueta() { return ++etiquetas;}
    public void emitirEtiqueta(int i) { System.out.print("L" + i + ":");}
    public void emitir(String s){ System.out.println("\t" + s);}
}
