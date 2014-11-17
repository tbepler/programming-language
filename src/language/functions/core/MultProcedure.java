package language.functions.core;

public class MultProcedure implements Procedure{

	@Override
	public int params() {
		return 2;
	}

	@Override
	public Object exec(Object... args) {
		assert(args.length == 2);
		if(args[0] instanceof Integer && args[1] instanceof Integer){
			return (Integer) args[0] * (Integer) args[1];
		}
		if(args[0] instanceof Number && args[1] instanceof Number){
			return ((Number) args[0]).doubleValue() * ((Number) args[1]).doubleValue();
		}
		throw new RuntimeException("Unable to multiply "+args[0]+", "+args[1]);
	}

}
