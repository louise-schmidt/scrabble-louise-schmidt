package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.memory.NodesFactory.NodeTypeFactory;
import cl.uchile.dcc.scrabble.types.BoolType;

/**
 * Clase de nodo bool
 * extiende la clase Nodo
 */
public class BoolNode extends Node {
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


    /**
     * Metodo que compara un objeto nodo de tipo scrabble con this bool
     * @param typeNode
     * es un nodo que contiene un objeto de tipo scrabble
     * @return
     * un entero igual a 0 si son iguales, menor a 0 si typeNode es menor o mayor a 0 en caso contrario
     */
    @Override
    public int compareTo(TypeNode typeNode) {
        return typeNode.compareToBool(this);
    }

    /**
     * Compara un BoolNode con un BoolNode
     * @param boolNode
     * el objeto que se utilizara para comparar
     * @return
     * un Integer menor, mayor o igual a 0 segun si el objeto ingresado es menor, mayor o igual a this
     */
    @Override
    public Integer compareToBool(BoolNode boolNode) {
        return boolNode.getValue().compareTo(this.getValue());
    }
}
