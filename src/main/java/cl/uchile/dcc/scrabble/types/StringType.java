package cl.uchile.dcc.scrabble.types;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

import java.util.Objects;

/**
 * subclase para el String de Scrabble
 * extiende la clase abstracta Types
 */
public class StringType extends AbstractType {
    private String string;

    /**
     * Constructor de la subclase
     * @param string de tipo String de Java
     */
    public StringType(String string) {
        this.string=string;
    }

    /**
     * Metodo suma para dos Strings
     * @param string es String de Java
     * @return nuevo StringType de string sumado a un StringType
     */
    public StringType suma(StringType string) {
        String s=string.getString();
        return new StringType(this.string+s);
    }

    /**
     * Metodo suma
     * @param bool se convierte en StringType
     * @return un nuevo StringType que suma el bool transformado a un StringType
     */
    public StringType suma(BoolType bool) {
        String b=bool.getString();
        return new StringType(this.string+b);
    }

    /**
     * Metodo suma Float
     * @param Float se convierte en StringType
     * @return un nuevo StringType que suma el Float transformado a un StringType
     */
    public StringType suma(FloatType Float) {
        String f=Float.getString();
        return new StringType(this.string+f);
    }

    /**
     * Metodo suma para Int
     * @param Int se convierte en StringType
     * @return un nuevo StringType que suma el Int transformado a un StringType
     */
    public StringType suma(IntType Int) {
        String i=Int.getString();
        return new StringType(this.string+i); }

    /**
     * Metodo suma para binary
     * @param binary se convierte en StringType
     * @return un nuevo StringType que suma el binary transformado a un StringType
     */
    public StringType suma(BinaryType binary) {
        String bi=binary.getString();
        return new StringType(this.string+bi);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringType that = (StringType) o;
        return Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}
