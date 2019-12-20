package io.altar.jseproject.business;

import java.util.Collection;

import io.altar.jseproject.models.Product;

public class ProductBusiness implements ProductBusinessInt {

	@Override
	public void addEntity(Product entity) {
		ProdRep.addEntity(entity);	
	}

	@Override
	public void removeEntity(Long id) {		
		ProdRep.removeEntity(consultEntity(id));
	}

	@Override
	public void editEntity(Product entity) {		
		ProdRep.editEntity(entity);	
	}

	@Override
	public Product consultEntity(Long id) {		
		return ProdRep.consultEntity(id);
	}

	public Collection<Long> getAllIds() {
		return ProdRep.getAllIds();
	}

}
