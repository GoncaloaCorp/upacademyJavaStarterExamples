package io.altar.jseproject.business;

import java.util.Collection;

import io.altar.jseproject.models.Shelf;

public class ShelfBusiness implements ShelfBusinessInt {

	@Override
	public void addEntity(Shelf entity) {
		ShelfRep.addEntity(entity);	
	}

	@Override
	public void removeEntity(Long id) {
		ShelfRep.removeEntity(consultEntity(id));	
	}

	@Override
	public void editEntity(Shelf entity) {
		ShelfRep.editEntity(entity);
	}

	@Override
	public  Shelf consultEntity(Long id) {
		return ShelfRep.consultEntity(id);	
	}
	
	public Collection<Long> getAllIds() {
		return ShelfRep.getAllIds();
	}

}
