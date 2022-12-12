package LoopingStatement;

public class Prog1 {

	public static void main(String[] args) {
		// For Loop
				for(int i = 1; i<=10; i++) {
					System.out.println(i);
				}
				
				
				
				
		        // while Loop
				int i=0;
				while(i<=10) {
					System.out.println(i);
					i++;
					
				}
				
				 // do while Loop
				int j = 0;
				do {
					System.out.println(j);
					j++;
				}while(j<5);
				
				// nested Loop
				for(int s = 1; s<=5; s++) {
					
					
					for(int t = 1; t<=4; t++) {
						
						System.out.println(s);
					}
					
					System.out.println("\n");
				}
				
				
				// Break and continue statement 
				for(int t = 1; t<=8; t++) {
					if(t==4) {
						continue;
					}
					System.out.println(t);
				}
					
					
					for(int t = 1; t<=8; t++) {
					if(t==5) {
						break;
					}
					
					System.out.println(t);
				}
				
				
				
			}

		


	}


