package pt.upacademy.desafios.desafio2;

import java.util.*;

public class Desafio {

	public static String phrase;
	private String singleWords[];
	private StringBuilder seqOrdenada;
	
	public int ciclos = 0;
	
	public static String order(String string) {
		
		phrase = string;
		
		String singleWords[] = phrase.split("\\p{Space}", -1);
		
		List<String> singleWords2 = Arrays.asList(singleWords);
		
		System.out.println(singleWords2);
		
			for (int i = 0; i < singleWords.length; i++) {
//				ciclos + 1;
//				System.out.println(ciclos);
					
				
				String s1 = singleWords[i];
				String c1 = s1.replaceAll("\\D+",""); 
				int num = Integer.parseInt(c1);
				System.out.println("funciona_01");
				System.out.println(c1);
				
				String s2 = singleWords[i + 1];
				String c2 = s2.replaceAll("\\D+",""); 
				int num2 = Integer.parseInt(c2);
				System.out.println("funciona_02");
				System.out.println(c2);
				
	
				if (num > num2) {					
					System.out.println(i);
					System.out.println(+i);
					Collections.swap(singleWords2, i, +i); 
					System.out.println("funciona_03");
				} else {
					System.out.println("nao fez nada");
				}
				
			}
			
			System.out.println(singleWords2);
		
		return null;
	}
	
	

}
