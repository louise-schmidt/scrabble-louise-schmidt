package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.types.StringType;
import cl.uchile.dcc.scrabble.types.AbstractType;
import cl.uchile.dcc.scrabble.types.operations.IBinary;

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
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(IntType.class);
    }

    /**
     * Test Constructor
     **/
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IntType) {
            var o = (IntType) obj;
            return o.value == this.value;
        }
        return false;
    }

    /**
     * Transformacion SInt a SString
     **/
    public StringType asString() {
        return new StringType(Integer.toString(value));
    }

    /**
     * Transformacion de SInt a SInt
     * @return
     */
    public IntType asInt() {
        return this;
    }

    /**
     * Transformacion de SInt a SBinary
     * @return
     */
    @Override
    public BinaryType asBinary() {
        return new BinaryType(this.toBinaryStr());
    }

    /**
     * Transformacion SInt a SFloat
     **/
    @Override
    public FloatType asFloat() {
        return new FloatType(Double.valueOf(this.toString()));
    }

    /**
     * suma de tipo IntType con StringType
     * @param addend recibe un SString
     * @return llama a la funcion addToString que retorna un nuevo SString
     */
    @Override
    public StringType addToString(StringType addend) {
        return new StringType(addend.toString()+this.toString());
    }

    /**
     * Suma de IntType con FloatType
     */
    @Override
    public FloatType addToFloat(FloatType addend) {
        return addend.add(this);
    }

    /**
     * suma de dos IntType
     * @param addend se suma al IntType
     * @return un nuevo IntType
     */
    @Override
    public IntType addToInt(IntType addend) {
        int r = this.getValue() + addend.getValue();
        return new IntType(r);
    }

    /**
     * resta de dos IntType
     * @param subtrahend se resta al IntType
     * @return un nuevo IntType
     */
    @Override
    public IntType subtractToInt(IntType subtrahend) {
        int r = this.getValue() - subtrahend.getValue();
        return new IntType(r);
    }

    /**
     * Resta de IntType con FloatType
     */
    @Override
    public FloatType subtractToFloat(FloatType subtrahend) {
        return subtrahend.subtract(this);
    }

    /**
     * Multiplicacion de IntType con FloatType
     */
    @Override
    public FloatType multiplyToFloat(FloatType product) {
        return product.multiply(this);
    }

    /**
     * Division de SInt con SFloat
     */
    @Override
    public FloatType divideToFloat(FloatType divisor) {
        return divisor.divide(this);
    }

    /**
     * producto de dos SInt
     * @param product se multiplica con SInt
     * @return un nuevo SInt
     */
    @Override
    public IntType multiplyToInt(IntType product) {
        int r = this.getValue() * product.getValue();
        return new IntType(r);
    }

    /**
     * division de dos SInt
     * @param dividend divide a SInt
     * @return un nuevo SInt
     */
    @Override
    public INumbers divideToInt(IntType dividend) {
        int r = this.getValue() / dividend.getValue();
        return new IntType(r);
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

    private String toBinaryStr() {
        int bi = abs(this.value);
        IntType in = new IntType(bi);
        String resultado = in.positiveToBinary();
        if (this.value < 0) {
            String b = complementoDeDos(resultado);
            BinaryType sb = new BinaryType(b);
            return sb.toString();
        }
        BinaryType sb = new BinaryType(resultado);
        return sb.toString();
    }

    private String positiveToBinary() {
        int d;
        int n = this.value;
        int exp = 0;
        double bin = 0;
        while (n != 0) {
            d = n%2;
            bin = bin + (d * Math.pow(10, exp));
            exp++;
            n = n/2;
        }
        String bin2 = String.valueOf((int) bin);
        String res = String.format("%32s",bin2).replaceAll(" ", "0");
        return res;
    }

    private String complementoDeDos(String bin) {
        String t = "";
        String o = "";
        for (int i = 0; i < bin.length(); i++) {
            o += (bin.charAt(i) == '0') ? '1' : '0';
        }
        StringBuilder builder = new StringBuilder(o);
        boolean b = false;
        for (int i = o.length() -1; i>0; i--) {
            if (o.charAt(i) == '1') {
                builder.setCharAt(i, '0');
            }
            else {
                builder.setCharAt(i, '1');
                b=true;
                break;
            }
        }
        if (!b) {
            builder.append("1",0,7);
        }
        t = builder.toString();
        return t;
    }
}

