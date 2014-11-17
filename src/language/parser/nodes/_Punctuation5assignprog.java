
package language.parser.nodes;

import language.parser.Visitor;


/**
 * This class was generated by the LRPaGe parser generator v1.0 using the com.sun.codemodel library.
 * 
 * <P>LRPaGe is available from https://github.com/tbepler/LRPaGe.
 * <P>CodeModel is available from https://codemodel.java.net/.
 * 
 */
public class _Punctuation5assignprog
    extends progAbstractNode
{

    public final assignAbstractNode assign0;

    public _Punctuation5assignprog(_Punctuation5Token _punctuation50, assignAbstractNode assign1) {
        this.assign0 = assign1;
    }

    @Override
    public int getLine() {
        return assign0 .getLine();
    }

    @Override
    public int getPos() {
        return assign0 .getPos();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = ((hash* 13)+ assign0 .hashCode());
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
        if (!(o instanceof _Punctuation5assignprog)) {
            return false;
        }
        _Punctuation5assignprog castResult = ((_Punctuation5assignprog) o);
        if (!this.assign0 .equals(castResult.assign0)) {
            return false;
        }
        return true;
    }

}
