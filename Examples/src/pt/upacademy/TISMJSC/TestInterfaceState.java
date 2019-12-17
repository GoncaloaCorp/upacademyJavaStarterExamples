package pt.upacademy.TISMJSC;

import pt.upacademy.TISMJSC.States.*;

public class TestInterfaceState {
 
	 	private State[] states = {
			 new MenuInit(), 		//0
			 new MenuProduct(),		//1
			 new ProductAdd(),		//2
			 new MenuShelves()		//3
		};   //2
	    // 4. transitions
	    private int[][] transition = {
	    			{1,3}, 				//state 0
	    			{2,1,1,1,0}, 		//state 1
	    			{1},				//state 2
	    			{2,2,2,2,0},		//state 3
	    };
	    // 3. current
	    private int current = 0;

	    private void start() {
	        
	    	
	    	while (true) {
	    		int option = states[current].run();
	    		if (current == 0 && option == 3) {
					System.out.println("Saida");
	    			break;
				}
	    		
	    		current = transition[current][option-1];
			}
	    }

}
