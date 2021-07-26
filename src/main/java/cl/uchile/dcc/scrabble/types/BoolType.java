package cl.uchile.dcc.scrabble.types;

import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.operations.ILogical;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;

/**
 * La clase BoolType genera un objeto del tipo boolean
 * Representan un valor booleano
 */
public class BoolType extends AbstractType implements iType, ILogical, Comparable<BoolType> {
    private final boolean value;

    /**
     * valor inmutable del IntType
     */
    public BoolType(boolean value) {
        this.value = value;
    }

    /**
     * Retorn el valor del objeto BoolType como un objeto de tipo boolean
     * @return
     * la representacion de tipo boolean del objeto
     */
    public boolean getValue(){
        return this.value;
    }

    /**
     * Compara el objeto this con el objeto o
     * Son iguales si el argumento es un BoolType del mismo valor que el objeto
     * @param o
     * el objeto con el que se compara
     * @return
     * true si los objetos son iguales o false en el caso contrario
     **/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoolType)) return false;
        BoolType booleano = (BoolType) o;
        return this.getValue() == booleano.getValue();
    }

    /**
     * Retorna un hashCode para BoolType
     * @return
     * un hash code para el objeto
     */
    @Override
    public int hashCode() {
        return this.getValue() ? 1231 : 1237;
    }

    /**
     * Retorna un objeto de tipo String representando el valor del objeto BoolType
     * @return
     * un String que representa el valor del objeto
     */
    @Override
    public String toString(){
        return String.valueOf(this.getValue());
    }

    /**
     * Retorna un tipo StringType representando el valor del objeto BoolType
     * @return
     * un objeto StrinType que representa el valor del objeto
     */
    public StringType asString() {
        return TypeFactory.getStringType(this.toString());
    }

    /**
     * retorna un objeto de tipo BoolType que representa un valor booleano
     * @return
     * un BoolType que representa un valor booleano
     */
    public BoolType asBool() {
        return this;
    }

    /**
     * Ejecuta la conjuncion logica 'y' entre el objeto y un elemento del tipo ILogical
     * @param operador
     * un elemento del tipo ILogical
     * @return
     * un objeto que representa la operacion 'y' entre ambos parametros
     */
    @Override
    public ILogical and(ILogical operador) {
        return operador.andBool(this);
    }

    /**
     * Ejecuta la conjuncion logica 'y' entre un objeto y otro objeto de tipo BoolType
     * @param BoolType
     * objeto de tipo BoolType con el que se hara la operacion
     * @return
     * un objeto de tipo BoolType que representa la operacion
     */
    @Override
    public BoolType andBool(BoolType BoolType) {
        return TypeFactory.getBoolType(BoolType.getValue() && this.getValue());
    }

    /**
     * Ejecuta la conjuncion logica 'y' entre un objeto y otro objeto de tipo BinaryType
     * @param BinaryType
     * objeto de tipo BinaryType con el que se hara la operacion
     * @return
     * un objeto de tipo BinaryType que representa la operacion
     */
    @Override
    public BinaryType andBinary(BinaryType BinaryType) {
        return TypeFactory.getBinaryType(this.getValue() ? BinaryType.getValue() : "0000000000000000");
    }

    /**
     * Ejecuta la conjuncion logica 'o' entre un objeto y un objeto de tipo ILogical
     * @param operador
     * es un objeto del tipo ILogical con el que se hara la operacion
     * @return
     * un objeto de tipo ILogical que representa la operacion 'o'
     */
    @Override
    public ILogical or(ILogical operador) {
        return operador.orBool(this);
    }

    /**
     * Ejecuta la conjuncion logica 'o' entre un objeto y un objeto de tipo BoolType
     * @param BoolType
     * es un objeto del tipo BoolType con el que se hara la operacion
     * @return
     * un objeto de tipo BoolType que representa la operacion 'o'
     */
    @Override
    public BoolType orBool(BoolType BoolType) {
        return TypeFactory.getBoolType(BoolType.getValue() || this.getValue());
    }

    /**
     * Ejecuta la conjuncion logica 'o' entre un objeto y un objeto de tipo BinaryType
     * @param BinaryType
     * es un objeto del tipo BinaryType con el que se hara la operacion
     * @return
     * un objeto de tipo BinaryType que representa la operacion 'o'
     */
    @Override
    public BinaryType orBinary(BinaryType BinaryType) {
        return TypeFactory.getBinaryType(this.getValue() ? "1111111111111111" : BinaryType.getValue());
    }

    /**
     * Ejecuta una negacion
     * @return
     * Retorna un BoolType con la negacion de un BoolType
     */
    @Override
    public BoolType not(){
        return TypeFactory.getBoolType(!this.getValue());
    }

    /**
     * Compara un BoolType con un BoolType
     * @param booltype
     * el objeto que se utilizara para comparar
     * @return
     * un int menor, mayor o igual a 0 segun si this es menor, mayor o igual a booltype
     */
    @Override
    public int compareTo(BoolType booltype) {
        Boolean booltypevalue = Boolean.valueOf(booltype.getValue());
        Boolean value = Boolean.valueOf(this.getValue());
        return value.compareTo(booltypevalue);
    }
}
