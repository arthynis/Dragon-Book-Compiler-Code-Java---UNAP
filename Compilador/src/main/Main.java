package main; // Archivo Main.java
import java.io.*;
import analizadorLexico.*;
import analizador.*;

public class Main {

    public static void main(String[] args) throws IOException {
        AnalizadorLexico lex = new AnalizadorLexico();
        Analizador analizar = new Analizador(lex);
        analizar.programa();
        System.out.write('\n');
    }
}

