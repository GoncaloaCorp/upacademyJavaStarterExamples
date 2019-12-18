package io.altar.jseproject.TISM.States;

import io.altar.jseproject.repositories.ShelfRepository;

public class ShelfConsult extends State {

	ShelfRepository shelfRep = ShelfRepository.getInstance();
	
	@Override
	public int run() {
		
		long IdShelf2 = sc.getInt("mete o Id shelf a consultar");									
		System.out.println(shelfRep.consultEntity(IdShelf2));
		
		return 1;
		
	}

}
