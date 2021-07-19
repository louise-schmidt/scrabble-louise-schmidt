package cl.uchile.dcc.scrabble.transformations.NodeType;
import cl.uchile.dcc.scrabble.types.iType;
import static cl.uchile.dcc.scrabble.memory.TypesFactory.BinaryFactory.newBinaryType;

public class BinaryNode implements INode {
    private final String value;

    /**
     *
     * @param value
     */
    public BinaryNode(String value) {
        this.value = value;
    }

    @Override
    public INode evaluate() {
        return null;
    }

    @Override
    public iType scrabbletype() {
        return newBinaryType(value);
    }
}
