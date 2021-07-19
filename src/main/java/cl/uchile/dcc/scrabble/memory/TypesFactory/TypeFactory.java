package cl.uchile.dcc.scrabble.memory.TypesFactory;

import cl.uchile.dcc.scrabble.types.StringType;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

public class TypeFactory {

    public static BinaryType getBinaryType(String value){
        return BinaryFactory.get(value);
    }
    public static BinaryType getBoolType(boolean value){
        return BoolFactory.get(value);
    }
    public static StringType getStringType(String value){
        return StringFactory.get(value);
    }
    public static FloatType getFloatType(double value){
        return FloatFactory.get(value);
    }
    public static IntType getIntType(int value){
        return IntFactory.get(value);
    }

}