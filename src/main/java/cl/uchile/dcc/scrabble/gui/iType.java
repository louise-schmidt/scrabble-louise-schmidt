package cl.uchile.dcc.scrabble.gui;

public interface iType {

    StringType StringToString();
    StringType BoolToString();
    StringType FloatToString();
    StringType IntToString();
    StringType BinaryToString();

    BoolType BoolToBool();

    FloatType StringToFloat();
    FloatType FloatToFloat();

    IntType StringToInt();
    IntType FloatToInt();
    IntType IntToInt();
    IntType BinaryToInt();

    BinaryType StringToBinary();
    BinaryType FloatToBinary();
    BinaryType IntToBinary();
    BinaryType BinaryToBinary();

}
