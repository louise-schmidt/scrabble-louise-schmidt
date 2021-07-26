package cl.uchile.dcc.scrabble.functions.NodeType;

public interface TypeNode extends INode, Comparable<TypeNode> {

    // ADD
    TypeNode add(TypeNode addend);

    TypeNode addToInt(IntNode addend);

    TypeNode addToFloat(FloatNode addend);

    TypeNode addToBinary(BinaryNode addend);

    StringNode addToString(StringNode addend);

    // SUBTRACT
    TypeNode subtract(TypeNode subtrahend);

    TypeNode subtractToInt(IntNode minuend);

    TypeNode subtractToFloat(FloatNode minuend);

    TypeNode subtractToBinary(BinaryNode minuend);


    // MULTIPLY
    TypeNode multiply(TypeNode multiplier);

    TypeNode multiplyToInt(IntNode multiplicand);

    TypeNode multiplyToFloat(FloatNode multiplicand);

    TypeNode multiplyToBinary(BinaryNode multiplicand);


    // DIVIDE
    TypeNode divide(TypeNode divisor);

    TypeNode divideToInt(IntNode dividend);

    TypeNode divideToFloat(FloatNode dividend);

    TypeNode divideToBinary(BinaryNode dividend);

    // AND
    TypeNode and(TypeNode operand);

    TypeNode andBool(BoolNode boolNode);

    TypeNode andBinary(BinaryNode boolNode);

    // OR
    TypeNode or(TypeNode operand);

    TypeNode orBool(BoolNode boolNode);

    TypeNode orBinary(BinaryNode boolNode);

    // NOT
    TypeNode not();

    // CASTING
    BinaryNode toBinaryNode();

    BoolNode toBoolNode();

    FloatNode toFloatNode();

    IntNode toIntNode();

    StringNode toStringNode();

}