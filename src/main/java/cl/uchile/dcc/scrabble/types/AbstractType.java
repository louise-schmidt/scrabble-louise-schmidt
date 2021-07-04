package cl.uchile.dcc.scrabble.types;

import cl.uchile.dcc.scrabble.types.numbers.FloatType;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

/**
 * clase abstracta principal Types
 * implementa la interface iType
 * contiene los atributos string, Bool, Float, Int, Binary
 */
public abstract class AbstractType implements iType {
    private String string;
    private boolean Bool;
    private double Float;
    private int Int;
    private String Binary;

    /**
     * metodo que convierte algo a un String de Scrabble
     * @return un nuevo StringType
     */
    @Override
    public StringType ToStringS() { return new StringType(this.toString()); }

    /**
     * metodo que convierte algo a un String de Java
     * @return un nuevo String
     */
    public String getString() {
        return String.valueOf(this);
    }

    /**
     * metodo que suma, resta, multiplica o divide un entero de Java con un entero de Scrabble
     * @param i entero de Java creado en el metodo específico de la subclase
     * @param s String de Java para saber que operacion hacer
     * @return retorna un entero de Scrabble con la operacion
     */
    public IntType operacionIntType(int i, String s) {
        if(s=="suma") {
            return new IntType(this.Int+i);
        } else if(s=="resta"){
            return new IntType(this.Int-i);
        } else if(s=="multiplicacion"){
            return new IntType(this.Int*i);
        } else {
            return new IntType((int)(this.Int/i)); }
    }

    /**
     * metodo que suma, resta, multiplica o divide un double de Java con un Float de Scrabble
     * @param d double de Java creado en el metodo especifico de la subclase
     * @param s String de Java para saber que operacion hacer
     * @return retorna un double de Scrabble con la operacion
     */
    public FloatType operacionFloatType(double d, String s) {
        if(s=="suma") {
            return new FloatType(this.Float+d);
        } else if(s=="resta"){
            return new FloatType(this.Float-d);
        } else if(s=="multiplicacion"){
            return new FloatType(this.Float*d);
        } else {
            return new FloatType(this.Float/d); }
    }

}
