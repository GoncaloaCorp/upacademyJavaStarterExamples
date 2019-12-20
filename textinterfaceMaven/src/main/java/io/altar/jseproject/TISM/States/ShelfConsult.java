package io.altar.jseproject.TISM.States;

public class ShelfConsult extends State {

//	ShelfRepository shelfRep = ShelfRepository.getInstance();
	
	@Override
	public int run() {
		long IdShelf2 = sc.getInt("mete o Id shelf a consultar");									
		System.out.println(SB.consultEntity(IdShelf2));
		
		return 1;
	}

}
