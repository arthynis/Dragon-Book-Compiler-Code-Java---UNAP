package inter;         //Archivo Id.java
import analizadorLexico.*; import Simbolos.*;
public class Id extends Expr{
    public int desplazamiento;
    public Id(Palabra id, Tipo p, int b) {super(id,p); desplazamiento = b;}
}
