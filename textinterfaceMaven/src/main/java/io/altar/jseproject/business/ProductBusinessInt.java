package io.altar.jseproject.business;

import io.altar.jseproject.models.Product;
import io.altar.jseproject.repositories.ProductRepository;

public interface ProductBusinessInt extends EntityBusinessInt<Product> {
	ProductRepository ProdRep = ProductRepository.getInstance();
}

