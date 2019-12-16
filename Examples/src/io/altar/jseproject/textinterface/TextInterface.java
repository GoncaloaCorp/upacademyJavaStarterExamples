package io.altar.jseproject.textinterface;

import io.altar.jseproject.models.Product;
import io.altar.jseproject.models.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;
import io.altar.jseproject.textinterface.ScannerUtils.ScannerUtils;

public class TextInterface {
	ScannerUtils sc = new ScannerUtils();
	
	ProductRepository prodRep = ProductRepository.getInstance();
	ShelfRepository shelfRep = ShelfRepository.getInstance();

	public void ecraInicio() {
		int option = 0;
		do {
			System.out.println("1)\t Listar Produtos");
			System.out.println("2)\t Listar Shelves");
			System.out.println("3)\t Sair");
			int[] options = { 1, 2, 3 };
			option = sc.getValidInt("Selecionar opção : ", options);
			switch (option) {
			case 1:
				ecraLProducts();
				break;
			case 2:
				ecraLShelves();
				break;
			case 3:
				System.out.println("Saida");
				break;
			}
		} while (option != 3);
	}

	private void ecraLProducts() {
		int option = 0;
		do {
			System.out.println("1)\t Criar Products");
			System.out.println("2)\t Editar Products");
			System.out.println("3)\t Consultar Products");
			System.out.println("4)\t Remover Products");
			System.out.println("5)\t Voltar");
			int[] options = { 1, 2, 3, 4, 5 };
			option = sc.getValidInt("Selecionar opção : ", options);
			switch (option) {
			case 1:
				int v1 = sc.getInt("mete dis"); 
				int v2 = sc.getInt("mete iva"); 
				int v3 = sc.getInt("mete pvp"); 
				Product product = new Product(v1, v2, v3);
				prodRep.addEntity(product);
//				System.out.println("Fazer - criar logica");
				break;
			case 2:
				long IdProd1 = sc.getInt("mete o Id a editar");
				
				Product p = prodRep.consultEntity(IdProd1);
				
				int vDis = sc.getInt("mete novo dis"); 
				p.setDiscount(vDis);
				int vIva = sc.getInt("mete novo iva"); 
				p.setIva(vIva);
				int vPvp = sc.getInt("mete novo pvp"); 
				p.setPvp(vPvp);
								
				prodRep.editEntity(p);
				
				System.out.println("Fazer - Editar Logica");
				break;
			case 3:
				long IdProd2 = sc.getInt("mete o Id a consultar");
				
				prodRep.consultEntity(IdProd2);
				System.out.println("Fazer - Ver Logica");
				break;
			case 4:
				long IdProd3 = sc.getInt("mete o Id a remover");
				Product p2 = prodRep.consultEntity(IdProd3);
				prodRep.removeEntity(p2);
				System.out.println("Fazer - apagar Logica");
				break;
			}
		} while (option != 5);
	}
	
	private void ecraLShelves() {
		int option = 0;
		do {
			System.out.println("1)\t Criar Shelves");
			System.out.println("2)\t Editar Shelves");
			System.out.println("3)\t Consultar Shelves");
			System.out.println("4)\t Remover Shelves");
			System.out.println("5)\t Voltar");
			int[] options = { 1, 2, 3, 4, 5 };
			option = sc.getValidInt("Selecionar opção : ", options);
			switch (option) {
			case 1:			
				int v1 = sc.getInt("mete capacidade");
				int v2 = sc.getInt("mete preço diario");
				Shelf shelf = new Shelf(v1, v2);				
				shelfRep.addEntity(shelf);
//				System.out.println("Fazer - criar logica");
				break;
			case 2:
				shelfRep.editEntity(p);
				System.out.println("Fazer - Editar Logica");
				break;
			case 3:
				shelfRep.consultEntity(id);
				System.out.println("Fazer - Ver Logica");
				break;
			case 4:
				shelfRep.removeEntity(p);
				System.out.println("Fazer - apagar Logica");
				break;
			}
		} while (option != 5);
	}

}
