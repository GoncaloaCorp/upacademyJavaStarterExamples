package io.altar.jseproject.TISM.States;

import io.altar.jseproject.models.Product;

public class ProductAdd extends State{
	
//	ProductRepository prodRep = ProductRepository.getInstance();
	
	@Override
	public int run() {				
		int v1 = sc.getInt("mete discount"); 
		int v2 = sc.getInt("mete iva"); 
		int v3 = sc.getInt("mete pvp"); 
		Product product = new Product(v1, v2, v3);
		PB.addEntity(product);

		return 1;
	}
}
