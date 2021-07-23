package cl.uchile.dcc.scrabble.memory.TypesFactory;

import cl.uchile.dcc.scrabble.types.StringType;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;
import cl.uchile.dcc.scrabble.types.numbers.IntType;
import cl.uchile.dcc.scrabble.types.BoolType;

public class TypeFactory {

    public static BinaryType getBinaryType(String value){
        return BinaryFactory.newBinaryType(value);
    }
    public static BoolType getBoolType(boolean value){
        return BoolFactory.newBoolType(value);
    }
    public static StringType getStringType(String value){
        return StringFactory.newStringType(value);
    }
    public static FloatType getFloatType(double value){
        return FloatFactory.newFloatType(value);
    }
    public static IntType getIntType(int value){
        return IntFactory.newIntType(value);
    }
}