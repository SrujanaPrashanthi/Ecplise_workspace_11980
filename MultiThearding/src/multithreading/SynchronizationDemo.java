package multithreading;

class Multable{
	public synchronized  void printMulTable(int num) {//allowing only one thread for execution and to achieve thread safety - synchronized block and modifier to achieve synchronized 
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));//multiplication process
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
																																																																			}
		}
	}
}
class KohliThread extends Thread{
	Multable t;
	
	public KohliThread(Multable t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printMulTable(9);
	}
	
}

class DhoniThread extends Thread{
	Multable t;
	
	public DhoniThread(Multable t) {
		
		this.t = t;
	}
	@Override
	public void run() {
		t.printMulTable(10);
	}
	
}

class DineshThread extends Thread{
	Multable t;
	
	public DineshThread(Multable t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printMulTable(11);
	}
	
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		Multable t = new Multable();
		
		KohliThread t1 = new KohliThread(t);
		DhoniThread t2 = new DhoniThread(t);
		DineshThread t3 = new DineshThread(t);
		t1.start();
		t2.start();
		t3.start();
		

	}

}
