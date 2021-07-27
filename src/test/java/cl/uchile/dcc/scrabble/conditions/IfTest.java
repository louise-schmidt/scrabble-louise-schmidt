/*
package cl.uchile.dcc.scrabble.conditions;

import cl.uchile.dcc.scrabble.factories.NodesFactory.NodeTypeFactory;
import cl.uchile.dcc.scrabble.factories.NodesFactory.VarNodeFactory;
import cl.uchile.dcc.scrabble.functions.NodeType.VarNode;
import cl.uchile.dcc.scrabble.functions.binaryfunctions.add;
import cl.uchile.dcc.scrabble.visitor.LessThan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfTest {
    VarNode a = VarNodeFactory.getVarNode("a");
    VarNode b = VarNodeFactory.getVarNode("b");

    @BeforeEach
    void SetUp(){
        VarNodeFactory.getVarNode("a").setValue(NodeTypeFactory.newIntNode(0));
        VarNodeFactory.getVarNode("b").setValue(NodeTypeFactory.newIntNode(10));
    }

    @Test
    void IfTest() {
        var expected = NodeTypeFactory.newIntNode(10).getValue();
        var operacion = new If(new LessThan(VarNodeFactory.getVarNode("i"),VarNodeFactory.getVarNode("n")),
                new Assign("i",new add(VarNodeFactory.getVarNode("a"),VarNodeFactory.getVarNode("b")))).evaluate();
        var actual = VarNodeFactory.getVarNode("i").getValue();
        assertEquals(expected,actual);
    }

}

 */