
package language.parser.nodes;

import language.parser.Visitor;


/**
 * This class was generated by the LRPaGe parser generator v1.0 using the com.sun.codemodel library.
 * 
 * <P>LRPaGe is available from https://github.com/tbepler/LRPaGe.
 * <P>CodeModel is available from https://codemodel.java.net/.
 * 
 */
public class IdListAppend
    extends idlistAbstractNode
{

    public final idlistAbstractNode idlist0;
    public final idToken id1;

    public IdListAppend(idlistAbstractNode idlist0, idToken id1) {
        this.idlist0 = idlist0;
        this.id1 = id1;
    }

    @Override
    public int getLine() {
        return idlist0 .getLine();
    }

    @Override
    public int getPos() {
        return idlist0 .getPos();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = ((hash* 13)+ idlist0 .hashCode());
        hash = ((hash* 13)+ id1 .hashCode());
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
        if (!(o instanceof IdListAppend)) {
            return false;
        }
        IdListAppend castResult = ((IdListAppend) o);
        if (!this.idlist0 .equals(castResult.idlist0)) {
            return false;
        }
        if (!this.id1 .equals(castResult.id1)) {
            return false;
        }
        return true;
    }

}
