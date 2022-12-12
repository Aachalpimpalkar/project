package Multithreading;
class Eclipse extends Thread{
	public void run() {
		for(int i =0; i<10;i++) {
			System.out.println("Eclipse thread id is "+Thread.currentThread().getId());
			
			try {
				sleep(3000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
				
			}
			
			
		}
	}
}




public class Prog3 {

	public static void main(String[] args)   {
		Eclipse obj = new Eclipse();
		obj.start();
}}