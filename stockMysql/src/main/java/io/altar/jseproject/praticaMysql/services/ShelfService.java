package io.altar.jseproject.praticaMysql.services;

import java.util.List;

import javax.inject.Inject;

import io.altar.jseproject.praticaMysql.models.Shelf;
import io.altar.jseproject.praticaMysql.repositories.ShelfRepository;
import io.altar.jseproject.praticaMysql.services.interfaces.ShelfServiceInterface;

//USAR o @TRANSACTIONAL
public class ShelfService extends EntityService<ShelfRepository ,Shelf> implements ShelfServiceInterface {

	@Inject
	protected ProductService PS;
	
	@Override
	protected String getEntityClassName() {
		return Shelf.getName();
	}
	
	@Override
	public long create(Shelf entity) {
		if(entity.getProduct() != null) {
			List<Long> allIds = PS.getAllIds();
			if(allIds.contains(entity.getProduct().getId()) == false) {
				throw new RuntimeException("O produto com o id indicado nao existe");
			}
		}
		return repository.addEntity(entity);
	}
	
	
}
