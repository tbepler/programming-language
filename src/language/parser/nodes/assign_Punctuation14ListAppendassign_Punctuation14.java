
package language.parser.nodes;

import language.parser.Visitor;


/**
 * This class was generated by the LRPaGe parser generator v1.0 using the com.sun.codemodel library.
 * 
 * <P>LRPaGe is available from https://github.com/tbepler/LRPaGe.
 * <P>CodeModel is available from https://codemodel.java.net/.
 * 
 */
public class assign_Punctuation14ListAppendassign_Punctuation14
    extends assign_Punctuation14ListAbstractNode
{

    public final assign_Punctuation14ListAbstractNode assign_punctuation14list0;
    public final assignAbstractNode assign1;

    public assign_Punctuation14ListAppendassign_Punctuation14(assign_Punctuation14ListAbstractNode assign_punctuation14list0, assignAbstractNode assign1, _Punctuation14Token _punctuation142) {
        this.assign_punctuation14list0 = assign_punctuation14list0;
        this.assign1 = assign1;
    }

    @Override
    public int getLine() {
        return assign_punctuation14list0 .getLine();
    }

    @Override
    public int getPos() {
        return assign_punctuation14list0 .getPos();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = ((hash* 13)+ assign_punctuation14list0 .hashCode());
        hash = ((hash* 13)+ assign1 .hashCode());
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
        if (!(o instanceof assign_Punctuation14ListAppendassign_Punctuation14)) {
            return false;
        }
        assign_Punctuation14ListAppendassign_Punctuation14 castResult = ((assign_Punctuation14ListAppendassign_Punctuation14) o);
        if (!this.assign_punctuation14list0 .equals(castResult.assign_punctuation14list0)) {
            return false;
        }
        if (!this.assign1 .equals(castResult.assign1)) {
            return false;
        }
        return true;
    }

}
