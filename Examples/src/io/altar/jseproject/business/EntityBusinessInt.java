package io.altar.jseproject.business;

import io.altar.jseproject.models.Entity;

public interface EntityBusinessInt<T extends Entity> {

	void addEntity(T entity);
	
	void removeEntity(Long id);
	 
	void  editEntity(T entity);
	
	T consultEntity(Long id);

}
