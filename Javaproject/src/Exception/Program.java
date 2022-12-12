package Exception;

public class Program {

	
		public static void main(String[] args) throws Exception {
			try {
				int a=10, b=0, c;
				c=a/b;
				System.out.println(c);
			}
			catch(Exception e) {
				
				System.out.println(e);
				
			}
			finally {
				System.out.println("Whatever Happens It Will Be Executed");
			}


	}

}
