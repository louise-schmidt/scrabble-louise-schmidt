package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.types.StringType;
import cl.uchile.dcc.scrabble.types.AbstractType;
import cl.uchile.dcc.scrabble.operations.IBinary;
import java.util.Objects;
import static java.lang.Math.abs;

public class IntType extends AbstractType implements INumbers, IBinary {
    private final int value;

    /**
     * Constructor
     **/
    public IntType(int value) {
        this.value = value;
    }

    /**
     * getter
     * @return
     */
    public int getValue() {
        return this.value;
    }

    /**
     * @return valor hash del objeto
     */
    @Override
    public int hashCode() {
        return this.getValue();
    }

    /**
     * Test Constructor
     **/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntType)) return false;
        IntType entero = (IntType) o;
        return this.getValue() == entero.getValue();
    }

    @Override
    public String toString(){
        return String.valueOf(this.getValue());
    }

    @Override
    public StringType asString() {
        return TypeFactory.getStringType(this.toString());
    }

    @Override
    public IntType asInt() {
        return TypeFactory.getIntType(this.getValue());
    }


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
    /**
     * Transformacion SInt a SFloat
     **/
    public FloatType asFloat() {
        return TypeFactory.getFloatType(this.getValue());
    }

    public INumbers add(INumbers addend){
        return addend.addToInt(this);
    }

    @Override
    public IntType addToInt(IntType addend){
        return TypeFactory.getIntType(addend.getValue() + this.getValue());
    }

    @Override
    public FloatType addToFloat(FloatType addend){
        return TypeFactory.getFloatType(addend.getValue() + this.getValue());
    }

    @Override
    public BinaryType addToBinary(BinaryType addend) {
        int addend1 = addend.asInt().getValue();
        int addend2 = this.getValue();
        return TypeFactory.getIntType(addend1 + addend2).asBinary();
    }

    //RESTA
    public INumbers subtract(INumbers subtrahend){
        return subtrahend.subtractToInt(this);
    }

    @Override
    public IntType subtractToInt(IntType minuend){
        return TypeFactory.getIntType(minuend.getValue() - this.getValue());
    }

    @Override
    public FloatType subtractToFloat(FloatType minuend){
        return TypeFactory.getFloatType(minuend.getValue() - this.getValue());
    }

    @Override
    public BinaryType subtractToBinary(BinaryType minuend) {
        int intMinuend = minuend.asInt().getValue();
        int intSubtrahend = this.getValue();
        return TypeFactory.getIntType(intMinuend - intSubtrahend).asBinary();
    }

    //MULT
    public INumbers multiply(INumbers multiplier){
        return multiplier.multiplyToInt(this);
    }

    @Override
    public IntType multiplyToInt(IntType multiplicand){
        return TypeFactory.getIntType(multiplicand.getValue() * this.getValue());
    }

    @Override
    public FloatType multiplyToFloat(FloatType multiplicand){
        return TypeFactory.getFloatType(multiplicand.getValue() * this.getValue());
    }

    @Override
    public BinaryType multiplyToBinary(BinaryType multiplicand) {
        int intMultiplicand = multiplicand.asInt().getValue();
        int intMultiplier = this.getValue();
        return TypeFactory.getIntType(intMultiplicand * intMultiplier).asBinary();
    }


    //DIV

    public INumbers divide(INumbers divisor) {
        return divisor.divideToInt(this);
    }

    @Override
    public IntType divideToInt(IntType dividend) {
        return TypeFactory.getIntType(dividend.getValue() / this.getValue());
    }

    @Override
    public FloatType divideToFloat(FloatType dividend) {
        return TypeFactory.getFloatType(dividend.getValue() / this.getValue());
    }

    @Override
    public BinaryType divideToBinary(BinaryType dividend) {
        int intDividend = dividend.asInt().getValue();
        int intDivisor = this.getValue();
        return TypeFactory.getIntType(intDividend / intDivisor).asBinary();
    }
}


