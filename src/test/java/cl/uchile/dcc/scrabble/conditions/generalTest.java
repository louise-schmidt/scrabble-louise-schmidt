package cl.uchile.dcc.scrabble.conditions;

import cl.uchile.dcc.scrabble.functions.If;
import cl.uchile.dcc.scrabble.functions.While;
import cl.uchile.dcc.scrabble.functions.binaryfunctions.subtract;
import cl.uchile.dcc.scrabble.functions.unaryfunctions.not;
import cl.uchile.dcc.scrabble.factories.NodesFactory.NodeTypeFactory;
import cl.uchile.dcc.scrabble.factories.NodesFactory.VarNodeFactory;
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

        Sequence sequence2 =
                new Sequence(
                        new Assign("a",NodeTypeFactory.newIntNode(10)),
                        new Assign("b", NodeTypeFactory.newIntNode(15)),
                        new While(new EqualsTo(VarNodeFactory.getVarNode("b"), NodeTypeFactory.newIntNode(0)),
                                new If(new not(new LessThan(VarNodeFactory.getVarNode("a"),VarNodeFactory.getVarNode("b"))),
                                        new Assign("a",new subtract(VarNodeFactory.getVarNode("a"),VarNodeFactory.getVarNode("b"))),
                                        new Assign("b",new subtract(VarNodeFactory.getVarNode("b"),VarNodeFactory.getVarNode("a")))
                                )
                        )
                );

        sequence2.lector();
        var expectedValueA2 = NodeTypeFactory.newIntNode(10).getValue();
        var expectedValueB2 = NodeTypeFactory.newIntNode(15).getValue();
        var realValueA2 = VarNodeFactory.getVarNode("a").getValue();
        var realValueB2 = VarNodeFactory.getVarNode("b").getValue();
        assertEquals(expectedValueA2,realValueA2);
        assertEquals(expectedValueB2,realValueB2);
    }

}