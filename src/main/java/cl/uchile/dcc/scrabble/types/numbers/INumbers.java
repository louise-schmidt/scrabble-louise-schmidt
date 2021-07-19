package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.memory.TypesFactory.IntFactory;
import cl.uchile.dcc.scrabble.types.AbstractType;


public interface INumbers extends AbstractType{

    //SUMA

    INumbers addToInt(IntType addend);

    INumbers addToFloat(FloatType addend);


    //RESTA

    INumbers subtractToInt(IntType minuend);

    INumbers subtractToFloat(FloatType minuend);


    //MULT

    INumbers multiplyToInt(IntType multiplicand);

    INumbers multiplyToFloat(FloatType multiplicand);


    //DIV

    INumbers divideToInt(IntType dividend);

    INumbers divideToFloat(FloatType dividend);
}
