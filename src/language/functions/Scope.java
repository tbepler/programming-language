package language.functions;

import java.util.Map;

import language.symboltable.PersistentMap;
import language.symboltable.CopyOnWriteHashMap;

public class Scope{
	
	private final PersistentMap<String, Thunk> map;
	
	public Scope(){
		map = new CopyOnWriteHashMap<String, Thunk>();
	}
	
	public Scope(PersistentMap<String, Thunk> map){
		this.map = map;
	}
	
	public Scope insert(String key, Thunk value){
		return new Scope(map.insert(key, value));
	}
	
	public Scope insertAll(Map<String, Thunk> map){
		return new Scope(this.map.insertAll(map));
	}
	
	public Thunk lookup(String key){
		return map.lookup(key);
	}

}
