package io.altar.jseproject.TISM.States;

//import io.altar.jseproject.models.Product;

public class ShelfRemove extends State {

//	ShelfRepository shelfRep = ShelfRepository.getInstance();

	@Override
	public int run() {
		long IdShelf3 = sc.getInt("mete o Id shelf a remover");
		
//		int option = sc.getInt("Quer meter o/s produto/s noutra prateleira. 1)Sim 2)Nao"); 
//		while(option != 1 || option != 2) {	
//			
//			option = sc.getInt("Volte a inserir a resposta. 1)Sim 2)Nao");
//		}
//		if(option==1) {
//			
//			Product product = PB.consultEntity((long)shelfId);  // obter os ids da prateleira a ser eliminada
//			
//			System.out.println(SB.getAllIds());
//			int shelfId = sc.getInt("Indique o id da prateleira para inserir os produtos.");
//			p.addShelfId(shelfId);
//			
//			Product product = PB.consultEntity((long)shelfId);
//			product.addShelfId(s.getId());
//			PB.editEntity(product);
//		}
		
		PB.removeEntity(IdShelf3);

		return 1;
	}
}
