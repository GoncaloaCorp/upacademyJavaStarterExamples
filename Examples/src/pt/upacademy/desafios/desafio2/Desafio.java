package pt.upacademy.desafios.desafio2;

import java.util.*;

public class Desafio {

	public static String phrase;
	private String singleWords[];
	private StringBuilder seqOrdenada;
	
	public static String order(String string) {
		
		phrase = string;
		
		String singleWords[] = phrase.split("\\p{Space}", -1);
		
		List<String> singleWords2 = Arrays.asList(singleWords);
		
			for (int i = 0; i < singleWords.length; i++) {
				
				String s = singleWords[i];
				String clean = s.replaceAll("\\D+",""); 
				int num = Integer.parseInt(clean);
				System.out.println(num);
				
				String sSeguinte = singleWords[+i];
				String cleanSeguinte = sSeguinte.replaceAll("\\D+",""); 
				int num2 = Integer.parseInt(cleanSeguinte);
				System.out.println(num2);
				
	
				if (num > num2) {					
					System.out.println(i);
					System.out.println(+i);
					Collections.swap(singleWords2, i, +i); 
				}
				
			}		
		
		return null;
	}
	
	

}
