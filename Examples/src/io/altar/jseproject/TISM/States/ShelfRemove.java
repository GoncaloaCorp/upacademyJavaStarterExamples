package io.altar.jseproject.TISM.States;

import io.altar.jseproject.models.Shelf;
import io.altar.jseproject.repositories.ShelfRepository;

public class ShelfRemove extends State {

	ShelfRepository shelfRep = ShelfRepository.getInstance();
	
	@Override
	public int run() {
		
		long IdShelf3 = sc.getInt("mete o Id shelf a remover");
		Shelf s2 = shelfRep.consultEntity(IdShelf3);
		shelfRep.removeEntity(s2);	
		
		return 1;
		
	}

}
