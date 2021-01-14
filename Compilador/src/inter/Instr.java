package inter;      //Archivo Instr.java
import analizadorLexico.*; import Simbolos.*;
public class Instr extends Nodo{
    public Instr(){}
    public static Instr Null = new Instr();
    public void gen(int b, int a){}
    int despues = 0;
    public static Instr Circundante = Instr.Null;
}

