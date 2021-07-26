package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.memory.NodesFactory.NodeTypeFactory;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

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
}
