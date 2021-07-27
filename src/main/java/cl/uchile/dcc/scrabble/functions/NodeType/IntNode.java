package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.factories.NodesFactory.NodeTypeFactory;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

/**
 * Clase de nodo int
 * extiende la clase Nodo
 */
public class IntNode extends Node {
    private final IntType value;

    public IntNode(IntType IntType) {
        this.value = IntType;
    }

    @Override
    public IntNode evaluate(){
        return this;
    }

    @Override
    public IntType getValue() {
        return this.value;
    }

    @Override
    public IntNode toIntNode() {
        return this;
    }

    @Override
    public FloatNode toFloatNode(){
        return NodeTypeFactory.newFloatNode(this.getValue().asFloat().getValue());
    }

    @Override
    public BinaryNode toBinaryNode() {
        return NodeTypeFactory.newBinaryNode(this.getValue().asBinary().getValue());
    }

    @Override
    public TypeNode add(TypeNode addend){
        return addend.addToInt(this);
    }

    @Override
    public IntNode addToInt(IntNode addend) {
        return NodeTypeFactory.newIntNode(this.getValue().addToInt(addend.getValue()).getValue());
    }

    @Override
    public FloatNode addToFloat(FloatNode addend) {
        return NodeTypeFactory.newFloatNode(this.getValue().addToFloat(addend.getValue()).getValue());
    }

    @Override
    public BinaryNode addToBinary(BinaryNode addend) {
        return NodeTypeFactory.newBinaryNode(this.getValue().addToBinary(addend.getValue()).getValue());
    }

    @Override
    public TypeNode subtract(TypeNode subtrahend){
        return subtrahend.subtractToInt(this);
    }

    @Override
    public IntNode subtractToInt(IntNode minuend) {
        return NodeTypeFactory.newIntNode(this.getValue().subtractToInt(minuend.getValue()).getValue());
    }

    @Override
    public FloatNode subtractToFloat(FloatNode minuend) {
        return NodeTypeFactory.newFloatNode(this.getValue().subtractToFloat(minuend.getValue()).getValue());
    }

    @Override
    public BinaryNode subtractToBinary(BinaryNode minuend) {
        return NodeTypeFactory.newBinaryNode(this.getValue().subtractToBinary(minuend.getValue()).getValue());
    }

    @Override
    public TypeNode multiply(TypeNode multiplier){
        return multiplier.multiplyToInt(this);
    }

    @Override
    public IntNode multiplyToInt(IntNode multiplicand) {
        return NodeTypeFactory.newIntNode(this.getValue().multiplyToInt(multiplicand.getValue()).getValue());
    }

    @Override
    public FloatNode multiplyToFloat(FloatNode multiplicand) {
        return NodeTypeFactory.newFloatNode(this.getValue().multiplyToFloat(multiplicand.getValue()).getValue());
    }

    @Override
    public BinaryNode multiplyToBinary(BinaryNode multiplicand) {
        return NodeTypeFactory.newBinaryNode(this.getValue().multiplyToBinary(multiplicand.getValue()).getValue());
    }

    @Override
    public TypeNode divide(TypeNode divisor){
        return divisor.divideToInt(this);
    }

    @Override
    public IntNode divideToInt(IntNode dividend) {
        return NodeTypeFactory.newIntNode(this.getValue().divideToInt(dividend.getValue()).getValue());
    }

    @Override
    public FloatNode divideToFloat(FloatNode dividend) {
        return NodeTypeFactory.newFloatNode(this.getValue().divideToFloat(dividend.getValue()).getValue());
    }

    @Override
    public BinaryNode divideToBinary(BinaryNode dividend) {
        return NodeTypeFactory.newBinaryNode(this.getValue().divideToBinary(dividend.getValue()).getValue());
    }


    /**
     * Metodo que compara un objeto nodo de tipo scrabble con this int
     * @param typeNode
     * es un nodo que contiene un objeto de tipo scrabble
     * @return
     * un entero igual a 0 si son iguales, menor a 0 si typeNode es menor o mayor a 0 en caso contrario
     */
    @Override
    public int compareTo(TypeNode typeNode) {
        return typeNode.compareToInt(this);
    }

    /**
     * Compara un IntNode con un IntNode
     * @param intNode
     * el objeto que se utilizara para comparar
     * @return
     * un Integer menor, mayor o igual a 0 segun si el objeto ingresado es menor, mayor o igual a this
     */
    @Override
    public Integer compareToInt(IntNode intNode) {
        return intNode.getValue().compareTo(this.getValue());
    }

    /**
     * Compara un FloatNode con un IntNote
     * @param floatNode
     * el objeto que se utilizara para comparar
     * @return
     * un Integer menor, mayor o igual a 0 segun si el objeto ingresado es menor, mayor o igual a this
     */
    @Override
    public Integer compareToFloat(FloatNode floatNode) {
        return floatNode.getValue().compareTo(this.getValue().asFloat());
    }

    /**
     * Compara un BinaryNode con un IntNode
     * @param binaryNode
     * el objeto que se utilizara para comparar
     * @return
     * un Integer menor, mayor o igual a 0 segun si el objeto ingresado es menor, mayor o igual a this
     */
    @Override
    public Integer compareToBinary(BinaryNode binaryNode) {
        return binaryNode.getValue().compareTo(this.getValue().asBinary());
    }
}
