package cl.uchile.dcc.scrabble.ast;

public abstract class twoNodes implements INode {
    private INode hijoizq;
    private INode hijoder;

    /**
     * Constructor twoNodes
     * @param hijoizq nodo hijo izquierdo de tipo INode
     * @param hijoder nodo hijo derecho de tipo INode
     */
    public twoNodes(INode hijoizq, INode hijoder) {
        this.hijoizq = hijoizq;
        this.hijoder = hijoder;
    }

    /**
     * getter Hijoizq
     * @return INode del nodo hijo izquierdo
     */
    public INode getHijoizq() {
        return hijoizq;
    }

    /**
     * getter Hijoder
     * @return INode del nodo hijo derecho
     */
    public INode getHijoder() {
        return hijoder;
    }

    /**
     * Sobreescribe metodo evaluate
     * @return INode
     */
    @Override
    public INode evaluate() {
        return null;
    }
}
