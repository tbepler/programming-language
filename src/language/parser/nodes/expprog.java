
package language.parser.nodes;

import language.parser.Visitor;


/**
 * This class was generated by the LRPaGe parser generator v1.0 using the com.sun.codemodel library.
 * 
 * <P>LRPaGe is available from https://github.com/tbepler/LRPaGe.
 * <P>CodeModel is available from https://codemodel.java.net/.
 * 
 */
public class expprog
    extends progAbstractNode
{

    public final expAbstractNode exp0;

    public expprog(expAbstractNode exp0) {
        this.exp0 = exp0;
    }

    @Override
    public int getLine() {
        return exp0 .getLine();
    }

    @Override
    public int getPos() {
        return exp0 .getPos();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = ((hash* 13)+ exp0 .hashCode());
        hash = ((hash* 13)+ getClass().hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (null == o) {
            return false;
        }
        if (!(o instanceof expprog)) {
            return false;
        }
        expprog castResult = ((expprog) o);
        if (!this.exp0 .equals(castResult.exp0)) {
            return false;
        }
        return true;
    }

}
