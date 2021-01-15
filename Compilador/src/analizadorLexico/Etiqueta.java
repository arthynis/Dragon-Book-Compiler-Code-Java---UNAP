package analizadorLexico;

public class Etiqueta { //public para que pueda usarse fuera del paquete
    public final static int //final se establece una vez
            //caracteres ascii enteros entre 0 - 255 // 
            AND = 256, BASIC = 257, BREAK = 258, DO = 259, ELSE = 260,
            EQ = 261, FALSE = 262, GE = 263, ID = 264, IF = 265,
            INDEX = 266, LE = 267, MINUS = 268, NE = 269, NUM = 270,
            OR = 271, REAL = 272, TEMP = 273, TRUE = 274, WHILE = 275;            
}   //#define AND 256
// int a,b,c;