package cl.uchile.dcc.scrabble.operations;

import cl.uchile.dcc.scrabble.types.BoolType;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;

public interface ILogical {

    // And
    /**
     * Ejecuta el operador logico 'y' entre un objeto de tipo ILogical y otro objeto
     * @param operador
     * es el de tipo ILogical con el que se hará la operación
     * @return
     * un objeto de tipo ILogical que representa de la operacion
     */
    ILogical and(ILogical operador);

    /**
     * Ejecuta el operador logico 'y' entre un objeto de tipo BoolType y otro objeto
     * @param BoolType
     * es el de tipo BoolType con el que se hará la operación
     * @return
     * un objeto de tipo ILogical con el resultado de la operacion
     */
    ILogical andBool(BoolType BoolType);

    /**
     * Ejecuta el operador logico 'y' entre un objeto de tipo BinaryType y otro objeto
     * @param BinaryType
     * es el de tipo BinaryType con el que se hará la operación
     * @return
     * un objeto de tipo ILogical con el resultado de la operacion
     */
    ILogical andBinary(BinaryType BinaryType);

    // Or
    /**
     * Ejecuta el operador 'o' entre un objeto de tipo ILogical y otro objeto
     * @param operador
     * es el de tipo ILogical con el que se hará la operación
     * @return
     * un objeto de tipo ILogical con el resultado de la operacion
     */
    ILogical or(ILogical operador);

    /**
     * Ejecuta el operador 'o' entre un objeto de tipo BoolType y otro objeto
     * @param BoolType
     * es el de tipo BoolType con el que se hará la operación
     * @return
     * un objeto de tipo ILogical con el resultado de la operacion
     */
    ILogical orBool(BoolType BoolType);

    /**
     * Ejecuta el operador 'o' entre un objeto de tipo BinaryType y otro objeto
     * @param BinaryType
     * es el de tipo BinaryType con el que se hará la operación
     * @return
     * un objeto de tipo ILogical con el resultado de la operacion
     */
    ILogical orBinary(BinaryType BinaryType);

    // Not
    /**
     * Ejecuta la negación a un objeto this
     * @return
     * un objeto de tipo ILogical con el resultado de la operacion
     */
    ILogical not();
}
