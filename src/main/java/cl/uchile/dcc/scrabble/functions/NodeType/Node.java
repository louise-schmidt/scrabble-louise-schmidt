package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.memory.NodesFactory.NodeTypeFactory;

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

    @Override
    public TypeNode not() {
        return null;
    }
}
