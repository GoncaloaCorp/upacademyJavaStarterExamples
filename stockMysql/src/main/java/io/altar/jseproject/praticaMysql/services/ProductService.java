package io.altar.jseproject.praticaMysql.services;

import java.util.List;

import javax.transaction.Transactional;

import io.altar.jseproject.praticaMysql.models.Product;

import io.altar.jseproject.praticaMysql.repositories.ProductRepository;
import io.altar.jseproject.praticaMysql.services.interfaces.ProductServiceInterface;

//USAR o @TRANSACTIONAL
public class ProductService extends EntityService<ProductRepository, Product> implements ProductServiceInterface {
	
	@Override
	protected String getEntityClassName() {
		return Product.getName();
	}
	
	@Transactional
	@Override
	public void update(Product entity) {
		if (entity.getShelves() != null) {	
			List<Long> allIds = getAllIds();
			entity.getShelves().forEach(shelf -> {
				if (allIds.contains(shelf.getId()) == false) {
					throw new RuntimeException("O produto que estás a tentar atualizar não existe");
				}
			});
		}
		validEntity(entity.getId());
		repository.editEntity(entity);
	}

	@Override
	public void delete(long id) {
		
		if (repository.getEntity(id) == null) {
			throw new RuntimeException("O produto que estás a tentar atualizar não existe");
		}
		repository.removeEntity(id);
	}
	
}
