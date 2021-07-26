package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.memory.NodesFactory.NodeTypeFactory;

/**
 * Clase Node
 * implementa TypeNode
 */
public abstract class Node implements TypeNode {
    @Override
    public TypeNode add(TypeNode addend){
        return null;
    }

    @Override
    public TypeNode addToInt(IntNode addend){
        return null;
    }

    @Override
    public TypeNode addToFloat(FloatNode addend){
        return null;
    }

    @Override
    public TypeNode addToBinary(BinaryNode addend){
        return null;
    }

    @Override
    public StringNode addToString(StringNode addend){
        return NodeTypeFactory.newStringNode(this.getValue().addToString(addend.getValue()).getValue());
    }

    @Override
    public TypeNode subtract(TypeNode subtrahend){
        return null;
    }

    @Override
    public TypeNode subtractToInt(IntNode minuend){
        return null;
    }

    @Override
    public TypeNode subtractToFloat(FloatNode minuend){
        return null;
    }

    @Override
    public TypeNode subtractToBinary(BinaryNode minuend){
        return null;
    }


    @Override
    public TypeNode multiply(TypeNode multiplier){
        return null;
    }

    @Override
    public TypeNode multiplyToInt(IntNode multiplicand){
        return null;
    }

    @Override
    public TypeNode multiplyToFloat(FloatNode multiplicand){
        return null;
    }

    @Override
    public TypeNode multiplyToBinary(BinaryNode multiplicand){
        return null;
    }


    @Override
    public TypeNode divide(TypeNode divisor){
        return null;
    }

    @Override
    public TypeNode divideToInt(IntNode dividend){
        return null;
    }

    @Override
    public TypeNode divideToFloat(FloatNode dividend){
        return null;
    }

    @Override
    public TypeNode divideToBinary(BinaryNode dividend){
        return null;
    }

    @Override
    public BinaryNode toBinaryNode(){
        return null;
    }

    @Override
    public BoolNode toBoolNode(){
        return null;
    }

    @Override
    public FloatNode toFloatNode(){
        return null;
    }

    @Override
    public IntNode toIntNode(){
        return null;
    }

    @Override
    public StringNode toStringNode(){
        return NodeTypeFactory.newStringNode(this.getValue().asString().getValue());
    }

    @Override
    public TypeNode not() {
        return null;
    }

    @Override
    public TypeNode and(TypeNode operand) {
        return null;
    }

    @Override
    public TypeNode andBool(BoolNode boolNode) {
        return null;
    }

    @Override
    public TypeNode andBinary(BinaryNode boolNode) {
        return null;
    }

    @Override
    public TypeNode or(TypeNode operand) {
        return null;
    }

    @Override
    public TypeNode orBool(BoolNode boolNode) {
        return null;
    }

    @Override
    public TypeNode orBinary(BinaryNode boolNode) {
        return null;
    }

    // Metodos compareTo para implementar double dispatch

    /**
     * Metodo que compara un objeto nodo de tipo TypeNode
     * @param node
     * es un nodo que contiene un objeto de tipo scrabble
     * @return
     * int 0
     */
    @Override
    public int compareTo(TypeNode node) {
        return 0;
    }

    /**
     * Metodo que compara un objeto nodo de tipo IntNode
     * @param intNode
     * es un nodo que contiene un objeto de tipo IntType
     * @return
     * Integer null
     */
    @Override
    public Integer compareToInt(IntNode intNode) {
        return null;
    }

    /**
     * Metodo que compara un objeto nodo de tipo FloatNode
     * @param floatNode
     * es un nodo que contiene un objeto de tipo FloatNode
     * @return
     * Integer null
     */
    @Override
    public Integer compareToFloat(FloatNode floatNode) {
        return null;
    }

    /**
     * Metodo que compara un objeto nodo de tipo BinaryType
     * @param binaryNode
     * es un nodo que contiene un objeto de tipo BinaryType
     * @return
     * Integer null
     */
    @Override
    public Integer compareToBinary(BinaryNode binaryNode) {
        return null;
    }

    /**
     * Metodo que compara un objeto nodo de tipo BoolType
     * @param boolNode
     * es un nodo que contiene un objeto de tipo BoolType
     * @return
     * Integer null
     */
    @Override
    public Integer compareToBool(BoolNode boolNode) {
        return null;
    }

    /**
     * Metodo que compara un objeto nodo de tipo StringType
     * @param stringNode
     * es un nodo que contiene un objeto de tipo StringType
     * @return
     * Integer null
     */
    @Override
    public Integer compareToString(StringNode stringNode) {
        return null;
    }
}
