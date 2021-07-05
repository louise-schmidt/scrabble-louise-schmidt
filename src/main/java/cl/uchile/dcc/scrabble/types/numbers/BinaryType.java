package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.types.StringType;
import cl.uchile.dcc.scrabble.types.AbstractType;
import cl.uchile.dcc.scrabble.types.operations.IBinary;
import cl.uchile.dcc.scrabble.types.operations.ILogical;
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
    public boolean equals(Object obj) {
        if (obj instanceof BinaryType) {
            var o = (BinaryType) obj;
            return o.value == this.value;
        }
        return false;
    }

    /**
     * @return valor hash del objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(BinaryType.class);
    }

    public String getValue() {
        return this.value;
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
    @Override
    public FloatType asFloat() {
        return this.asInt().asFloat();
    }

    /**
     * Transformacion BinaryType a IntType
     * @return nuevo IntType
     */
    @Override
    public IntType asInt() {
        if(bitToInt(this.getValue().charAt(0)) == 0){
            return new IntType(positiveBinToInt(this.getValue()));
        }
        else {
            return new IntType(negativeBinaryToInt(this.getValue()));
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
        return this;
    }

    /**
     * @param conjunct
     * @return conjuncion logica
     */
    public ILogical and(ILogical conjunct) {
        return conjunct.andBinary(this);
    }

    @Override
    public ILogical or(ILogical operand) {
        return null;
    }

    public IBinary add(IBinary addend) {
        return addend.addToBinary(this);
    }

    public IBinary multiply(IBinary product) {
        return product.multiplyToBinary(this);
    }

    public IBinary subtract(IBinary subtractor) {
        return subtractor.subtractToBinary(this);
    }

    public IBinary divide(IBinary divisor) {
        return divisor.divideToBinary(this);
    }


    @Override
    public StringType addToString(StringType addend) {
        return addend.addToString(this.asString());
    }

    @Override
    public BinaryType addToBinary(BinaryType addend) {
        return null;
    }

    @Override
    public BinaryType subtractToBinary(BinaryType subtractor) {
        return null;
    }

    @Override
    public BinaryType multiplyToBinary(BinaryType product) {
        return null;
    }

    @Override
    public BinaryType divideToBinary(BinaryType dividend) {
        return null;
    }

    @Override
    public ILogical andBool(ILogical bool) {
        return null;
    }

    @Override
    public ILogical orBool(ILogical operand) {
        return null;
    }

    @Override
    public ILogical andBinary(ILogical sBinary) {
        return null;
    }

    @Override
    public FloatType addToFloat(FloatType addend) {
        return null;
    }

    @Override
    public FloatType subtractToFloat(FloatType subtrahend) {
        return null;
    }

    @Override
    public INumbers subtractToInt(IntType subtrahend) {
        return null;
    }

    @Override
    public FloatType multiplyToFloat(FloatType product) {
        return null;
    }

    @Override
    public FloatType divideToFloat(FloatType divisor) {
        return null;
    }

    @Override
    public BinaryType addToInt(IntType addend) {
        return null;
    }

    @Override
    public BinaryType multiplyToInt(IntType product) {
        return null;
    }

    @Override
    public BinaryType divideToInt(IntType dividend) {
        return null;
    }
}
