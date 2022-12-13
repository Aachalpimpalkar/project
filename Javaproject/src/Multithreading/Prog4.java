package Multithreading;

//by implementing runnable interface

class A implements Runnable{
	public void run() {
		for(int i=0; i<7;i++) {
			System.out.println(i);
			
			}
		
	}
}









public class Prog4 {

	public static void main(String[] args) {
		A r=new A();
		Thread t = new Thread(r);
		t.start();
		
		

	}

}
