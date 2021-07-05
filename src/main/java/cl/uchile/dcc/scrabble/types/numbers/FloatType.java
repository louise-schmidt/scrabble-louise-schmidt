package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.types.AbstractType;
import cl.uchile.dcc.scrabble.types.StringType;
import java.util.Objects;

public class FloatType extends AbstractType implements INumbers {
    private final double value;

    /**
     * Constructor FloatType
     **/
    public FloatType(double value) {
        this.value = value;
    }

    /**
     * Test Constructor
     **/
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FloatType) {
            var o = (FloatType) obj;
            return o.value == this.value;
        }
        return false;
    }

    /**
     * @return valor hash del objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(FloatType.class);
    }

    /**
     * get de FloatType
     */
    public double getValue() {
        return value;
    }

    /**
     * Transformacion FloatType a StringType
     **/
    @Override
    public StringType asString() {
        return new StringType(Double.toString(value));
    }

    /**
     * Transformacion FloatType a FloatType
     **/
    public FloatType asFloat() {
        return this;
    }

    /**
     * suma de tipo FloatType con StringType
     * @param addend recibe un StringType
     * @return llama a la funcion add.ToString que retorna un nuevo StringType
     */
    @Override
    public StringType addToString(StringType addend) {
        return new StringType(addend.toString()+this.toString());
    }

    /**
     * suma de SFloat con cualquier tipo numero
     * @param addend cualquier tipo numero
     * @return llamado a addToFloat, que retorna un nuevo FloatType
     */
    public FloatType add(INumbers addend) {
        return addend.addToFloat(this.asFloat());
    }

    /**
     * resta de SFloat con cualquier tipo numero
     * @param subtractor cualquier tipo numero
     * @return llamado a subtractToFloat, que retorna un nuevo FloatType
     */
    public FloatType subtract(INumbers subtractor) {
        return subtractor.subtractToFloat(this.asFloat());
    }

    /**
     * multiplicacion de SFloat con cualquier tipo numero
     * @param product cualquier tipo numero
     * @return llamado a multiplyToFloat, que retorna un nuevo FloatType
     */
    public FloatType multiply(INumbers product) {
        return product.multiplyToFloat(this.asFloat());
    }

    /**
     * division de SFloat con cualquier tipo numero
     * @param divisor cualquier tipo numero
     * @return llamado a divideToFloat, que retorna un nuevo FloatType
     */
    public FloatType divide(INumbers divisor) {
        return divisor.divideToFloat(this.asFloat());
    }

    /**
     * Suma de dos FloatType
     * @return un nuevo FloatType
     */
    @Override
    public FloatType addToFloat(FloatType addend) {
        return new FloatType(this.value + addend.value);
    }

    /**
     * Resta de dos FloatType
     * @return un nuevo FloatType
     */
    @Override
    public FloatType subtractToFloat(FloatType subtrahend) {
        return new FloatType(this.value + subtrahend.value);
    }

    /**
     * Multiplicacion de dos FloatType
     * @return un nuevo FloatType
     */
    @Override
    public FloatType multiplyToFloat(FloatType product) {
        return new FloatType(this.value * product.value);
    }

    /**
     * Division de dos FloatType
     * @return un nuevo FloatType
     */
    @Override
    public FloatType divideToFloat(FloatType divisor) {
        return new FloatType(divisor.value / this.value);
    }

    /**
     * Suma de FloatType con IntType
     */
    @Override
    public FloatType addToInt(IntType addend) {
        return new FloatType(this.value + addend.asFloat().value);
    }

    /**
     * Resta de FloatType con IntType
     */
    @Override
    public FloatType subtractToInt(IntType subtrahend) {
        return new FloatType(this.value - subtrahend.asFloat().value);
    }

    /**
     * Multiplicacion de FloatType con IntType
     */
    @Override
    public FloatType multiplyToInt(IntType product) {
        return new FloatType(this.value * product.asFloat().value);
    }

    /**
     * Division de FloatType con IntType
     */
    @Override
    public FloatType divideToInt(IntType dividend) {
        return new FloatType(dividend.asFloat().value / this.value);
    }
}
