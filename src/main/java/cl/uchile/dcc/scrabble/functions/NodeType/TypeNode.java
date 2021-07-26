package cl.uchile.dcc.scrabble.functions.NodeType;

public interface TypeNode extends INode, Comparable<TypeNode> {

    // Add
    TypeNode add(TypeNode addend);

    TypeNode addToInt(IntNode addend);

    TypeNode addToFloat(FloatNode addend);

    TypeNode addToBinary(BinaryNode addend);

    StringNode addToString(StringNode addend);

    // Subtract
    TypeNode subtract(TypeNode subtrahend);

    TypeNode subtractToInt(IntNode minuend);

    TypeNode subtractToFloat(FloatNode minuend);

    TypeNode subtractToBinary(BinaryNode minuend);


    // Multiply
    TypeNode multiply(TypeNode multiplier);

    TypeNode multiplyToInt(IntNode multiplicand);

    TypeNode multiplyToFloat(FloatNode multiplicand);

    TypeNode multiplyToBinary(BinaryNode multiplicand);


    // Divide
    TypeNode divide(TypeNode divisor);

    TypeNode divideToInt(IntNode dividend);

    TypeNode divideToFloat(FloatNode dividend);

    TypeNode divideToBinary(BinaryNode dividend);

    // And
    TypeNode and(TypeNode operand);

    TypeNode andBool(BoolNode boolNode);

    TypeNode andBinary(BinaryNode boolNode);

    // Or
    TypeNode or(TypeNode operand);

    TypeNode orBool(BoolNode boolNode);

    TypeNode orBinary(BinaryNode boolNode);

    // Not
    TypeNode not();

    // Casting
    BinaryNode toBinaryNode();

    BoolNode toBoolNode();

    FloatNode toFloatNode();

    IntNode toIntNode();

    StringNode toStringNode();

    // Comparison

    /**
     *
     * @param node
     * @return
     */
    int compareTo(TypeNode node);

    /**
     *
     * @param intNode
     * @return
     */
    Integer compareToInt(IntNode intNode);

    /**
     *
     * @param floatNode
     * @return
     */
    Integer compareToFloat(FloatNode floatNode);

    /**
     *
     * @param binaryNode
     * @return
     */
    Integer compareToBinary(BinaryNode binaryNode);

    /**
     *
     * @param boolNode
     * @return
     */
    Integer compareToBool(BoolNode boolNode);

    /**
     *
     * @param stringNode
     * @return
     */
    Integer compareToString(StringNode stringNode);
}