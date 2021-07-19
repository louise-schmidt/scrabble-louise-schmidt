package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.types.BoolType;
import cl.uchile.dcc.scrabble.types.StringType;
import cl.uchile.dcc.scrabble.types.AbstractType;
import cl.uchile.dcc.scrabble.operations.IBinary;
import cl.uchile.dcc.scrabble.operations.ILogical;
import java.util.Objects;

public class BinaryType extends AbstractType implements INumbers, IBinary, ILogical {
    private final String value;

    /**
     * Constructor de BinaryType
     **/
    public BinaryType(String value) {
        this.value = value;
    }

    /**
     * Test Constructor
     **/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BinaryType)) return false;
        BinaryType binario = (BinaryType) o;
        return Objects.equals(this.getValue(), binario.getValue());
    }

    /**
     * @return valor hash del objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getValue());
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString(){
        return this.getValue();
    }
    /**
     * Transformacion BinaryType a StringType
     **/
    @Override
    public StringType asString() {
        return new StringType(value);
    }

    /**
     * Transformacion BinaryType a FloatType
     **/
    public FloatType asFloat() {
        return TypeFactory.getIntType(toInt(this.getValue())).asFloat();
    }

    /**
     * Transformacion BinaryType a IntType
     * @return nuevo IntType
     */
    public IntType asInt(){
        return TypeFactory.getIntType(this.toInt(this.getValue()));
    }

    private int toInt(String binary){
        if (bitToInt(binary.charAt(0)) == 0){
            return positiveBinToInt(binary);
        }
        else{
            return negativeBinaryToInt(binary);
        }
    }

    private int negativeBinaryToInt(String binary) {
        int n = binary.length() - 1;
        int w = -bitToInt(binary.charAt(0)) * (int) Math.pow(2, n);
        for (int i = n, j = 0; i > 0; i--, j++) {
            w += (int) Math.pow(2, j) * (binary.charAt(i) == '1' ? 1 : 0);
        }
        return w;
    }
    private int positiveBinToInt(String binary) {
        int w = 0;
        for (int i = binary.length() - 1, j = 0; i > 0; i--, j++) {
            w += (int) Math.pow(2, j) * bitToInt(binary.charAt(i));
        }
        return w;
    }
    private int bitToInt(char bit) {
        return bit == '0' ? 0 : 1;
    }

    /**
     * Transformacion BinaryType a BinaryType
     * @return tipo BinaryType
     */
    @Override
    public BinaryType asBinary() {
        return TypeFactory.getBinaryType(this.getValue());
    }

    @Override
    public ILogical and(ILogical operand) {
        return operand.andBinary(this);
    }

    @Override
    public BinaryType andBool(BinaryType sBool) {
        return TypeFactory.getBinaryType(sBool.getValue() ? this.getValue() : "0000000000000000");
    }


    @Override
    public BinaryType andBinary(BinaryType sBinary) {
        int n = sBinary.getValue().length();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < n; i++){
            boolean b1 = sBinary.getValue().charAt(i) == '1';
            boolean b2 = this.getValue().charAt(i) == '1';
            resultado.append((b1 && b2) ? '1' : '0');
        }
        return TypeFactory.getBinaryType(resultado.toString());
    }

    @Override
    public ILogical or(ILogical operand) {
        return operand.orBinary(this);
    }

    @Override
    public BinaryType orBool(BoolType sBool) {
        return TypeFactory.getBinaryType(sBool.getValue() ? "1111111111111111" : this.getValue());
    }

    @Override
    public BinaryType orBinary(BinaryType sBinary) {
        int n = sBinary.getValue().length();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < n; i++){
            boolean b1 = sBinary.getValue().charAt(i) == '1';
            boolean b2 = this.getValue().charAt(i) == '1';
            resultado.append((b1 || b2) ? '1' : '0');
        }
        return TypeFactory.getBinaryType(resultado.toString());
    }

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

    //SUMA

    public IBinary add(IBinary addend){
        return addend.addToBinary(this);
    }

    /**
     * Adds an SInt object to this object.
     * @param addend
     *      The SInt object to be added.
     * @return
     *      New SBinary object representing the sum between both objects.
     */
    @Override
    public IntType addToInt(IntType addend) {
        int addend1 = addend.getValue();
        int addend2 = this.asInt().getValue();
        return TypeFactory.getIntType(addend1 + addend2);
    }

    @Override
    public BinaryType addToBinary(BinaryType unBinario) {
        int firstBinLen = this.getValue().length() - 1;
        int secondBinLen = unBinario.getValue().length() - 1;
        StringBuilder sb = new StringBuilder();
        int resto = 0;
        while (firstBinLen >= 0 || secondBinLen >= 0){
            int suma = resto;
            if (firstBinLen >= 0){
                suma += this.getValue().charAt(firstBinLen) - '0';
                firstBinLen--;
            }
            if (secondBinLen >= 0){
                suma += unBinario.getValue().charAt(secondBinLen) - '0';
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

    @Override
    public FloatType addToFloat(FloatType addend) {
        double addend1 = this.asFloat().getValue();
        double addend2 = addend.getValue();
        return TypeFactory.getFloatType(addend1 + addend2);
    }

    //RESTA
    public IBinary subtract(IBinary subtrahend){
        return subtrahend.subtractToBinary(this);
    }

    @Override
    public IntType subtractToInt(IntType minuend) {
        int intSubtrahend = this.asInt().getValue();
        int intMinuend = minuend.getValue();
        return TypeFactory.getIntType(intMinuend - intSubtrahend);
    }

    @Override
    public FloatType subtractToFloat(FloatType minuend) {
        double floatSubtrahend = this.asFloat().getValue();
        double floatMinuend = minuend.getValue();
        return TypeFactory.getFloatType(floatMinuend - floatSubtrahend);
    }

    @Override
    public BinaryType subtractToBinary(BinaryType minuend) {
        int intMinuend = minuend.asInt().getValue();
        int intSubtrahend = this.asInt().getValue();
        return TypeFactory.getIntType(intMinuend - intSubtrahend).asBinary();
    }

    //MULT

    public IBinary multiply(IBinary multiplier){
        return multiplier.multiplyToBinary(this);
    }

    @Override
    public IntType multiplyToInt(IntType multiplicand) {
        int intMultiplier = this.asInt().getValue();
        int intMultiplicand = multiplicand.getValue();
        return TypeFactory.getIntType(intMultiplicand * intMultiplier);
    }

    @Override
    public BinaryType multiplyToBinary(BinaryType multiplicand) {
        int intMultiplicand = multiplicand.asInt().getValue();
        int intMultiplier = this.asInt().getValue();
        return TypeFactory.getIntType(intMultiplicand * intMultiplier).asBinary();
    }

    @Override
    public FloatType multiplyToFloat(FloatType multiplicand) {
        double floatMultiplier = this.asFloat().getValue();
        double floatMultiplicand = multiplicand.getValue();
        return TypeFactory.getFloatType(floatMultiplicand * floatMultiplier);
    }

    //DIV

    public IBinary divide(IBinary divisor){
        return divisor.divideToBinary(this);
    }

    @Override
    public IntType divideToInt(IntType dividend) {
        int intDivisor = this.asInt().getValue();
        int intDividend = dividend.getValue();
        return TypeFactory.getIntType(intDividend / intDivisor);
    }

    @Override
    public BinaryType divideToBinary(BinaryType dividend) {
        int intDivisor = this.asInt().getValue();
        int intDividend = dividend.asInt().getValue();
        return TypeFactory.getIntType(intDividend / intDivisor).asBinary();
    }

    @Override
    public FloatType divideToFloat(FloatType dividend) {
        double floatDivisor = this.asFloat().getValue();
        double floatDividend = dividend.getValue();
        return TypeFactory.getFloatType(floatDividend / floatDivisor);
    }

}
