package cl.uchile.dcc.scrabble.conditions;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.Interfaz;

/**
 * Lee y ejecuta la secuencia de arboles que se quieren evaluar
 */
public class Sequence {
    private Interfaz[] arbol;

    /**
     * Constructor
     * @param arbol
     * es de tipo INode y puede ser un valor u operacion
     */
    public Sequence(Interfaz... arbol) {
        this.arbol = arbol;
    }

    /**
     * lector recorre la secuencia que se desea evaluar y ejecuta evaluate en cada posicion
     */
    public void lector() {
        for(int i=0; i<this.arbol.length; i++) {
            this.arbol[i].evaluate();
        }
    }
}
