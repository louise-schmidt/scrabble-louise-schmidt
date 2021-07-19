package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FloatType)) return false;
        FloatType floattype = (FloatType) o;
        return this.getValue() == floattype.getValue();
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
    public StringType asString() {
        return TypeFactory.getStringType(this.toString());
    }
    /**
     * Transformacion FloatType a FloatType
     **/
    public FloatType asFloat() {
        return TypeFactory.getFloatType(this.getValue());
    }

    public INumbers add(INumbers unNumero) {
        return unNumero.addToFloat(this);
    }
    /**
     * suma de SFloat con cualquier tipo numero
     * @param addend cualquier tipo numero
     * @return llamado a addToFloat, que retorna un nuevo FloatType
     */
    @Override
    public FloatType addToInt(IntType addend) {
        return TypeFactory.getFloatType(addend.getValue() + this.getValue());
    }

    @Override
    public FloatType addToFloat(FloatType addend) {
        return TypeFactory.getFloatType(addend.getValue() + this.getValue());
    }

    public INumbers subtract(INumbers unNumero) {
        return unNumero.subtractToFloat(this);
    }

    @Override
    public FloatType subtractToInt(IntType minuend) {
        return TypeFactory.getFloatType(minuend.getValue() - this.getValue());
    }


    @Override
    public FloatType subtractToFloat(FloatType minuend) {
        return TypeFactory.getFloatType(minuend.getValue() - this.getValue());
    }

    public INumbers multiply(INumbers product) {
        return product.multiplyToFloat(this);
    }

    @Override
    public FloatType multiplyToInt(IntType multiplicand) {
        return TypeFactory.getFloatType(multiplicand.getValue() * this.getValue());
    }

    @Override
    public FloatType multiplyToFloat(FloatType multiplicand) {
        return TypeFactory.getFloatType(multiplicand.getValue() * this.getValue());
    }

    public INumbers divide(INumbers divisor) {
        return divisor.divideToFloat(this);
    }

    @Override
    public FloatType divideToInt(IntType dividend) {
        return TypeFactory.getFloatType(dividend.getValue() / this.getValue());
    }

    @Override
    public FloatType divideToFloat(FloatType dividend) {
        return TypeFactory.getFloatType(dividend.getValue() / this.getValue());
    }
}
