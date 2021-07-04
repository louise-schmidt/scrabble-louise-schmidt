package cl.uchile.dcc.scrabble.types.operations;

public interface ILogical {
    ILogical and(ILogical conjunct);

    ILogical andBool(ILogical bool);

    ILogical or(ILogical operand);

    ILogical orBool(ILogical operand);

    ILogical andBinary(ILogical BinaryType);

}
