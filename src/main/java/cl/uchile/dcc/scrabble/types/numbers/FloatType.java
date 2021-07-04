package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.types.AbstractType;
import cl.uchile.dcc.scrabble.types.StringType;

import java.util.Objects;

public class FloatType extends AbstractType implements INumbers {
    private final double value;

    /**
     * Constructor
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
     * get de SFloat
     */
    public double getValue() {
        return value;
    }

    /**
     * Transformacion SFloat a SString
     **/
    @Override
    public StringType asString() {
        return new StringType(Double.toString(value));
    }

    /**
     * Transformacion SFloat a SFloat
     **/
    public FloatType asFloat() {
        return this;
    }

    /**
     * suma de tipo SFloat con SString
     * @param addend recibe un SString
     * @return llama a la funcion add.ToString que retorna un nuevo SString
     */
    @Override
    public StringType addToString(StringType addend) {
        return new StringType(addend.toString()+this.toString());
    }

    /**
     * suma de SFloat con cualquier SNumero
     * @param addend cualquier SNumero
     * @return llamado a addToFloat, que retorna un nuevo SFloat
     */
    public FloatType add(INumbers addend) {
        return addend.addToFloat(this.asFloat());
    }

    /**
     * resta de SFloat con cualquier SNumero
     * @param subtractor cualquier SNumero
     * @return llamado a subtractToFloat, que retorna un nuevo SFloat
     */
    public FloatType subtract(INumbers subtractor) {
        return subtractor.subtractToFloat(this.asFloat());
    }

    /**
     * multiplicacion de SFloat con cualquier SNumero
     * @param product cualquier SNumero
     * @return llamado a multiplyToFloat, que retorna un nuevo SFloat
     */
    public FloatType multiply(INumbers product) {
        return product.multiplyToFloat(this.asFloat());
    }

    /**
     * division de SFloat con cualquier SNumero
     * @param divisor cualquier SNumero
     * @return llamado a divideToFloat, que retorna un nuevo SFloat
     */
    public FloatType divide(INumbers divisor) {
        return divisor.divideToFloat(this.asFloat());
    }

    /**
     * Suma de dos SFloat
     * @return un nuevo SFloat
     */
    @Override
    public FloatType addToFloat(FloatType addend) {
        return new FloatType(this.value + addend.value);
    }

    /**
     * Resta de dos SFloat
     * @return un nuevo SFloat
     */
    @Override
    public FloatType subtractToFloat(FloatType subtrahend) {
        return new FloatType(this.value + subtrahend.value);
    }

    /**
     * Multiplicacion de dos SFloat
     * @return un nuevo SFloat
     */
    @Override
    public FloatType multiplyToFloat(FloatType product) {
        return new FloatType(this.value * product.value);
    }

    /**
     * Division de dos SFloat
     * @return un nuevo SFloat
     */
    @Override
    public FloatType divideToFloat(FloatType divisor) {
        return new FloatType(divisor.value / this.value);
    }

    /**
     * Suma de SFloat con SInt
     */
    @Override
    public FloatType addToInt(IntType addend) {
        return new FloatType(this.value + addend.asFloat().value);
    }

    /**
     * Resta de SFloat con SInt
     */
    @Override
    public FloatType subtractToInt(IntType subtrahend) {
        return new FloatType(this.value - subtrahend.asFloat().value);
    }

    /**
     * Multiplicacion de SFloat con SInt
     */
    @Override
    public FloatType multiplyToInt(IntType product) {
        return new FloatType(this.value * product.asFloat().value);
    }

    /**
     * Division de SFloat con SInt
     */
    @Override
    public FloatType divideToInt(IntType dividend) {
        return new FloatType(dividend.asFloat().value / this.value);
    }
}
