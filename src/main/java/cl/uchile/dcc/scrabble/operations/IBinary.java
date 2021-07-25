package cl.uchile.dcc.scrabble.operations;

import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

public interface IBinary {

    /**
     * Suma un objeto tipo scrabble a un objeto IntType
     * @param suma
     * el objeto IntType al que se sumará el objeto
     * @return
     * un objeto tipo scrabble representando la suma
     */
    BinaryType addToBinary(BinaryType suma);

    /**
     * Resta un objeto tipo scrabble a un objeto IntType
     * @param resta
     * el objeto IntType al que se restará el objeto
     * @return
     * un objeto tipo scrabble representando la resta
     */
    BinaryType subtractToBinary(BinaryType resta);

    /**
     * Multiplica un objeto tipo scrabble a un objeto IntType
     * @param multiplicacion
     * el objeto IntType al que se multiplicará el objeto
     * @return
     * un objeto tipo scrabble representando la multiplicacion
     */
    BinaryType multiplyToBinary(BinaryType multiplicacion);

    /**
     * Division un objeto tipo scrabble a un objeto IntType
     * @param division
     * el objeto IntType al que se dividira el objeto
     * @return
     * un objeto tipo scrabble representando la division
     */
    BinaryType divideToBinary(BinaryType division);

    /**
     * Retorna un objeto IntType representando el valor del BinaryType
     * @return
     * un IntType representando el valor del objeto this
     */
    IntType asInt();

    /**
     * Retorna un objeto BinaryType representando el valor del BinaryType
     * @return
     * un BinaryType representando el valor del objeto this
     */
    BinaryType asBinary();
}
