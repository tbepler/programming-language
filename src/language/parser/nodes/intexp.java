
package language.parser.nodes;

import language.parser.Visitor;


/**
 * This class was generated by the LRPaGe parser generator v1.0 using the com.sun.codemodel library.
 * 
 * <P>LRPaGe is available from https://github.com/tbepler/LRPaGe.
 * <P>CodeModel is available from https://codemodel.java.net/.
 * 
 */
public class intexp
    extends expAbstractNode
{

    public final intToken int0;

    public intexp(intToken int0) {
        this.int0 = int0;
    }

    @Override
    public int getLine() {
        return int0 .getLine();
    }

    @Override
    public int getPos() {
        return int0 .getPos();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = ((hash* 13)+ int0 .hashCode());
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
        if (!(o instanceof intexp)) {
            return false;
        }
        intexp castResult = ((intexp) o);
        if (!this.int0 .equals(castResult.int0)) {
            return false;
        }
        return true;
    }

}
