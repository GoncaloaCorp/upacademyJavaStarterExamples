package io.altar.jseproject.TISM.States;

import io.altar.jseproject.models.Product;
import io.altar.jseproject.models.Shelf;

public class ProductEdit extends State {

//	ProductRepository prodRep = ProductRepository.getInstance();
	
	@Override
	public int run() {	
		long IdProd1 = sc.getInt("mete o Id product a editar");
		System.out.println(PB.consultEntity(IdProd1));
		Product p = PB.consultEntity(IdProd1);
		
		int vDis = sc.getInt("mete novo discount"); 
		p.setDiscount(vDis);
		int vIva = sc.getInt("mete novo iva"); 
		p.setIva(vIva);
		int vPvp = sc.getInt("mete novo pvp"); 
		p.setPvp(vPvp);
		
		int option = sc.getInt("Indique se quer adicionar o produto a alguma prateleira. 1)Sim 2)Nao"); 
		while(option != 1 || option != 2) {			
			option = sc.getInt("Volte a inserir a resposta. 1)Sim 2)Nao");
		}
		
		if(option==1) {
			System.out.println(SB.getAllIds());
			int shelfId = sc.getInt("Indique o id da prateleira.");
			p.addShelfId(shelfId);
			Shelf shelf = SB.consultEntity((long)shelfId);
			shelf.setProductId(p.getId());
			SB.editEntity(shelf);
		}
		
		PB.editEntity(p);	
		
		return 1;   	
	}
}
