package cl.uchile.dcc.scrabble.transformations.NodeType;

import cl.uchile.dcc.scrabble.memory.NodesFactory.NodeTypeFactory;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;

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

}
