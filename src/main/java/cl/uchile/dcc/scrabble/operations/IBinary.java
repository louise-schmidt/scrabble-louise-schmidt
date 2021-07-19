package cl.uchile.dcc.scrabble.operations;

import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

public interface IBinary {

    BinaryType addToBinary(BinaryType addend);

    BinaryType subtractToBinary(BinaryType minuend);

    BinaryType multiplyToBinary(BinaryType multiplicand);

    BinaryType divideToBinary(BinaryType dividend);

    IntType asInt();

    BinaryType asBinary();
}
