package io.altar.jseproject.repositories;

//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
import java.util.*;    // * -> todas a funcionalidades do util

import io.altar.jseproject.models.Entity;

abstract class EntityRepository <T extends Entity> {

	Map<Long, T> map = new HashMap<Long, T>();
	long nextId = 0;
	
	// 3. da pratica 2
	public void addEntity(T p) {
		nextId++;
		p.setId(nextId);
		map.put(p.getId(), p);
	}
	
	public T consultEntity(Long id) {
		
		return map.get(id);
	}
	
	public void editEntity(T p) {
		
		map.put( p.getId(), p );
	}
		
	public void removeEntity(T p) {
		map.remove(p.getId(), p);
	}
	
	public boolean isEmpty() {
		return (map.size() == 0) ? true : false;
	}
	
	public Collection<T> getAll() {
		return map.values();
	}
	
	public Collection<Long> getAllIds() {
		return map.keySet();
	}
	
	public void printAll() {
		Iterator<T> prodInterator = getAll().iterator();
//		while (prodInterator.hasNext());
		while (prodInterator.hasNext()) {
			T product = (T) prodInterator.next();
			System.out.println(product);
		}
	}
	
}

