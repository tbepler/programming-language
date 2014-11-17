package language.functions.core;

public class EqProcedure implements Procedure{

	@Override
	public int params() {
		return 2;
	}

	@Override
	public Object exec(Object... args) {
		assert(args.length == 2);
		return equal(args[0], args[1]);
	}
	
	public static boolean equal(Object o1, Object o2){
		if(o1 == o2) return true;
		if(o1 == null || o2 == null) return false;
		return o1.equals(o2);
	}

}
