package language.functions;

public class ConditionalThunk extends Thunk{
	
	private final Thunk cond;
	private final Thunk then;
	private final Thunk els;
	
	public ConditionalThunk(Thunk cond, Thunk then, Thunk els){
		this.cond = cond; this.then = then; this.els = els;
	}

	@Override
	protected Object eval() {
		boolean b = (Boolean) cond.exec();
		if(b){
			return then.exec();
		}else{
			return els.exec();
		}
	}

}
