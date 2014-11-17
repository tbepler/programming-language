package language.activation.records;

public interface Function<V> {
	
	public String[] params();
	
	public Environment<String,V> getEnvironment();
	
	public void gotoo(Stack<String,V> stack);
	
}
