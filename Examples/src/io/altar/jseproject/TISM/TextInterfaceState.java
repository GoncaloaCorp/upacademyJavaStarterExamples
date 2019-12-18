package io.altar.jseproject.TISM;

import io.altar.jseproject.TISM.States.*;

public class TextInterfaceState {

	private State[] states = { 
			new MenuInit(), 			// 0
			new MenuProduct(), 			// 1
				new ProductAdd(),		// 2
				new ProductEdit(),		// 3
				new ProductConsult(),	// 4
				new ProductRemove(),	// 5
			new MenuShelves(),			// 6
				new ShelfAdd(),			// 7
				new ShelfEdit(),		// 8
				new ShelfConsult(),		// 9
				new ShelfRemove()		// 10
			}; 	
	// 4. transitions
	private int[][] transition = { 
			{ 1, 6 }, 				// State 0
			{ 2, 3, 4, 5, 0 }, 		// State 1
			{ 1 },					// State 2
			{ 1 },					// State 3
			{ 1 },					// State 4
			{ 1 },					// State 5
			{ 7, 8, 9, 10, 0 },   	// State 6
			{ 6 },					// State 7
			{ 6 },					// State 8
			{ 6 },					// State 9
			{ 6 }					// State 10
	};
	// 3. current
	private int current = 0;

	public void start() {
		
		while(true) {
			int option = states[current].run();
			if (current == 0 && option == 3) {
				System.out.println("Saida");
				break;
			}
			current = transition[current][option-1];
		}
	}
}
