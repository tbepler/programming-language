package language.symboltable;

import java.util.Map;

public interface PersistentMap<K extends Comparable<K>, V> {

	public PersistentMap<K, V> insert(K key, V value);

	public PersistentMap<K, V> insertAll(Map<K, V> map);

	public V lookup(K key);

}