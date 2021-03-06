package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.factories.NodesFactory.NodeTypeFactory;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;

/**
 * Clase de nodo binario
 * extiende la clase Nodo
 */
public class BinaryNode extends Node {
    private final BinaryType value;

    public BinaryNode(BinaryType BinaryType) {
        this.value = BinaryType;
    }

    public BinaryNode evaluate() {
        return this;
    }

    public BinaryType getValue() {
        return this.value;
    }

    @Override
    public TypeNode and(TypeNode operand){
        return operand.andBinary(this);
    }

    @Override
    public BinaryNode andBool(BoolNode boolNode){
        return NodeTypeFactory.newBinaryNode(this.getValue().andBool(boolNode.getValue()).getValue());
    }

    @Override
    public BinaryNode andBinary(BinaryNode binaryNode){
        return NodeTypeFactory.newBinaryNode(this.getValue().andBinary(binaryNode.getValue()).getValue());
    }

    @Override
    public TypeNode or(TypeNode operand){
        return operand.orBinary(this);
    }

    @Override
    public BinaryNode orBool(BoolNode boolNode){
        return NodeTypeFactory.newBinaryNode(this.getValue().orBool(boolNode.getValue()).getValue());
    }

    @Override
    public BinaryNode orBinary(BinaryNode binaryNode){
        return NodeTypeFactory.newBinaryNode(this.getValue().orBinary(binaryNode.getValue()).getValue());
    }

    @Override
    public BinaryNode not(){
        return NodeTypeFactory.newBinaryNode(this.getValue().not().getValue());
    }

    @Override
    public FloatNode toFloatNode(){
        return NodeTypeFactory.newFloatNode(this.getValue().asFloat().getValue());
    }

    @Override
    public IntNode toIntNode() {
        return NodeTypeFactory.newIntNode(this.getValue().asInt().getValue());
    }

    @Override
    public BinaryNode toBinaryNode() {
        return this;
    }

    @Override
    public TypeNode add(TypeNode addend){
        return addend.addToBinary(this);
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
        return subtrahend.subtractToBinary(this);
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
        return multiplier.multiplyToBinary(this);
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
        return divisor.divideToBinary(this);
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
     * Metodo que compara un objeto nodo de tipo scrabble con this binary
     * @param typeNode
     * es un nodo que contiene un objeto de tipo scrabble
     * @return
     * un entero igual a 0 si son iguales, menor a 0 si typeNode es menor o mayor a 0 en caso contrario
     */
    @Override
    public int compareTo(TypeNode typeNode) {
        return typeNode.compareToBinary(this);
    }

    /**
     * Compara un BinaryNode con un BinaryNode
     * @param binaryNode
     * el objeto que se utilizara para comparar
     * @return
     * un Integer menor, mayor o igual a 0 segun si el objeto ingresado es menor, mayor o igual a this
     */
    @Override
    public Integer compareToBinary(BinaryNode binaryNode) {
        return binaryNode.getValue().compareTo(this.getValue());
    }

    /**
     * Compara un IntNode con un BinaryNode
     * @param intNode
     * el objeto que se utilizara para comparar
     * @return
     * un Integer menor, mayor o igual a 0 segun si el objeto ingresado es menor, mayor o igual a this
     */
    @Override
    public Integer compareToInt(IntNode intNode) {
        return intNode.getValue().compareTo(this.getValue().asInt());
    }

    /**
     * Compara un FloatNode con un BinaryNode
     * @param floatNode
     * el objeto que se utilizara para comparar
     * @return
     * un Integer menor, mayor o igual a 0 segun si el objeto ingresado es menor, mayor o igual a this
     */
    @Override
    public Integer compareToFloat(FloatNode floatNode) {
        return floatNode.getValue().compareTo(this.getValue().asFloat());
    }

}
