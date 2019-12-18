package io.altar.jseproject.TISM.States;

import io.altar.jseproject.models.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class ProductRemove extends State {

	ProductRepository prodRep = ProductRepository.getInstance();
	
	@Override
	public int run() {
		
		long IdProd3 = sc.getInt("mete o Id product a remover");
		Product p2 = prodRep.consultEntity(IdProd3);
		prodRep.removeEntity(p2);
		
		return 1;
		
	}

}
