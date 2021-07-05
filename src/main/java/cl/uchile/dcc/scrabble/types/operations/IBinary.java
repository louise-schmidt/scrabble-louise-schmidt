package cl.uchile.dcc.scrabble.types.operations;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

public interface IBinary {
    BinaryType addToBinary(BinaryType addend);

    BinaryType subtractToBinary(BinaryType subtractor);

    BinaryType multiplyToBinary(BinaryType product);

    BinaryType divideToBinary(BinaryType dividend);

    IntType asInt();

    BinaryType asBinary();
}
