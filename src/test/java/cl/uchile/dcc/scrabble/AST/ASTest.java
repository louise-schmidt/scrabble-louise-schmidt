package cl.uchile.dcc.scrabble.AST;

import cl.uchile.dcc.scrabble.functions.unaryfunctions.not;
import cl.uchile.dcc.scrabble.factories.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.factories.NodesFactory.NodeTypeFactory;
import cl.uchile.dcc.scrabble.factories.NodesFactory.VarNodeFactory;
import cl.uchile.dcc.scrabble.functions.binaryfunctions.*;
import cl.uchile.dcc.scrabble.functions.unaryfunctions.transform.*;
import cl.uchile.dcc.scrabble.types.iType;
import org.junit.jupiter.api.Test;

import static cl.uchile.dcc.scrabble.factories.NodesFactory.VarNodeFactory.*;
import static org.junit.jupiter.api.Assertions.*;

public class ASTest {

    @Test
    void generalTest(){

        iType expectedValue = NodeTypeFactory.newFloatNode(34.9).getValue();
        var ast = new add(
                NodeTypeFactory.newFloatNode(6.9),
                new or(
                        NodeTypeFactory.newBinaryNode("0000000000001000"),
                        new asBinary(
                                new subtract(
                                        NodeTypeFactory.newIntNode(25),
                                        NodeTypeFactory.newBinaryNode("0000000000000101")
                                )
                        )
                )
        );
        iType actualValue = ast.getValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void varTest(){
        var expectedASTValue = NodeTypeFactory.newFloatNode(416.98).getValue();
        var astWithVar =
                new add(
                        new multiply(
                                VarNodeFactory.getVarNode("x"),
                                VarNodeFactory.getVarNode("b")),
                        new divide(
                                VarNodeFactory.getVarNode("a"),
                                VarNodeFactory.getVarNode("y")
                        )
                );
        storeIntNodeInVarNode("a", 777);
        storeFloatNodeInVarNode("b", 6.9);
        storeFloatNodeInVarNode("x", 4.20);
        storeBinaryNodeInVarNode("y", "0000000000000010");
        var actualASTValue = astWithVar.getValue();

        var expectedVarValue = TypeFactory.getIntType(777);
        var actualVarValue = VarNodeFactory.getVarNode("a").getValue();

        assertEquals(expectedASTValue, actualASTValue);
        assertEquals(expectedVarValue, actualVarValue);
    }

    @Test
    void logicTest(){
        var expectedValue = NodeTypeFactory.newBinaryNode("1111111111111111").getValue();
        var astWithVar =
                new or(
                        new and(
                                VarNodeFactory.getVarNode("a"),
                                new not(
                                        VarNodeFactory.getVarNode("b"))
                        ),
                        new or(
                                VarNodeFactory.getVarNode("b"),
                                new not(
                                        VarNodeFactory.getVarNode("a")
                                )
                        )
                );
        storeBoolNodeInVarNode("a", true);
        storeBinaryNodeInVarNode("b", "0000000000000000");
        var actualValue = astWithVar.getValue();
        assertEquals(expectedValue, actualValue);
    }


    @Test
    void strCatTest(){
        var expectedValue = NodeTypeFactory.newStringNode("hola420.69chaoholatrue69chao0000000110100100hola:3").getValue();
        var astWithVar =
                new add(
                        new add(
                                new add(
                                        new add(
                                                VarNodeFactory.getVarNode("a"),
                                                NodeTypeFactory.newFloatNode(420.69)
                                        ),
                                        VarNodeFactory.getVarNode("b")
                                ),
                                new add(
                                        new add(
                                                VarNodeFactory.getVarNode("a"),
                                                NodeTypeFactory.newBoolNode(true)
                                        ),
                                        NodeTypeFactory.newIntNode(69)
                                )
                        ),
                        new add(
                                new add(
                                        VarNodeFactory.getVarNode("b"),
                                        NodeTypeFactory.newBinaryNode("0000000110100100")
                                ),
                                new add(
                                        VarNodeFactory.getVarNode("a"),
                                        NodeTypeFactory.newStringNode(":3")
                                )
                        )
                );
        storeStringNodeInVarNode("a", "hola");
        storeStringNodeInVarNode("b", "chao");
        var actualValue = astWithVar.getValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void intNodeTest(){

        var expectedIntNode = NodeTypeFactory.newIntNode(420).getValue();
        var intToInt = new asInt(NodeTypeFactory.newIntNode(420)).getValue();

        var expectedStringNode = NodeTypeFactory.newStringNode("420").getValue();
        var intToStr = new asString(NodeTypeFactory.newIntNode(420)).getValue();

        var expectedFloatNode = NodeTypeFactory.newFloatNode(420.0).getValue();
        var intToFloat = new asFloat(NodeTypeFactory.newIntNode(420)).getValue();

        var expectedBinaryNode = NodeTypeFactory.newBinaryNode("0000000110100100").getValue();
        var intToBin = new asBinary(NodeTypeFactory.newIntNode(420)).getValue();

        var expectedIntSum = NodeTypeFactory.newIntNode(69).getValue();
        var intSum = new add(
                NodeTypeFactory.newIntNode(60),
                NodeTypeFactory.newIntNode(9)
        ).getValue();

        var expectedBinarySum = NodeTypeFactory.newBinaryNode("0000000001000101").getValue();
        var binSum = new add(
                NodeTypeFactory.newBinaryNode("0000000000001001"),
                NodeTypeFactory.newIntNode(60)
        ).getValue();

        var expectedFloatSum = NodeTypeFactory.newFloatNode(6.9).getValue();
        var floatSum = new add(
                NodeTypeFactory.newFloatNode(0.9),
                NodeTypeFactory.newIntNode(6)
        ).getValue();
        var expectedIntSub = NodeTypeFactory.newIntNode(51).getValue();
        var intSub = new subtract(
                NodeTypeFactory.newIntNode(60),
                NodeTypeFactory.newIntNode(9)
        ).getValue();

        var expectedBinarySub = NodeTypeFactory.newBinaryNode("1111111111001101").getValue();
        var binSub = new subtract(
                NodeTypeFactory.newBinaryNode("0000000000001001"),
                NodeTypeFactory.newIntNode(60)
        ).getValue();

        var expectedFloatSub = NodeTypeFactory.newFloatNode(-5.1).getValue();
        var floatSub = new subtract(
                NodeTypeFactory.newFloatNode(0.9),
                NodeTypeFactory.newIntNode(6)
        ).getValue();
        var expectedIntMult = NodeTypeFactory.newIntNode(540).getValue();
        var intMult = new multiply(
                NodeTypeFactory.newIntNode(60),
                NodeTypeFactory.newIntNode(9)
        ).getValue();

        var expectedBinaryMult = NodeTypeFactory.newBinaryNode("0000001000011100").getValue();
        var binMult = new multiply(
                NodeTypeFactory.newBinaryNode("0000000000001001"),
                NodeTypeFactory.newIntNode(60)
        ).getValue();

        var expectedFloatMult = NodeTypeFactory.newFloatNode(5.4).getValue();
        var floatMult = new multiply(
                NodeTypeFactory.newFloatNode(0.9),
                NodeTypeFactory.newIntNode(6)
        ).getValue();
        var expectedIntDiv = NodeTypeFactory.newIntNode(6).getValue();
        var intDiv = new divide(
                NodeTypeFactory.newIntNode(60),
                NodeTypeFactory.newIntNode(9)
        ).getValue();

        var expectedBinaryDiv = NodeTypeFactory.newBinaryNode("0000000000000000").getValue();
        var binDiv = new divide(
                NodeTypeFactory.newBinaryNode("0000000000001001"),
                NodeTypeFactory.newIntNode(60)
        ).getValue();

        var expectedFloatDiv = NodeTypeFactory.newFloatNode(0.02).getValue();
        var floatDiv = new divide(
                NodeTypeFactory.newFloatNode(0.12),
                NodeTypeFactory.newIntNode(6)
        ).getValue();

        assertEquals(expectedIntNode, intToInt);
        assertEquals(expectedStringNode, intToStr);
        assertEquals(expectedFloatNode, intToFloat);
        assertEquals(expectedBinaryNode, intToBin);
        assertEquals(expectedIntSum, intSum);
        assertEquals(expectedFloatSum, floatSum);
        assertEquals(expectedBinarySum, binSum);
        assertEquals(expectedIntSub, intSub);
        assertEquals(expectedFloatSub, floatSub);
        assertEquals(expectedBinarySub, binSub);
        assertEquals(expectedIntMult, intMult);
        assertEquals(expectedFloatMult, floatMult);
        assertEquals(expectedBinaryMult, binMult);
        assertEquals(expectedIntDiv, intDiv);
        assertEquals(expectedFloatDiv, floatDiv);
        assertEquals(expectedBinaryDiv, binDiv);

    }

    @Test
    void binaryNodeTest(){

        var expectedIntNode = NodeTypeFactory.newIntNode(420).getValue();
        var binToInt = new asInt(NodeTypeFactory.newBinaryNode("0000000110100100")).getValue();

        var expectedStringNode = NodeTypeFactory.newStringNode("0000000110100100").getValue();
        var binToStr = new asString(NodeTypeFactory.newBinaryNode("0000000110100100")).getValue();

        var expectedFloatNode = NodeTypeFactory.newFloatNode(420.0).getValue();
        var binToFloat = new asFloat(NodeTypeFactory.newBinaryNode("0000000110100100")).getValue();

        var expectedBinaryNode = NodeTypeFactory.newBinaryNode("0000000110100100").getValue();
        var binToBin = new asBinary(NodeTypeFactory.newBinaryNode("0000000110100100")).getValue();

        var expectedIntSum = NodeTypeFactory.newIntNode(69).getValue();
        var intSum = new add(
                NodeTypeFactory.newIntNode(60),
                NodeTypeFactory.newBinaryNode("0000000000001001")
        ).getValue();

        var expectedBinarySum = NodeTypeFactory.newBinaryNode("0000000001000101").getValue();
        var binSum = new add(
                NodeTypeFactory.newBinaryNode("0000000000001001"),
                NodeTypeFactory.newBinaryNode("0000000000111100")
        ).getValue();

        var expectedFloatSum = NodeTypeFactory.newFloatNode(6.9).getValue();
        var floatSum = new add(
                NodeTypeFactory.newFloatNode(0.9),
                NodeTypeFactory.newBinaryNode("0000000000000110")
        ).getValue();
        var expectedIntSub = NodeTypeFactory.newIntNode(51).getValue();
        var intSub = new subtract(
                NodeTypeFactory.newIntNode(60),
                NodeTypeFactory.newBinaryNode("0000000000001001")
        ).getValue();

        var expectedBinarySub = NodeTypeFactory.newBinaryNode("1111111111001101").getValue();
        var binSub = new subtract(
                NodeTypeFactory.newBinaryNode("0000000000001001"),
                NodeTypeFactory.newBinaryNode("0000000000111100")
        ).getValue();

        var expectedFloatSub = NodeTypeFactory.newFloatNode(-5.1).getValue();
        var floatSub = new subtract(
                NodeTypeFactory.newFloatNode(0.9),
                NodeTypeFactory.newBinaryNode("0000000000000110")
        ).getValue();
        var expectedIntMult = NodeTypeFactory.newIntNode(540).getValue();
        var intMult = new multiply(
                NodeTypeFactory.newIntNode(60),
                NodeTypeFactory.newBinaryNode("0000000000001001")
        ).getValue();

        var expectedBinaryMult = NodeTypeFactory.newBinaryNode("0000001000011100").getValue();
        var binMult = new multiply(
                NodeTypeFactory.newBinaryNode("0000000000001001"),
                NodeTypeFactory.newBinaryNode("0000000000111100")
        ).getValue();

        var expectedFloatMult = NodeTypeFactory.newFloatNode(5.4).getValue();
        var floatMult = new multiply(
                NodeTypeFactory.newFloatNode(0.9),
                NodeTypeFactory.newBinaryNode("0000000000000110")
        ).getValue();
        var expectedIntDiv = NodeTypeFactory.newIntNode(6).getValue();
        var intDiv = new divide(
                NodeTypeFactory.newIntNode(60),
                NodeTypeFactory.newBinaryNode("0000000000001001")
        ).getValue();

        var expectedBinaryDiv = NodeTypeFactory.newBinaryNode("0000000000000000").getValue();
        var binDiv = new divide(
                NodeTypeFactory.newBinaryNode("0000000000001001"),
                NodeTypeFactory.newBinaryNode("0000000000111100")
        ).getValue();

        var expectedFloatDiv = NodeTypeFactory.newFloatNode(0.02).getValue();
        var floatDiv = new divide(
                NodeTypeFactory.newFloatNode(0.12),
                NodeTypeFactory.newBinaryNode("0000000000000110")
        ).getValue();

        var expectedOrBool = NodeTypeFactory.newBinaryNode("1111111111111111").getValue();
        var boolOrBin = new or(NodeTypeFactory.newBoolNode(true), NodeTypeFactory.newBinaryNode("0000110001101001")).getValue();

        var expectedAndBinary = NodeTypeFactory.newBinaryNode("0000000000001000").getValue();
        var binAndBin = new and(NodeTypeFactory.newBinaryNode("0000000000111100"), NodeTypeFactory.newBinaryNode("0000000000001001")).getValue();

        assertEquals(expectedIntNode, binToInt);
        assertEquals(expectedStringNode, binToStr);
        assertEquals(expectedFloatNode, binToFloat);
        assertEquals(expectedBinaryNode, binToBin);
        assertEquals(expectedIntSum, intSum);
        assertEquals(expectedFloatSum, floatSum);
        assertEquals(expectedBinarySum, binSum);
        assertEquals(expectedIntSub, intSub);
        assertEquals(expectedFloatSub, floatSub);
        assertEquals(expectedBinarySub, binSub);
        assertEquals(expectedIntMult, intMult);
        assertEquals(expectedFloatMult, floatMult);
        assertEquals(expectedBinaryMult, binMult);
        assertEquals(expectedIntDiv, intDiv);
        assertEquals(expectedFloatDiv, floatDiv);
        assertEquals(expectedBinaryDiv, binDiv);
        assertEquals(expectedOrBool, boolOrBin);
        assertEquals(expectedAndBinary, binAndBin);
    }

    @Test
    void floatNodeTest(){

        var expectedFloatNode = NodeTypeFactory.newFloatNode(420.0).getValue();
        var floatToFloat = new asFloat(NodeTypeFactory.newFloatNode(420.0)).getValue();

        var expectedIntSum = NodeTypeFactory.newFloatNode(60.9).getValue();
        var intSum = new add(
                NodeTypeFactory.newIntNode(60),
                NodeTypeFactory.newFloatNode(0.9)
        ).getValue();

        var expectedFloatSum = NodeTypeFactory.newFloatNode(6.9).getValue();
        var floatSum = new add(
                NodeTypeFactory.newFloatNode(0.9),
                NodeTypeFactory.newFloatNode(6.0)
        ).getValue();

        var expectedIntSub = NodeTypeFactory.newFloatNode(59.1).getValue();
        var intSub = new subtract(
                NodeTypeFactory.newIntNode(60),
                NodeTypeFactory.newFloatNode(0.9)
        ).getValue();

        var expectedFloatSub = NodeTypeFactory.newFloatNode(-5.1).getValue();
        var floatSub = new subtract(
                NodeTypeFactory.newFloatNode(0.9),
                NodeTypeFactory.newFloatNode(6.0)
        ).getValue();
        var expectedIntMult = NodeTypeFactory.newFloatNode(54.0).getValue();
        var intMult = new multiply(
                NodeTypeFactory.newIntNode(60),
                NodeTypeFactory.newFloatNode(0.9)
        ).getValue();

        var expectedFloatMult = NodeTypeFactory.newFloatNode(0.54).getValue();
        var floatMult = new multiply(
                NodeTypeFactory.newFloatNode(0.9),
                NodeTypeFactory.newFloatNode(0.6)
        ).getValue();
        var expectedIntDiv = NodeTypeFactory.newFloatNode(100.0).getValue();
        var intDiv = new divide(
                NodeTypeFactory.newIntNode(60),
                NodeTypeFactory.newFloatNode(0.6)
        ).getValue();

        var expectedFloatDiv = NodeTypeFactory.newFloatNode(0.2).getValue();
        var floatDiv = new divide(
                NodeTypeFactory.newFloatNode(0.12),
                NodeTypeFactory.newFloatNode(0.6)
        ).getValue();


        assertEquals(expectedFloatNode, floatToFloat);
        assertEquals(expectedIntSum, intSum);
        assertEquals(expectedFloatSum, floatSum);
        assertEquals(expectedIntSub, intSub);
        assertEquals(expectedFloatSub, floatSub);
        assertEquals(expectedIntMult, intMult);
        assertEquals(expectedFloatMult, floatMult);
        assertEquals(expectedIntDiv, intDiv);
        assertEquals(expectedFloatDiv, floatDiv);

    }


    @Test
    void boolNodeTest(){
        var expectedBoolNode = NodeTypeFactory.newBoolNode(true).getValue();
        var boolToBool = new asBool(NodeTypeFactory.newBoolNode(true)).getValue();

        var expectedAndBool = NodeTypeFactory.newBoolNode(false).getValue();
        var boolAndBool = new and(NodeTypeFactory.newBoolNode(true), NodeTypeFactory.newBoolNode(false)).getValue();

        var expectedAndBinary = NodeTypeFactory.newBinaryNode("0000000000000000").getValue();
        var binAndBool = new and(NodeTypeFactory.newBinaryNode("0101010101010101"), NodeTypeFactory.newBoolNode(false)).getValue();

        var expectedOrBool = NodeTypeFactory.newBoolNode(true).getValue();
        var boolOrBool = new or(NodeTypeFactory.newBoolNode(true), NodeTypeFactory.newBoolNode(false)).getValue();

        var truebool = NodeTypeFactory.newBoolNode(true).getValue();
        var expected = new not(NodeTypeFactory.newBoolNode(false)).getValue();

        assertEquals(expectedBoolNode, boolToBool);
        assertEquals(expectedAndBool, boolAndBool);
        assertEquals(expectedAndBinary, binAndBool);
        assertEquals(expectedOrBool, boolOrBool);
        assertEquals(truebool,expected);

    }


    @Test
    void nullTest(){
        var ast1 = new add(
                NodeTypeFactory.newBoolNode(true),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast2 = new add(
                NodeTypeFactory.newIntNode(1),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast3 = new add(
                NodeTypeFactory.newFloatNode(2.3),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast4 = new add(
                NodeTypeFactory.newBinaryNode("0101010101010101"),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast5 = new subtract(
                NodeTypeFactory.newBoolNode(true),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast6 = new subtract(
                NodeTypeFactory.newIntNode(1),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast7 = new subtract(
                NodeTypeFactory.newFloatNode(2.3),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast8 = new subtract(
                NodeTypeFactory.newBinaryNode("0101010101010101"),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast9 = new divide(
                NodeTypeFactory.newBoolNode(true),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast10 = new divide(
                NodeTypeFactory.newIntNode(1),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast11 = new divide(
                NodeTypeFactory.newFloatNode(2.3),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast12 = new divide(
                NodeTypeFactory.newBinaryNode("0101010101010101"),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast13 = new multiply(
                NodeTypeFactory.newBoolNode(true),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast14 = new multiply(
                NodeTypeFactory.newIntNode(1),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast15 = new multiply(
                NodeTypeFactory.newFloatNode(2.3),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast16 = new multiply(
                NodeTypeFactory.newBinaryNode("0101010101010101"),
                NodeTypeFactory.newBoolNode(false)
        );
        var ast17 = new asBinary(
                NodeTypeFactory.newBoolNode(false)
        );
        var ast18 = new asFloat(
                NodeTypeFactory.newBoolNode(false)
        );
        var ast19 = new asInt(
                NodeTypeFactory.newBoolNode(false)
        );
        var ast20 = new asBool(
                NodeTypeFactory.newBinaryNode("0101010101010101")
        );
        var ast21 = new not(
                NodeTypeFactory.newFloatNode(2.3)
        );
        var ast22 = new and(
                NodeTypeFactory.newBoolNode(false),
                NodeTypeFactory.newFloatNode(2.3)
        );
        var ast23 = new or(
                NodeTypeFactory.newBoolNode(false),
                NodeTypeFactory.newFloatNode(2.3)
        );
        var ast24 = new and(
                NodeTypeFactory.newBinaryNode("0101010101010101"),
                NodeTypeFactory.newFloatNode(2.3)
        );
        var ast25 = new or(
                NodeTypeFactory.newBinaryNode("0101010101010101"),
                NodeTypeFactory.newFloatNode(2.3)
        );
        var ast26 = new and(
                NodeTypeFactory.newIntNode(1),
                NodeTypeFactory.newFloatNode(2.3)
        );
        var ast27 = new or(
                NodeTypeFactory.newIntNode(1),
                NodeTypeFactory.newFloatNode(2.3)
        );

        var value1 = ast1.evaluate();
        var value2 = ast2.evaluate();
        var value3 = ast3.evaluate();
        var value4 = ast4.evaluate();
        var value5 = ast5.evaluate();
        var value6 = ast6.evaluate();
        var value7 = ast7.evaluate();
        var value8 = ast8.evaluate();
        var value9 = ast9.evaluate();
        var value10 = ast10.evaluate();
        var value11 = ast11.evaluate();
        var value12 = ast12.evaluate();
        var value13 = ast13.evaluate();
        var value14 = ast14.evaluate();
        var value15 = ast15.evaluate();
        var value16 = ast16.evaluate();
        var value17 = ast17.evaluate();
        var value18 = ast18.evaluate();
        var value19 = ast19.evaluate();
        var value20 = ast20.evaluate();
        var value21 = ast21.evaluate();
        var value22 = ast22.evaluate();
        var value23 = ast23.evaluate();
        var value24 = ast24.evaluate();
        var value25 = ast25.evaluate();
        var value26 = ast26.evaluate();
        var value27 = ast27.evaluate();

        assertNull(value1);
        assertNull(value2);
        assertNull(value3);
        assertNull(value4);
        assertNull(value5);
        assertNull(value6);
        assertNull(value7);
        assertNull(value8);
        assertNull(value9);
        assertNull(value10);
        assertNull(value11);
        assertNull(value12);
        assertNull(value13);
        assertNull(value14);
        assertNull(value15);
        assertNull(value16);
        assertNull(value17);
        assertNull(value18);
        assertNull(value19);
        assertNull(value20);
        assertNull(value21);
        assertNull(value22);
        assertNull(value23);
        assertNull(value24);
        assertNull(value25);
        assertNull(value26);
        assertNull(value27);
    }
}
