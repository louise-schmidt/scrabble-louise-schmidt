package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.types.BoolType;
import cl.uchile.dcc.scrabble.types.StringType;
import cl.uchile.dcc.scrabble.types.AbstractType;
import cl.uchile.dcc.scrabble.operations.IBinary;
import cl.uchile.dcc.scrabble.operations.ILogical;

import java.util.Objects;

/**
 * La clase BinaryType genera un objeto del tipo String formado por '0' y '1'
 * Representan un numero binario unsigned
 */
public class BinaryType extends AbstractType implements INumbers, IBinary, ILogical, Comparable<BinaryType> {

    /**
     * valor inmutable del BinaryType
     */
    private final String value;

    /**
     * Crea un BinaryType con valor "valor"
     * @param value
     * el String que será de tipo BinaryType
     **/
    public BinaryType(String value) {
        this.value = value;
    }

    /**
     * Retorna el valor del objeto BinaryType como un objeto de tipo String
     * @return
     * la representacion de tipo String del objeto
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Compara el objeto
     * Son iguales si el argumento es un BinaryType del mismo valor que el objeto
     * @param o
     * el objeto con el que se compara
     * @return
     * true si los objetos son iguales o false en el caso contrario
     **/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BinaryType)) return false;
        BinaryType binario = (BinaryType) o;
        return Objects.equals(this.getValue(), binario.getValue());
    }

    /**
     * Retorna un hashCode para BinaryType
     * @return
     * un hash code para el objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getValue());
    }

    /**
     * Retorna un objeto de tipo String representando el valor del objeto BinaryType
     * @return
     * un String que representa el valor del objeto
     */
    @Override
    public String toString(){
        return this.getValue();
    }

    /**
     * Retorna un tipo StringType representando el valor del objeto BinaryType
     * @return
     * un objeto StrinType que representa el valor del objeto
     */
    @Override
    public StringType asString() {
        return TypeFactory.getStringType(this.getValue());
    }

    /**
     * retorna un objeto de tipo FloatType que representa el valor del binario
     * @return
     * un FloatType que representa el valor del binario
     */
    public FloatType asFloat() {
        return TypeFactory.getIntType(toInt(this.getValue())).asFloat();
    }

    /**
     * Retorna un objeto IntType que representa el valor del objeto BinaryType dado
     * @return
     * una representacion de tipo IntType
     */
    public IntType asInt(){
        return TypeFactory.getIntType(this.toInt(this.getValue()));
    }

    /**
     * Convierte el objeto String que representa al binario en un entero
     * @param binary
     * el objeto String representa el binario
     * @return
     * un entero con signo con el valor en base 10 del binario
     */
    private int toInt(String binary){
        if (bitToInt(binary.charAt(0)) == 0){
            return positiveBinToInt(binary);
        }
        else{
            return negativeBinaryToInt(binary);
        }
    }

    /**
     * Retorna un objeto de tipo BinaryType que representa el valor del binario
     * @return
     * un BinaryType que representa el valor del binario
     */
    @Override
    public BinaryType asBinary() {
        return TypeFactory.getBinaryType(this.getValue());
    }

    /**
     * Convierte un objeto String que representa a un binario negativo en un objeto tipo int con signo
     * @param binary
     * el objeto de tipo String que representa el binario negativo
     * @return
     * un entero negativo con el valor del binario en base 10
     */
    private int negativeBinaryToInt(String binary) {
        int n = binary.length() - 1;
        int w = -bitToInt(binary.charAt(0)) * (int) Math.pow(2, n);
        for (int i = n, j = 0; i > 0; i--, j++) {
            w += (int) Math.pow(2, j) * (binary.charAt(i) == '1' ? 1 : 0);
        }
        return w;
    }

    /**
     * convierte un objeto String que representa a un binario positivo en un objeto tipo int
     * @param binary
     * el objeto de tipo String qe representa el binario positivo
     * @return
     * un enetro positivo con el valor en base 10 del binario
     */
    private int positiveBinToInt(String binary) {
        int w = 0;
        for (int i = binary.length() - 1, j = 0; i > 0; i--, j++) {
            w += (int) Math.pow(2, j) * bitToInt(binary.charAt(i));
        }
        return w;
    }

    /**
     * Convierte un char que representa un bit, de '0' o '1' a su representacion de tipo int
     * @param bit
     * un char que representa el bit con '0' o '1'
     * @return
     * un int positivo que representa el char
     */
    private int bitToInt(char bit) {
        return bit == '0' ? 0 : 1;
    }

    /**
     * Ejecuta la conjuncion logica 'y' entre el objeto y un elemento del tipo ILogical
     * @param operador
     * un elemento del tipo ILogical
     * @return
     * un objeto que representa la operacion 'y' entre ambos parametros
     */
    @Override
    public ILogical and(ILogical operador) {
        return operador.andBinary(this);
    }

    /**
     * Ejecuta la conjuncion logica 'y' entre un objeto y otro objeto de tipo BoolType
     * @param BoolType
     * objeto de tipo BoolType con el que se hara la operacion
     * @return
     * un objeto de tipo BinaryType que representa la operacion
     */
    @Override
    public BinaryType andBool(BoolType BoolType) {
        return TypeFactory.getBinaryType(BoolType.getValue() ? this.getValue() : "0000000000000000");
    }

    /**
     * Ejecuta la conjuncion logica 'y' entre un objeto y otro objeto de tipo BinaryType
     * @param BinaryType
     * objeto de tipo BinaryType con el que se hara la operacion
     * @return
     * un objeto de tipo BinaryType que representa la operacion
     */
    @Override
    public BinaryType andBinary(BinaryType BinaryType) {
        int n = BinaryType.getValue().length();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < n; i++){
            boolean b1 = BinaryType.getValue().charAt(i) == '1';
            boolean b2 = this.getValue().charAt(i) == '1';
            resultado.append((b1 && b2) ? '1' : '0');
        }
        return TypeFactory.getBinaryType(resultado.toString());
    }

    /**
     * Ejecuta la conjuncion logica 'o' entre un objeto y un objeto de tipo ILogical
     * @param operador
     * es un objeto del tipo ILogical con el que se hara la operacion
     * @return
     * un objeto de tipo ILogical que representa la operacion 'o'
     */
    @Override
    public ILogical or(ILogical operador) {
        return operador.orBinary(this);
    }

    /**
     * Ejecuta la conjuncion logica 'o' entre un objeto y un objeto de tipo BoolType
     * @param BoolType
     * es un objeto del tipo BoolType con el que se hara la operacion
     * @return
     * un objeto de tipo BinaryType que representa la operacion 'o'
     */
    @Override
    public BinaryType orBool(BoolType BoolType) {
        return TypeFactory.getBinaryType(BoolType.getValue() ? "1111111111111111" : this.getValue());
    }

    /**
     * Ejecuta la conjuncion logica 'o' entre un objeto y un objeto de tipo BinaryType
     * @param BinaryType
     * es un objeto del tipo BinaryType con el que se hara la operacion
     * @return
     * un objeto de tipo BinaryType que representa la operacion 'o'
     */
    @Override
    public BinaryType orBinary(BinaryType BinaryType) {
        int n = BinaryType.getValue().length();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < n; i++){
            boolean b1 = BinaryType.getValue().charAt(i) == '1';
            boolean b2 = this.getValue().charAt(i) == '1';
            resultado.append((b1 || b2) ? '1' : '0');
        }
        return TypeFactory.getBinaryType(resultado.toString());
    }

    /**
     * Ejecuta una negacion
     * @return
     * Retorna un BinaryType con la negacion de un BinaryType
     */
    @Override
    public BinaryType not() {
        int n = this.getValue().length();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < n; i++){
            boolean b = this.getValue().charAt(i) == '1';
            resultado.append(!b ? '1' : '0');
        }
        return TypeFactory.getBinaryType(resultado.toString());
    }

    // Suma
    public IBinary add(IBinary addend){
        return addend.addToBinary(this);
    }

    /**
     * Suma un objeto del tipo IntType
     * @param IntType
     * se le suma un objeto IntType
     * @return
     * Retorna un objeto de tipo IntType con la suma
     */
    @Override
    public IntType addToInt(IntType IntType) {
        int int1 = IntType.getValue();
        int int2 = this.asInt().getValue();
        return TypeFactory.getIntType(int1 + int2);
    }

    /**
     * Suma un objeto del tipo BinaryType
     * @param BinaryType
     * se le suma un objeto BinaryType
     * @return
     * Retorna un objeto de tipo BinaryType con la suma
     */
    @Override
    public BinaryType addToBinary(BinaryType BinaryType) {
        int firstBinLen = this.getValue().length() - 1;
        int secondBinLen = BinaryType.getValue().length() - 1;
        StringBuilder sb = new StringBuilder();
        int resto = 0;
        while (firstBinLen >= 0 || secondBinLen >= 0){
            int suma = resto;
            if (firstBinLen >= 0){
                suma += this.getValue().charAt(firstBinLen) - '0';
                firstBinLen--;
            }
            if (secondBinLen >= 0){
                suma += BinaryType.getValue().charAt(secondBinLen) - '0';
                secondBinLen--;
            }
            resto = suma >> 1;
            suma = suma & 1;
            sb.append(suma == 0 ? '0' : '1');
        }
        if (resto > 0){
            sb.append('1');
        }
        sb.reverse();
        return TypeFactory.getBinaryType(String.valueOf(sb));
    }

    /**
     * Suma un objeto del tipo FloatType
     * @param FloatType
     * se le suma un objeto FloatType
     * @return
     * Retorna un objeto de tipo FloatType con la suma
     */
    @Override
    public FloatType addToFloat(FloatType FloatType) {
        double float1 = this.asFloat().getValue();
        double float2 = FloatType.getValue();
        return TypeFactory.getFloatType(float1 + float2);
    }

    //Resta
    public IBinary subtract(IBinary resta){
        return resta.subtractToBinary(this);
    }

    /**
     * Le resta un objeto de tipo IntType
     * @param minuend
     * es de tipo IntType y se resta
     * @return
     * IntType con el resultado de la resta
     */
    @Override
    public IntType subtractToInt(IntType minuend) {
        int intSubtrahend = this.asInt().getValue();
        int intMinuend = minuend.getValue();
        return TypeFactory.getIntType(intMinuend - intSubtrahend);
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
        double floatSubtrahend = this.asFloat().getValue();
        double floatMinuend = minuend.getValue();
        return TypeFactory.getFloatType(floatMinuend - floatSubtrahend);
    }

    /**
     * Le resta un objeto de tipo BinaryType
     * @param minuend
     * es de tipo BinaryType y se resta
     * @return
     * BinaryType con el resultado de la resta
     */
    @Override
    public BinaryType subtractToBinary(BinaryType minuend) {
        int intMinuend = minuend.asInt().getValue();
        int intSubtrahend = this.asInt().getValue();
        return TypeFactory.getIntType(intMinuend - intSubtrahend).asBinary();
    }

    //Multiplicacion
    public IBinary multiply(IBinary multiplicador){
        return multiplicador.multiplyToBinary(this);
    }

    /**
     * Multiplica el objeto con uno de tipo IntType
     * @param multiplicand
     * es de tipo IntType y se multiplicara
     * @return
     * un objeto IntType con el resultado de la multiplicacion
     */
    @Override
    public IntType multiplyToInt(IntType multiplicand) {
        int intMultiplier = this.asInt().getValue();
        int intMultiplicand = multiplicand.getValue();
        return TypeFactory.getIntType(intMultiplicand * intMultiplier);
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
        double floatMultiplier = this.asFloat().getValue();
        double floatMultiplicand = multiplicand.getValue();
        return TypeFactory.getFloatType(floatMultiplicand * floatMultiplier);
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
        int intMultiplier = this.asInt().getValue();
        return TypeFactory.getIntType(intMultiplicand * intMultiplier).asBinary();
    }

    //Division
    public IBinary divide(IBinary divisor){
        return divisor.divideToBinary(this);
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
        int intDivisor = this.asInt().getValue();
        int intDividend = dividend.getValue();
        return TypeFactory.getIntType(intDividend / intDivisor);
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
        double floatDivisor = this.asFloat().getValue();
        double floatDividend = dividend.getValue();
        return TypeFactory.getFloatType(floatDividend / floatDivisor);
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
        int intDivisor = this.asInt().getValue();
        int intDividend = dividend.asInt().getValue();
        return TypeFactory.getIntType(intDividend / intDivisor).asBinary();
    }

    @Override
    public int compareTo(BinaryType binarytype) {
        Integer binarytypevalue = Integer.valueOf(binarytype.asInt().getValue());
        Integer value = Integer.valueOf(this.asInt().getValue());
        return value.compareTo(binarytypevalue);
    }
}
