package language.activation.records;

import java.util.HashMap;
import java.util.Map;

public class Environment<K,V> {
	
	private final Environment<K,V> parent;
	private final Map<K, V> variables = new HashMap<K, V>();
	
	public Environment(){
		parent = null;
	}
	
	public Environment(Environment<K,V> parent){
		this.parent = parent;
	}
	
	public Environment<K,V> insert(K key, V value){
		variables.put(key, value);
		return this;
	}
	
	public V lookup(K key){
		V val = variables.get(key);
		if(val == null && parent != null){
			val = parent.lookup(key);
		}
		return val;
	}
	
}
