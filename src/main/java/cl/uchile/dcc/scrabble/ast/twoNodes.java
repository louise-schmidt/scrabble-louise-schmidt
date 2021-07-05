package cl.uchile.dcc.scrabble.ast;

import cl.uchile.dcc.scrabble.types.iType;

public abstract class twoNodes implements INode {
    private INode hijoizq;
    private INode hijoder;

    public twoNodes(INode hijoizq, INode hijoder) {
        this.hijoizq = hijoizq;
        this.hijoder = hijoder;
    }

    public INode getHijoizq() {
        return hijoizq;
    }

    public INode getHijoder() {
        return hijoder;
    }

    @Override
    public INode evaluate() {
        return null;
    }

    @Override
    public iType scrabbletype() {
        return null;
    }
}
