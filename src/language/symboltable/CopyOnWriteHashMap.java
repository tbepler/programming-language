package language.symboltable;

import java.util.HashMap;
import java.util.Map;

public class CopyOnWriteHashMap<K extends Comparable<K>,V> implements PersistentMap<K, V> {
	
	private final Map<K,V> map = new HashMap<K,V>();
	
	public CopyOnWriteHashMap(){
		//TODO
	}
	
	public CopyOnWriteHashMap(Map<K,V> map){
		this.map.putAll(map);
	}
	
	@Override
	public PersistentMap<K, V> insert(K key, V value){
		Map<K,V> copy = new HashMap<K,V>(map);
		copy.put(key, value);
		return new CopyOnWriteHashMap<K,V>(copy);
	}
	
	@Override
	public PersistentMap<K, V> insertAll(Map<K,V> map){
		Map<K,V> copy = new HashMap<K,V>(this.map);
		copy.putAll(map);
		return new CopyOnWriteHashMap<K,V>(copy);
	}
	
	@Override
	public V lookup(K key){
		return map.get(key);
	}
	
	@Override
	public int hashCode(){
		//TODO
		return 0;
	}
	
	@Override
	public boolean equals(Object o){
		//TODO
		return false;
	}
	
}
