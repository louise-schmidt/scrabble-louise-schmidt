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
     * Compara TypeNode
     * @param node
     * de tipo TypeNode
     * @return
     * int
     */
    int compareTo(TypeNode node);

    /**
     * Compara un IntNode
     * @param intNode
     * se compara
     * @return
     * Integer
     */
    Integer compareToInt(IntNode intNode);

    /**
     * Compara un FloatNode
     * @param floatNode
     * se compara
     * @return
     * Integer
     */
    Integer compareToFloat(FloatNode floatNode);

    /**
     * Compara un BinaryNode
     * @param binaryNode
     * se compara
     * @return
     * Integer
     */
    Integer compareToBinary(BinaryNode binaryNode);

    /**
     * Compara un BoolNode
     * @param boolNode
     * se compara
     * @return
     * Integer
     */
    Integer compareToBool(BoolNode boolNode);

    /**
     * Compara un StringNode
     * @param stringNode
     * se compara
     * @return
     * Integer
     */
    Integer compareToString(StringNode stringNode);
}