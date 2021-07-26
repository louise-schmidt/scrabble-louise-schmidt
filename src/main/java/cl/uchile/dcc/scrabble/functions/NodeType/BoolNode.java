package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.memory.NodesFactory.NodeTypeFactory;
import cl.uchile.dcc.scrabble.types.BoolType;

public class BoolNode extends Node implements Comparable<BoolNode>{
    private final BoolType value;

    public BoolNode(BoolType BoolType) {
        this.value = BoolType;
    }

    public BoolNode evaluate(){
        return this;
    }

    public BoolType getValue() {
        return this.value;
    }

    @Override
    public BoolNode toBoolNode(){
        return this;
    }

    @Override
    public TypeNode and(TypeNode operand){
        return operand.andBool(this);
    }

    @Override
    public BoolNode andBool(BoolNode boolNode){
        return NodeTypeFactory.newBoolNode(this.getValue().andBool(boolNode.getValue()).getValue());
    }

    @Override
    public BinaryNode andBinary(BinaryNode binaryNode){
        return NodeTypeFactory.newBinaryNode(this.getValue().andBinary(binaryNode.getValue()).getValue());
    }

    @Override
    public TypeNode or(TypeNode operand){
        return operand.orBool(this);
    }

    @Override
    public BoolNode orBool(BoolNode boolNode){
        return NodeTypeFactory.newBoolNode(this.getValue().orBool(boolNode.getValue()).getValue());
    }

    @Override
    public BinaryNode orBinary(BinaryNode binaryNode){
        return NodeTypeFactory.newBinaryNode(this.getValue().orBinary(binaryNode.getValue()).getValue());
    }

    @Override
    public BoolNode not(){
        return NodeTypeFactory.newBoolNode(this.getValue().not().getValue());
    }

    @Override
    public int compareTo(BoolNode boolnode) {
        return this.getValue().compareTo(boolnode.getValue());
    }
}
