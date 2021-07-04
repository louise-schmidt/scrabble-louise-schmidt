package cl.uchile.dcc.scrabble.types.operations;

import cl.uchile.dcc.scrabble.types.BoolType;

public interface ILogical {
    ILogical and(ILogical conjunct);

    ILogical andBool(ILogical bool);

    ILogical or(ILogical operand);

    ILogical orBool(ILogical operand);

    ILogical andBinary(ILogical BinaryType);

}
