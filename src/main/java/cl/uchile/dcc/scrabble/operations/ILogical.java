package cl.uchile.dcc.scrabble.operations;

import cl.uchile.dcc.scrabble.types.BoolType;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;

public interface ILogical {

    // AND
    ILogical and(ILogical operand);

    ILogical andBool(BoolType sBool);

    ILogical andBinary(BinaryType sBinary);

    // OR
    ILogical or(ILogical operand);

    ILogical orBool(BoolType sBool);

    ILogical orBinary(BinaryType sBinary);

    // NOT
    ILogical not();
}
