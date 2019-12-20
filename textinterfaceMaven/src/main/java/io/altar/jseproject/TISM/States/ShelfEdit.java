package io.altar.jseproject.TISM.States;

import io.altar.jseproject.models.Shelf;
import io.altar.jseproject.models.Product;

public class ShelfEdit extends State {

//	ShelfRepository shelfRep = ShelfRepository.getInstance();
	
	@Override
	public int run() {
		long IdShelf1 = sc.getInt("mete o Id shelf a editar");
		System.out.println(SB.consultEntity(IdShelf1));
		Shelf s = SB.consultEntity(IdShelf1);
		
		int vCap = sc.getInt("mete nova capacidade"); 
		s.setCapacity(vCap);
		float vDai = sc.getInt("mete novo preço diario"); 
		s.setDailyPrice(vDai);
		
		int option2 = sc.getInt("Indique se quer adicionar algum produto na prateleira. 1)Sim 2)Nao");
		while(option2 != 1 || option2 != 2) {	
			
			option2 = sc.getInt("Volte a inserir a resposta. 1)Sim 2)Nao");
		}
		
		if(option2==1) {
			System.out.println(PB.getAllIds());
			int prodId = sc.getInt("Indique o id da produto.");
			s.setProductId(prodId);
			Product product = PB.consultEntity((long)prodId);
			product.addShelfId(s.getId());
			PB.editEntity(product);
		}
		
		SB.editEntity(s);	
		
		return 1;
	}
}
