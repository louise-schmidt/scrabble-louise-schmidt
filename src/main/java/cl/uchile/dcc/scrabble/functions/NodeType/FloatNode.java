package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.memory.NodesFactory.NodeTypeFactory;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;

/**
 * Clase de nodo float
 * extiende la clase Nodo
 */
public class FloatNode extends Node {
    private final FloatType value;

    public FloatNode(FloatType FloatType){
        this.value = FloatType;
    }

    public FloatNode evaluate(){
        return this;
    }

    public FloatType getValue() {
        return this.value;
    }

    @Override
    public FloatNode toFloatNode(){
        return this;
    }

    @Override
    public TypeNode add(TypeNode addend){
        return addend.addToFloat(this);
    }

    @Override
    public FloatNode addToInt(IntNode addend) {
        return NodeTypeFactory.newFloatNode(this.getValue().addToInt(addend.getValue()).getValue());
    }

    @Override
    public FloatNode addToFloat(FloatNode addend) {
        return NodeTypeFactory.newFloatNode(this.getValue().addToFloat(addend.getValue()).getValue());
    }

    @Override
    public TypeNode subtract(TypeNode subtrahend){
        return subtrahend.subtractToFloat(this);
    }

    @Override
    public FloatNode subtractToInt(IntNode minuend) {
        return NodeTypeFactory.newFloatNode(this.getValue().subtractToInt(minuend.getValue()).getValue());
    }

    @Override
    public FloatNode subtractToFloat(FloatNode minuend) {
        return NodeTypeFactory.newFloatNode(this.getValue().subtractToFloat(minuend.getValue()).getValue());
    }

    @Override
    public TypeNode multiply(TypeNode multiplier){
        return multiplier.multiplyToFloat(this);
    }

    @Override
    public FloatNode multiplyToInt(IntNode multiplicand) {
        return NodeTypeFactory.newFloatNode(this.getValue().multiplyToInt(multiplicand.getValue()).getValue());
    }

    @Override
    public FloatNode multiplyToFloat(FloatNode multiplicand) {
        return NodeTypeFactory.newFloatNode(this.getValue().multiplyToFloat(multiplicand.getValue()).getValue());
    }

    @Override
    public TypeNode divide(TypeNode divisor){
        return divisor.divideToFloat(this);
    }

    @Override
    public FloatNode divideToInt(IntNode dividend) {
        return NodeTypeFactory.newFloatNode(this.getValue().divideToInt(dividend.getValue()).getValue());
    }

    @Override
    public FloatNode divideToFloat(FloatNode dividend) {
        return NodeTypeFactory.newFloatNode(this.getValue().divideToFloat(dividend.getValue()).getValue());
    }

    /**
     * Metodo que compara un objeto nodo de tipo scrabble con this float
     * @param typeNode
     * es un nodo que contiene un objeto de tipo scrabble
     * @return
     * un entero igual a 0 si son iguales, menor a 0 si typeNode es menor o mayor a 0 en caso contrario
     */
    @Override
    public int compareTo(TypeNode typeNode) {
        return typeNode.compareToFloat(this);
    }

    /**
     * Compara un FloatNode con un FloatNode
     * @param floatNode
     * el objeto que se utilizara para comparar
     * @return
     * un Integer menor, mayor o igual a 0 segun si el objeto ingresado es menor, mayor o igual a this
     */
    @Override
    public Integer compareToFloat(FloatNode floatNode) {
        return floatNode.getValue().compareTo(this.getValue());
    }

    /**
     * Compara un IntNode con un FloatNode
     * @param intNode
     * el objeto que se utilizara para comparar
     * @return
     * un Integer menor, mayor o igual a 0 segun si el objeto ingresado es menor, mayor o igual a this
     */
    @Override
    public  Integer compareToInt(IntNode intNode) {
        return intNode.getValue().asFloat().compareTo(this.getValue());
    }

    /**
     * Compara un BinaryNode con un FloatNode
     * @param binaryNode
     * el objeto que se utilizara para comparar
     * @return
     * un Integer menor, mayor o igual a 0 segun si el objeto ingresado es menor, mayor o igual a this
     */
    @Override
    public Integer compareToBinary(BinaryNode binaryNode) {
        return binaryNode.getValue().asFloat().compareTo(this.getValue());
    }

}
