package Multithreading;

class Eclipse extends Thread
{
	public void run()
	{
		for(int i=0; i<4; i++) {
			System.out.println("Eclipse thread id is "+Thread.currentThread().getId());
		}
	}
}












public class Prog2 {

	public static void main(String[] args) {
		Eclipse obj= new Eclipse();
		obj.setPriority(Thread.MAX_PRIORITY);
		obj.start();
		
		Eclipse obj1= new Eclipse();
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj1.start();
		
		Eclipse obj2= new Eclipse();
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj2.start();
	}

















