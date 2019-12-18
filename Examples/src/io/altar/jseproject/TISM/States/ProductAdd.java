package io.altar.jseproject.TISM.States;

import io.altar.jseproject.models.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class ProductAdd extends State{
	
	ProductRepository prodRep = ProductRepository.getInstance();
	
	@Override
	public int run() {
				
		int v1 = sc.getInt("mete dis"); 
		int v2 = sc.getInt("mete iva"); 
		int v3 = sc.getInt("mete pvp"); 
		Product product = new Product(v1, v2, v3);
		prodRep.addEntity(product);

		return 1;
	}

}
