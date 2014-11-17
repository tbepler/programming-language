package language.activation.records;

public class CurryingFunction<V> implements Function<V>{

	@Override
	public String[] params() {
		return new String[]{ "f", "a" };
	}

	@Override
	public Environment<String, V> getEnvironment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void gotoo(Stack<String, V> stack) {
		Function<V> f = (Function<V>) stack.lookup("f");
		V arg = stack.lookup("a");
		String[] params = f.params();
		switch(params.length){
		case 0: throw new RuntimeException("Cannot curry function "+f);
		case 1: 
			stack.beginScope();
			stack.insert(params[0], arg);
			f.gotoo(stack);
			stack.endScope();
			break;
		default:
			//TODO
			break;
		}
	}


	
	
	
	
}
