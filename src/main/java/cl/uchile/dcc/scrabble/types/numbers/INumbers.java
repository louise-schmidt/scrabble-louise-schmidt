package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.iType;

public interface INumbers extends iType {

    //Sumas
    INumbers addToInt(IntType addend);
    INumbers addToFloat(FloatType addend);

    //Restas
    INumbers subtractToInt(IntType minuend);
    INumbers subtractToFloat(FloatType minuend);

    //Multiplicaciones
    INumbers multiplyToInt(IntType multiplicand);
    INumbers multiplyToFloat(FloatType multiplicand);

    //Divisiones
    INumbers divideToInt(IntType dividend);
    INumbers divideToFloat(FloatType dividend);
}
