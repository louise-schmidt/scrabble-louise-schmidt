package cl.uchile.dcc.scrabble.memory.NodesFactory;

import cl.uchile.dcc.scrabble.memory.TypesFactory.BinaryFactory;
import cl.uchile.dcc.scrabble.types.BoolType;
import cl.uchile.dcc.scrabble.memory.TypesFactory.BoolFactory;
import cl.uchile.dcc.scrabble.types.StringType;
import cl.uchile.dcc.scrabble.memory.TypesFactory.StringFactory;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;
import cl.uchile.dcc.scrabble.memory.TypesFactory.FloatFactory;
import cl.uchile.dcc.scrabble.memory.TypesFactory.IntFactory;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

public class TypesFactory {

    public static BinaryType getSBinary(String value){
        return BinaryFactory.get(value);
    }
    public static BoolType getSBool(boolean value){
        return BoolFactory.get(value);
    }
    public static StringType getSString(String value){
        return StringFactory.get(value);
    }
    public static FloatType getSFloat(double value){
        return FloatFactory.get(value);
    }
    public static IntType getSInt(int value){
        return IntFactory.get(value);
    }

}
