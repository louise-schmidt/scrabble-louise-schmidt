package cl.uchile.dcc.scrabble.ast.NodeType;
import cl.uchile.dcc.scrabble.ast.INode;
import cl.uchile.dcc.scrabble.types.iType;

public class FloatNode implements INode {
    private final double value;

    /**
     * constructor FloatNode
     * @param value de tipo double
     */
    public FloatNode(double value) {
        this.value = value;
    }

    /**
     * Sobreescribe el metodo evaluate
     * @return null
     */
    @Override
    public INode evaluate() {
        return null;
    }

    /**
     * Sobreecribe metodo scrabbletype
     * @return null
     */
    @Override
    public iType scrabbletype() {
        return null;
    }
}
