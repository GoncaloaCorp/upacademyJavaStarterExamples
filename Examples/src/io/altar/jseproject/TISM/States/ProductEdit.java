package io.altar.jseproject.TISM.States;

import io.altar.jseproject.models.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class ProductEdit extends State {

	ProductRepository prodRep = ProductRepository.getInstance();
	
	@Override
	public int run() {
		
		long IdProd1 = sc.getInt("mete o Id a editar");
		System.out.println(prodRep.consultEntity(IdProd1));
		Product p = prodRep.consultEntity(IdProd1);
		
		int vDis = sc.getInt("mete novo dis"); 
		p.setDiscount(vDis);
		int vIva = sc.getInt("mete novo iva"); 
		p.setIva(vIva);
		int vPvp = sc.getInt("mete novo pvp"); 
		p.setPvp(vPvp);
						
		prodRep.editEntity(p);	
		
		return 1;   
		
	}

}
