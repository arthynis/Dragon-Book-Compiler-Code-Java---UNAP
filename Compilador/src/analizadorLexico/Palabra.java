package analizadorLexico;
public class Palabra extends Token{
    public String lexema = ""; // int hjhj;
    public Palabra(String s, int etiqueta) { super(etiqueta); lexema = s;} // <id. 1> <=>
    public String toString() { return lexema;}
    //int a,b;
    public static final Palabra
            and = new Palabra("&&", Etiqueta.AND), or = new Palabra("||", Etiqueta.OR),
            eq = new Palabra("==", Etiqueta.EQ), ne = new Palabra("!=", Etiqueta.NE),
            le = new Palabra("<=", Etiqueta.LE), ge = new Palabra(">=", Etiqueta.GE),
            minus = new Palabra("minus", Etiqueta.MINUS),
            True = new Palabra("true", Etiqueta.TRUE),
            False = new Palabra("false", Etiqueta.FALSE),
            temp = new Palabra("t", Etiqueta.TEMP);
}
