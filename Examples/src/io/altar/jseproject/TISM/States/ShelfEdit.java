package io.altar.jseproject.TISM.States;

import io.altar.jseproject.models.Shelf;
import io.altar.jseproject.repositories.ShelfRepository;

public class ShelfEdit extends State {

	ShelfRepository shelfRep = ShelfRepository.getInstance();
	
	@Override
	public int run() {
		
		long IdShelf1 = sc.getInt("mete o Id shelf a editar");
		System.out.println(shelfRep.consultEntity(IdShelf1));
		Shelf s = shelfRep.consultEntity(IdShelf1);
		
		int vCap = sc.getInt("mete novo dis"); 
		s.setCapacity(vCap);
		float vDai = sc.getInt("mete novo iva"); 
		s.setDailyPrice(vDai);
		
		shelfRep.editEntity(s);	
		
		return 1;
		
	}

}
