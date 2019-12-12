package pt.upacademy.desafios.desafio1;

public class Desafio {

	private int count;
	private int big3 = 0;
	private int big5 = 0;	
	
	public Desafio(int i) {
		this.count = i;
	}

	public void run() {
		for (int i = 1; i <= count; i++) {
			if (i%3 == 0) {
				big3++;
				System.out.println("test_01");
				System.out.println(big3);				
			}
			if (i%5 == 0) {
				big5++;
				System.out.println("test_02");
				System.out.println(big5);				
			}
		}
		System.out.println("big3 é");
		System.out.println(big3);
		System.out.println("big5 é");
		System.out.println(big5);		
	}

	public int getBig3Count() {
		System.out.println("estou a funcionar 2");
		return big3;
		
//		return 0;
	}

	public int getBig5Count() {
		System.out.println("estou a funcionar 3");
		return big5;
		
//		return 0;
	}

}
