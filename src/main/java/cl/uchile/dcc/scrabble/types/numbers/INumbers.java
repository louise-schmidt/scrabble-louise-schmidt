package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.iType;

public interface INumbers extends iType {

    //Suma
    INumbers addToInt(IntType addend);
    INumbers addToFloat(FloatType addend);

    //Resta
    INumbers subtractToInt(IntType minuend);
    INumbers subtractToFloat(FloatType minuend);

    //Multiplicacion
    INumbers multiplyToInt(IntType multiplicand);
    INumbers multiplyToFloat(FloatType multiplicand);

    //Division
    INumbers divideToInt(IntType dividend);
    INumbers divideToFloat(FloatType dividend);
}
