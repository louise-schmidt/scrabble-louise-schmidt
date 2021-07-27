package cl.uchile.dcc.scrabble.conditions;

import cl.uchile.dcc.scrabble.functions.binaryfunctions.subtract;
import cl.uchile.dcc.scrabble.functions.unaryfunctions.not;
import cl.uchile.dcc.scrabble.factories.NodesFactory.NodeTypeFactory;
import cl.uchile.dcc.scrabble.factories.NodesFactory.VarNodeFactory;
import cl.uchile.dcc.scrabble.visitor.EqualsTo;
import cl.uchile.dcc.scrabble.visitor.GreaterThan;
import cl.uchile.dcc.scrabble.visitor.LessThan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class generalTest {

    @Test
    void generalTest() {
        Sequence sequence =
                new Sequence(
                        new Assign("a",NodeTypeFactory.newIntNode(10)),
                        new Assign("b", NodeTypeFactory.newIntNode(15)),
                        new While(new not(new EqualsTo(VarNodeFactory.getVarNode("b"), NodeTypeFactory.newIntNode(0))),
                                new If(new GreaterThan(VarNodeFactory.getVarNode("a"),VarNodeFactory.getVarNode("b")),
                                        new Assign("a",new subtract(VarNodeFactory.getVarNode("a"),VarNodeFactory.getVarNode("b"))),
                                        new Assign("b",new subtract(VarNodeFactory.getVarNode("b"),VarNodeFactory.getVarNode("a")))
                                )
                        )
                );

        sequence.lector();
        var expectedValueA = NodeTypeFactory.newIntNode(5).getValue();
        var expectedValueB = NodeTypeFactory.newIntNode(0).getValue();
        var realValueA = VarNodeFactory.getVarNode("a").getValue();
        var realValueB = VarNodeFactory.getVarNode("b").getValue();
        assertEquals(expectedValueA,realValueA);
        assertEquals(expectedValueB,realValueB);
    }
}