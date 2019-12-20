package io.altar.jseproject.TISM.States;

public class MenuInit extends State {

	@Override
	public int run() {
		System.out.println("1)\t Listar Produtos");
		System.out.println("2)\t Listar Shelves");
		System.out.println("3)\t Sair");
		int[] options = { 1, 2, 3 };
		return sc.getValidInt("Selecionar opção : ", options);
	}

}
