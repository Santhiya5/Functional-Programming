
package newtask;
public class FUNCTIONALPROGRAMMING {
 	public static void main(String[] args)
        {		
            Runnable r = new Runnable() {
		public void run()
		{
		 System.out.println("Running in Runnable thread");
			}
		};
            r.run();
		System.out.println("Running in main thread");
	}
}


