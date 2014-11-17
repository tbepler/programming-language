package language.functions;

import java.util.ArrayDeque;
import java.util.Deque;

import language.parser.Visitor;
import language.parser.framework.Node;
import language.parser.nodes.Add;
import language.parser.nodes.Assign;
import language.parser.nodes.Conditional;
import language.parser.nodes.Divide;
import language.parser.nodes.Eq;
import language.parser.nodes.FApply;
import language.parser.nodes.False;
import language.parser.nodes.Greater;
import language.parser.nodes.IdListAppend;
import language.parser.nodes.IdListHead;
import language.parser.nodes.Less;
import language.parser.nodes.Multiply;
import language.parser.nodes.Negate;
import language.parser.nodes.Not;
import language.parser.nodes.ParenExp;
import language.parser.nodes.Power;
import language.parser.nodes.Subtract;
import language.parser.nodes.True;
import language.parser.nodes.Where;
import language.parser.nodes._Punctuation5assignprog;
import language.parser.nodes.assign_Punctuation14ListAppendassign_Punctuation14;
import language.parser.nodes.assign_Punctuation14ListStart;
import language.parser.nodes.binopexp;
import language.parser.nodes.errorToken;
import language.parser.nodes.expprog;
import language.parser.nodes.floatToken;
import language.parser.nodes.floatexp;
import language.parser.nodes.idToken;
import language.parser.nodes.idexp;
import language.parser.nodes.intToken;
import language.parser.nodes.intexp;
import language.parser.nodes.uopexp;
import language.symboltable.Kinds;
import language.symboltable.Symbol;
import language.symboltable.SymbolTable;

public class SymbolTableFiller implements Visitor{
	
	private final Deque<String> memory = new ArrayDeque<String>();
	
	private final SymbolTable<FunctionBuilder> symbolTable;
	
	public SymbolTableFiller(SymbolTable<FunctionBuilder> table){
		this.symbolTable = table;
	}
	
	@Override
	public void visit(idToken node) {
		memory.push(node.getText());
	}

	@Override
	public void visit(intToken node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(floatToken node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(errorToken node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Assign node) {
		node.idlist0.accept(this);
		Node<Visitor> def = node.exp1;
		FunctionBuilder func = new FunctionBuilder(symbolTable);
		String name = memory.pollLast();
		while(!memory.isEmpty()){
			func.appendParam(memory.pollLast());
		}
		func.assign(def);
		symbolTable.insert(new Symbol(name, Kinds.FUNCTION), func);
	}

	@Override
	public void visit(idexp node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(intexp node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(floatexp node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(True node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(False node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(binopexp node) {
		node.binop0.accept(this);
	}

	@Override
	public void visit(uopexp node) {
		node.uop0.accept(this);
	}

	@Override
	public void visit(FApply node) {
		node.exp0.accept(this);
		node.exp1.accept(this);
	}

	@Override
	public void visit(Add node) {
		node.exp0.accept(this);
		node.exp1.accept(this);
	}

	@Override
	public void visit(Subtract node) {
		node.exp0.accept(this);
		node.exp1.accept(this);
	}

	@Override
	public void visit(Multiply node) {
		node.exp0.accept(this);
		node.exp1.accept(this);
	}

	@Override
	public void visit(Divide node) {
		node.exp0.accept(this);
		node.exp1.accept(this);
	}

	@Override
	public void visit(Power node) {
		node.exp0.accept(this);
		node.exp1.accept(this);
	}

	@Override
	public void visit(Negate node) {
		node.exp0.accept(this);
	}

	@Override
	public void visit(Not node) {
		node.exp0.accept(this);
	}

	@Override
	public void visit(IdListHead node) {
		node.id0.accept(this);
	}

	@Override
	public void visit(IdListAppend node) {
		node.idlist0.accept(this);
		node.id1.accept(this);
	}

	@Override
	public void visit(expprog node) {
		node.exp0.accept(this);
	}

	@Override
	public void visit(_Punctuation5assignprog node) {
		node.assign0.accept(this);
	}

	@Override
	public void visit(assign_Punctuation14ListStart node) {
		//do nothing
	}

	@Override
	public void visit(assign_Punctuation14ListAppendassign_Punctuation14 node) {
		node.assign_punctuation14list0.accept(this);
		node.assign1.accept(this);
	}

	@Override
	public void visit(Where node) {
		node.exp0.accept(this);
		node.assign_punctuation14list1.accept(this);
	}

	@Override
	public void visit(Conditional node) {
		node.exp0.accept(this);
		node.exp1.accept(this);
		node.exp2.accept(this);
	}

	@Override
	public void visit(ParenExp node) {
		node.exp0.accept(this);
	}

	@Override
	public void visit(Less node) {
		node.exp0.accept(this);
		node.exp1.accept(this);
	}

	@Override
	public void visit(Eq node) {
		node.exp0.accept(this);
		node.exp1.accept(this);
	}

	@Override
	public void visit(Greater node) {
		node.exp0.accept(this);
		node.exp1.accept(this);
	}

}
