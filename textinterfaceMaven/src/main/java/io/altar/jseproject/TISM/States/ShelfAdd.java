package io.altar.jseproject.TISM.States;

import io.altar.jseproject.models.Shelf;

public class ShelfAdd extends State {

//	ShelfRepository shelfRep = ShelfRepository.getInstance();
	
	@Override
	public int run() {	
		int v1 = sc.getInt("mete capacidade");
		int v2 = sc.getInt("mete preço diario");
		Shelf shelf = new Shelf(v1, v2);				
		SB.addEntity(shelf);	
		
		return 1;		
	}
}
