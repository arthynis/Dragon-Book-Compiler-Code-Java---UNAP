package analizadorLexico;       //Archivo Token.java
public class Token { // <id, "name"> <'+'>
    public final int etiqueta; // No se modifica una vez establecido
    public Token(int t) {etiqueta = t;} //constructor to crear objetos token
    public String toString() {return "" + (char)etiqueta;} // devuelve una cadena
}
