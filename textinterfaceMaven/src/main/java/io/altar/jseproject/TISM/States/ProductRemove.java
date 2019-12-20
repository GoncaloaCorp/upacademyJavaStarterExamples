package io.altar.jseproject.TISM.States;

public class ProductRemove extends State {

//	ProductRepository prodRep = ProductRepository.getInstance();
	
	@Override
	public int run() {
		long IdProd3 = sc.getInt("mete o Id product a remover");
		PB.removeEntity(IdProd3);
		
		return 1;
	}
}
