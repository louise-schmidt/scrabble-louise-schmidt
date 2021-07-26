package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.types.StringType;
import cl.uchile.dcc.scrabble.types.AbstractType;
import cl.uchile.dcc.scrabble.operations.IBinary;

/**
 * La clase IntType genera un objeto del tipo int
 * Representan un numero entero
 */
public class IntType extends AbstractType implements INumbers, IBinary, Comparable<IntType> {

    /**
     * valor inmutable del IntType
     */
    private final int value;

    /**
     * Crea un IntType con valor "valor"
     * @param value
     * el int que será de tipo IntType
     **/
    public IntType(int value) {
        this.value = value;
    }

    /**
     * Retorn el valor del objeto IntType como un objeto de tipo int
     * @return
     * la representacion de tipo int del objeto
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Compara el objeto this con el objeto o
     * Son iguales si el argumento es un IntType del mismo valor que el objeto
     * @param o
     * el objeto con el que se compara
     * @return
     * true si los objetos son iguales o false en el caso contrario
     **/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntType)) return false;
        IntType entero = (IntType) o;
        return this.getValue() == entero.getValue();
    }

    /**
     * Retorna un hashCode para IntType
     * @return
     * un hash code para el objeto
     */
    @Override
    public int hashCode() {
        return this.getValue();
    }

    /**
     * Retorna un objeto de tipo String representando el valor del objeto IntType
     * @return
     * un String que representa el valor del objeto
     */
    @Override
    public String toString(){
        return String.valueOf(this.getValue());
    }

    /**
     * Retorna un tipo StringType representando el valor del objeto IntType
     * @return
     * un objeto StrinType que representa el valor del objeto
     */
    @Override
    public StringType asString() {
        return TypeFactory.getStringType(this.toString());
    }

    /**
     * retorna un objeto de tipo IntType que representa un valor entero
     * @return
     * un IntType que representa un valor entero
     */
    @Override
    public IntType asInt() {
        return TypeFactory.getIntType(this.getValue());
    }

    /**
     * retorna un objeto de tipo FloatType que representa un valor flotante
     * @return
     * un FloatType que representa un valor flotante
     */
    public FloatType asFloat() {
        return TypeFactory.getFloatType(this.getValue());
    }

    /**
     * Retorna un tipo BinaryType representando el valor del objeto IntType
     * @return
     * un objeto BinaryType que representa el valor del objeto
     */
    @Override
    public BinaryType asBinary() {
        int aux = Math.abs(this.getValue());
        StringBuilder auxStrBld = new StringBuilder();
        while (aux > 0){
            auxStrBld.insert(0, aux % 2);
            aux /= 2;
        }
        String auxStr = String.format("%16s", auxStrBld.toString()).replace(' ', '0');
        if (this.getValue() < 0){
            BinaryType resultado = TypeFactory.getBinaryType(auxStr);
            BinaryType uno = TypeFactory.getBinaryType("0000000000000001");
            BinaryType negacion = resultado.not();
            resultado = negacion.addToBinary(uno);
            return TypeFactory.getBinaryType(resultado.getValue());
        }
        return TypeFactory.getBinaryType(auxStr);
    }

    //Suma
    public INumbers add(INumbers addend){
        return addend.addToInt(this);
    }

    /**
     * Suma un objeto del tipo IntType
     * @param addend
     * se le suma un objeto IntType
     * @return
     * Retorna un objeto de tipo IntType con la suma
     */
    @Override
    public IntType addToInt(IntType addend){
        return TypeFactory.getIntType(addend.getValue() + this.getValue());
    }

    /**
     * Suma un objeto del tipo FloatType
     * @param addend
     * se le suma un objeto FloatType
     * @return
     * Retorna un objeto de tipo FloatType con la suma
     */
    @Override
    public FloatType addToFloat(FloatType addend){
        return TypeFactory.getFloatType(addend.getValue() + this.getValue());
    }

    /**
     * Suma un objeto del tipo BinaryType
     * @param addend
     * es un objeto BinaryType que se suma
     * @return
     * Retorna un objeto de tipo IntType con la suma
     */
    @Override
    public BinaryType addToBinary(BinaryType addend) {
        int addend1 = addend.asInt().getValue();
        int addend2 = this.getValue();
        return TypeFactory.getIntType(addend1 + addend2).asBinary();
    }

    //Resta
    public INumbers subtract(INumbers subtrahend){
        return subtrahend.subtractToInt(this);
    }

    /**
     * Le resta un objeto de tipo IntType
     * @param minuend
     * es de tipo IntType y se resta
     * @return
     * IntType con el resultado de la resta
     */
    @Override
    public IntType subtractToInt(IntType minuend){
        return TypeFactory.getIntType(minuend.getValue() - this.getValue());
    }

    /**
     * Le resta un objeto de tipo FloatType
     * @param minuend
     * es de tipo FloatType y se resta
     * @return
     * FloatType con el resultado de la resta
     */
    @Override
    public FloatType subtractToFloat(FloatType minuend){
        return TypeFactory.getFloatType(minuend.getValue() - this.getValue());
    }

    /**
     * Le resta un objeto de tipo BinaryType
     * @param minuend
     * es de tipo BinaryType y se resta
     * @return
     * IntType con el resultado de la resta
     */
    @Override
    public BinaryType subtractToBinary(BinaryType minuend) {
        int intMinuend = minuend.asInt().getValue();
        int intSubtrahend = this.getValue();
        return TypeFactory.getIntType(intMinuend - intSubtrahend).asBinary();
    }

    //Multiplicacion
    public INumbers multiply(INumbers multiplier){
        return multiplier.multiplyToInt(this);
    }

    /**
     * Multiplica el objeto con uno de tipo IntType
     * @param multiplicand
     * es de tipo IntType y se multiplicara
     * @return
     * un objeto IntType con el resultado de la multiplicacion
     */
    @Override
    public IntType multiplyToInt(IntType multiplicand){
        return TypeFactory.getIntType(multiplicand.getValue() * this.getValue());
    }

    /**
     * Multiplica el objeto con uno de tipo FloatType
     * @param multiplicand
     * es de tipo FloatType y se multiplicara
     * @return
     * un objeto FloatType con el resultado de la multiplicacion
     */
    @Override
    public FloatType multiplyToFloat(FloatType multiplicand){
        return TypeFactory.getFloatType(multiplicand.getValue() * this.getValue());
    }

    /**
     * Multiplica el objeto con uno de tipo BinaryType
     * @param multiplicand
     * es de tipo BinaryType y se multiplicara
     * @return
     * un objeto IntType con el resultado de la multiplicacion
     */
    @Override
    public BinaryType multiplyToBinary(BinaryType multiplicand) {
        int intMultiplicand = multiplicand.asInt().getValue();
        int intMultiplier = this.getValue();
        return TypeFactory.getIntType(intMultiplicand * intMultiplier).asBinary();
    }

    //Division
    public INumbers divide(INumbers divisor) {
        return divisor.divideToInt(this);
    }

    /**
     * Divide un objeto IntType con el objeto this
     * @param dividend
     * es de tipo IntType y se divide
     * @return
     * el resultado de la division de tipo IntType
     */
    @Override
    public IntType divideToInt(IntType dividend) {
        return TypeFactory.getIntType(dividend.getValue() / this.getValue());
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

    /**
     * Divide un objeto BinaryType con el objeto this
     * @param dividend
     * es de tipo BinaryType y se divide
     * @return
     * el resultado de la division de tipo IntType
     */
    @Override
    public BinaryType divideToBinary(BinaryType dividend) {
        int intDividend = dividend.asInt().getValue();
        int intDivisor = this.getValue();
        return TypeFactory.getIntType(intDividend / intDivisor).asBinary();
    }

    /**
     * Compara un IntType con un IntType
     * @param intype
     * el objeto que se utilizara para comparar
     * @return
     * un int menor, mayor o igual a 0 segun si this es menor, mayor o igual a intype
     */
    @Override
    public int compareTo(IntType intype) {
        Integer intypevalue = Integer.valueOf(intype.getValue());
        Integer value = Integer.valueOf(this.asInt().getValue());
        return value.compareTo(intypevalue);
    }
}


