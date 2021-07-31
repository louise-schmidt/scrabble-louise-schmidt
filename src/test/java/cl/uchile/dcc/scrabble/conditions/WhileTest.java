package cl.uchile.dcc.scrabble.conditions;

import cl.uchile.dcc.scrabble.factories.NodesFactory.NodeTypeFactory;
import cl.uchile.dcc.scrabble.factories.NodesFactory.VarNodeFactory;
import cl.uchile.dcc.scrabble.functions.NodeType.VarNode;
import cl.uchile.dcc.scrabble.functions.While;
import cl.uchile.dcc.scrabble.functions.binaryfunctions.add;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WhileTest {

    VarNode i = VarNodeFactory.getVarNode("i");
    VarNode n = VarNodeFactory.getVarNode("n");

    @BeforeEach
    void SetUp(){
        VarNodeFactory.getVarNode("i").setValue(NodeTypeFactory.newIntNode(0));
        VarNodeFactory.getVarNode("n").setValue(NodeTypeFactory.newIntNode(10));
    }

    @Test
    void whileTest() {
        var expected = NodeTypeFactory.newIntNode(0).getValue();
        var operacion = new While(new LessThan(VarNodeFactory.getVarNode("i"),VarNodeFactory.getVarNode("n")),
                new add(VarNodeFactory.getVarNode("i"),NodeTypeFactory.newIntNode(1)));
        var actual = VarNodeFactory.getVarNode("i").getValue();
        assertEquals(expected,actual);
    }


}