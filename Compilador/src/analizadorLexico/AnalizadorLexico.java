package analizadorLexico;
import java.io.*; import java.util.*; import Simbolos.*;
public class AnalizadorLexico {
    public static int linea = 1; //linea del codigo fuente
    char preanalisis = ' '; 
    Hashtable palabras = new Hashtable();
    void reservar(Palabra w) { palabras.put(w.lexema, w);}// <267,and>
    public AnalizadorLexico(){
        reservar( new Palabra("if", Etiqueta.IF));
        reservar( new Palabra("else", Etiqueta.ELSE));
        reservar( new Palabra("while", Etiqueta.WHILE));
        reservar( new Palabra("do", Etiqueta.DO));
        reservar( new Palabra("break", Etiqueta.BREAK));
        reservar( Palabra.True); 
        reservar( Palabra.False);
        reservar( Tipo.Int); 
        reservar( Tipo.Char);
        reservar( Tipo.Bool); 
        reservar( Tipo.Float);
    }
    void readch() throws IOException { preanalisis = (char)System.in.read();}// lee
    boolean readch(char c) throws IOException {
        readch();
        if( preanalisis !=c )return false;
        preanalisis = ' ';
        return true;
    }
    public Token escanear() throws IOException {
        for( ; ; readch()) {//elimina
            if( preanalisis == ' ' || preanalisis == '\t' ) continue; //para espacios o tabulador
            else if( preanalisis == '\n') linea = linea + 1; // avanza a la siguiente linea
            else break;
        }
        switch (preanalisis){
            case '&': //&&
                if( readch('&')) return Palabra.and; else return new Token('&');
            case '|': //||
                if( readch('|')) return Palabra.or; else return new Token('|');
            case '=':
                if( readch('=')) return Palabra.eq; else return new Token('=');
            case '!':
                if( readch('=')) return Palabra.ne; else return new Token('!');
            case '<':
                if( readch('=')) return Palabra.le; else return new Token('<');
            case '>':
                if( readch('=')) return Palabra.ge; else return new Token('>');
        }
        if( Character.isDigit(preanalisis)) { //lee y convierte reales
            int v = 0;
            do {
                v = 10*v +Character.digit(preanalisis, 10); readch(); // 23.4...; 20 + 3  
            } while ( Character.isDigit(preanalisis));
            if( preanalisis != '.') return new Num(v);
            float x = v; float d = 10;
            for(;;){
                readch();
                if( ! Character.isDigit(preanalisis)) break; // 23.4...
            x = x + Character.digit(preanalisis, 10)/d; d = d*10; //x = 23.4
            } 
            return new Real(x);
        }
        
        if( Character.isLetter(preanalisis)){
            StringBuffer b = new StringBuffer(); //Puede cambiar 
            do {
                b.append(preanalisis); readch();
            } while( Character.isLetterOrDigit(preanalisis)); // int x2; '.' ',' int f,
            String s = b.toString();
            Palabra w = (Palabra)palabras.get(s); //busca
            if( w != null ) return w;   // x2 + 3; // ya existe
            w = new Palabra(s, Etiqueta.ID);
            palabras.put(s, w);
            return w;  
        }
        Token tok = new Token(preanalisis); preanalisis = ' ';
        return tok;
    }
}
