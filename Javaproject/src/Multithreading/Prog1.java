
//by extending thread class


package Multithreading;



		class A extends Thread{
			public void run() {
				for(int i=0; i<=10; i++) {
					System.out.println(i);
				}
			}
		}









		public class Prog1 {

			public static void main(String[] args) {
				A obj= new A();
				obj.start();

			}
		}


