package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.types.AbstractType;
import cl.uchile.dcc.scrabble.types.StringType;

import java.util.Objects;

/**
 * La clase FloatType genera un objeto del tipo double
 * Representan un numero flotante
 */
public class FloatType extends AbstractType implements INumbers, Comparable<FloatType> {

    /**
     * valor inmutable del FloatType
     */
    private final double value;

    /**
     * Crea un FloatType con valor "valor"
     * @param value
     * el double que será de tipo FloatType
     **/
    public FloatType(double value) {
        this.value = value;
    }

    /**
     * Retorn el valor del objeto FloatType como un objeto de tipo double
     * @return
     * la representacion de tipo double del objeto
     */
    public double getValue() {
        return value;
    }

    /**
     * Compara el objeto this con el objeto o
     * Son iguales si el argumento es un FloatType del mismo valor que el objeto
     * @param o
     * el objeto con el que se compara
     * @return
     * true si los objetos son iguales o false en el caso contrario
     **/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FloatType)) return false;
        FloatType floatype = (FloatType) o;
        return this.getValue() == floatype.getValue();
    }

    /**
     * Retorna un hashCode para FloatType
     * @return
     * un hash code para el objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getValue());
    }

    /**
     * Retorna un tipo StringType representando el valor del objeto FloatType
     * @return
     * un objeto StrinType que representa el valor del objeto
     */
    public StringType asString() {
        return TypeFactory.getStringType(this.toString());
    }

    /**
     * Retorna un objeto de tipo String representando el valor del objeto FloatType
     * @return
     * un String que representa el valor del objeto
     */
    @Override
    public String toString(){
        return String.valueOf(this.getValue());
    }

    /**
     * retorna un objeto de tipo FloatType que representa un valor flotante
     * @return
     * un FloatType que representa un valor flotante
     */
    public FloatType asFloat() {
        return TypeFactory.getFloatType(this.getValue());
    }

    //Suma
    public INumbers add(INumbers numero) {
        return numero.addToFloat(this);
    }

    /**
     * Suma un objeto del tipo IntType
     * @param addend
     * se le suma un objeto IntType
     * @return
     * Retorna un objeto de tipo FloatType con la suma
     */
    @Override
    public FloatType addToInt(IntType addend) {
        return TypeFactory.getFloatType(addend.getValue() + this.getValue());
    }

    /**
     * Suma un objeto del tipo FloatType
     * @param addend
     * se le suma un objeto FloatType
     * @return
     * Retorna un objeto de tipo FloatType con la suma
     */
    @Override
    public FloatType addToFloat(FloatType addend) {
        return TypeFactory.getFloatType(addend.getValue() + this.getValue());
    }

    //Resta
    public INumbers subtract(INumbers numero) {
        return numero.subtractToFloat(this);
    }

    /**
     * Le resta un objeto de tipo IntType
     * @param minuend
     * es de tipo IntType y se resta
     * @return
     * FloatType con el resultado de la resta
     */
    @Override
    public FloatType subtractToInt(IntType minuend) {
        return TypeFactory.getFloatType(minuend.getValue() - this.getValue());
    }

    /**
     * Le resta un objeto de tipo FloatType
     * @param minuend
     * es de tipo FloatType y se resta
     * @return
     * FloatType con el resultado de la resta
     */
    @Override
    public FloatType subtractToFloat(FloatType minuend) {
        return TypeFactory.getFloatType(minuend.getValue() - this.getValue());
    }

    //Multiplicacion
    public INumbers multiply(INumbers product) {
        return product.multiplyToFloat(this);
    }

    /**
     * Multiplica el objeto con uno de tipo IntType
     * @param multiplicand
     * es de tipo IntType y se multiplicara
     * @return
     * un objeto FloatType con el resultado de la multiplicacion
     */
    @Override
    public FloatType multiplyToInt(IntType multiplicand) {
        return TypeFactory.getFloatType(multiplicand.getValue() * this.getValue());
    }

    /**
     * Multiplica el objeto con uno de tipo FloatType
     * @param multiplicand
     * es de tipo FloatType y se multiplicara
     * @return
     * un objeto FloatType con el resultado de la multiplicacion
     */
    @Override
    public FloatType multiplyToFloat(FloatType multiplicand) {
        return TypeFactory.getFloatType(multiplicand.getValue() * this.getValue());
    }

    //Division
    public INumbers divide(INumbers divisor) {
        return divisor.divideToFloat(this);
    }

    /**
     * Divide un objeto IntType con el objeto this
     * @param dividend
     * es de tipo IntType y se divide
     * @return
     * el resultado de la division de tipo FloatType
     */
    @Override
    public FloatType divideToInt(IntType dividend) {
        return TypeFactory.getFloatType(dividend.getValue() / this.getValue());
    }

    /**
     * Divide un objeto FloatType con el objeto this
     * @param dividend
     * es de tipo FloatType y se divide
     * @return
     * el resultado de la division de tipo FloatType
     */
    @Override
    public FloatType divideToFloat(FloatType dividend) {
        return TypeFactory.getFloatType(dividend.getValue() / this.getValue());
    }

    @Override
    public int compareTo(FloatType floatype) {
        Double floatypevalue = Double.valueOf(floatype.getValue());
        Double value = Double.valueOf(this.asFloat().getValue());
        return value.compareTo(floatypevalue);
    }
}
