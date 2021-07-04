package cl.uchile.dcc.scrabble.types.numbers;

public interface INumbers {
    FloatType asFloat();

    FloatType addToFloat(FloatType addend);

    FloatType subtractToFloat(FloatType subtrahend);

    INumbers subtractToInt(IntType subtrahend);

    FloatType multiplyToFloat(FloatType product);

    FloatType divideToFloat(FloatType divisor);

    INumbers addToInt(IntType addend);

    INumbers multiplyToInt(IntType product);

    INumbers divideToInt(IntType dividend);
}
