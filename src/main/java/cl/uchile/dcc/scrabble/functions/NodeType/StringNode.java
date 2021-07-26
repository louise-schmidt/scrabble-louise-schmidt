package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.types.StringType;

/**
 * Clase de nodo string
 * extiende la clase Nodo
 */
public class StringNode extends Node {
    private final StringType value;

    public StringNode(StringType sString) {
        this.value = sString;
    }

    public StringNode evaluate(){
        return this;
    }

    public StringType getValue() {
        return this.value;
    }

    @Override
    public StringNode add(TypeNode addend){
        return addend.addToString(this);
    }


    /**
     * Metodo que compara un objeto nodo de tipo scrabble con this string
     * @param typeNode
     * es un nodo que contiene un objeto de tipo scrabble
     * @return
     * un entero igual a 0 si son iguales, menor a 0 si typeNode es menor o mayor a 0 en caso contrario
     */
    @Override
    public int compareTo(TypeNode typeNode) {
        return typeNode.compareToString(this);
    }

    /**
     * Compara un StringNode con un StringNode
     * @param stringNode
     * el objeto que se utilizara para comparar
     * @return
     * un Integer menor, mayor o igual a 0 segun si el objeto ingresado es menor, mayor o igual a this
     */
    @Override
    public Integer compareToString(StringNode stringNode) {
        return stringNode.getValue().compareTo(this.getValue());
    }

}
