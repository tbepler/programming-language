package language.activation.records;

import java.util.ArrayDeque;
import java.util.Deque;
import language.symboltable.CopyOnWriteHashMap;
import language.symboltable.PersistentMap;

public class Stack<K extends Comparable<K>,V> {
	
	private PersistentMap<K,V> curStack = new CopyOnWriteHashMap<K,V>();
	private V returnValue = null;
	private final Deque<PersistentMap<K,V>> frames = new ArrayDeque<PersistentMap<K,V>>();
	private final Deque<Environment<K,V>> envs = new ArrayDeque<Environment<K,V>>();
	
	public Stack(){
		//do nothing
	}
	
	public Stack(Environment<K,V> globalEnv){
		envs.push(globalEnv);
	}
	
	public void beginScope(){
		frames.push(curStack);
		Environment<K,V> env = new Environment<K,V>(this.getEnvironment());
		envs.push(env);
	}
	
	public void endScope(){
		frames.remove();
		envs.remove();
	}
	
	public void setReturnValue(V value){
		this.returnValue = value;
	}
	
	public V getReturnValue(){
		return returnValue;
	}
	
	public Environment<K,V> getEnvironment(){
		return envs.poll();
	}
	
	public void insert(K key, V value){
		curStack = curStack.insert(key, value);
	}
	
	public V lookup(K key){
		return curStack.lookup(key);
	}
	
}
