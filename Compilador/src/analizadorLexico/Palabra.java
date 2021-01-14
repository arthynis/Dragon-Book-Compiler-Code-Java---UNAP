package analizadorLexico;           //Archivo Palabra.java
public class Palabra extends Token{
    public String lexema = "";
    public Palabra(String s, int etiqueta) { super(etiqueta); lexema = s;}
    public String toString() { return lexema;}
    public static final Palabra
            and = new Palabra("&&", Etiqueta.AND), or = new Palabra("||", Etiqueta.OR),
            eq = new Palabra("==", Etiqueta.EQ), ne = new Palabra("!=", Etiqueta.NE),
            LE = new Palabra("<=", Etiqueta.LE), ge = new Palabra(">=", Etiqueta.GE),
            minus = new Palabra("minus", Etiqueta.MINUS),
            True = new Palabra("true", Etiqueta.TRUE),
            False = new Palabra("false", Etiqueta.FALSE),
            temp = new Palabra("t", Etiqueta.TEMP);
}

