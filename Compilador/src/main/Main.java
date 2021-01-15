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

/*
{
    int a; 
    int b; 
    a = 0;
    b = 0;
    {
            int b;
            b = 1;
            {
                int a;
                a = 2;
            }
            {
                int b;
                b = 3;
            }
            a = a + 1;
            b = b + 1;
    }
    a= a + 1;
    b = b + 1;
}

*/