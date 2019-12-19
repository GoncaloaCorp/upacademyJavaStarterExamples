package io.altar.jseproject.TISM.States;

public class ProductConsult extends State {

//	ProductRepository prodRep = ProductRepository.getInstance();
	
	@Override
	public int run() {
		
		long IdProd2 = sc.getInt("mete o Id a consultar");				
		System.out.println(PB.consultEntity(IdProd2));
		
		return 1;
		
	}

}
