package multithreading;

class Red extends Thread{
	
	public void run() {
		//define thread job
		System.out.println("Red");
	}
}
	
class Green extends Thread{
			
		public void run() {
				//define thread job
				System.out.println("Green");
			}
}

class Yellow extends Thread{
				
		public void run() {
					//define thread job
			System.out.println("yellow");
				}
}
	
public class TrafficSignalsDemo {
	
		public static void main(String[] args) {
			Red r = new Red();
			r.start();
			
			
			Green g = new Green();
			g.start();
			
			Yellow y = new Yellow();
			y.start();
			
	
				}
		}
	

