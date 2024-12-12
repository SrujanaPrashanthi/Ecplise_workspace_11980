package multithreading;
class BhahubaliThread extends Thread{
	int total = 0;

	public void run() {
		System.out.println("2.BhahubaliThread begins calculation");
		for(int i=1; i<100;i++) {
			total = i;
		}
		System.out.println("3. Bhahubali thread gives notifaction");
		synchronized (this) {
			this.notify();//giving the notification to other threads 
			this.notifyAll();// instead of notifying all the time we use this method to notify all at a time 
			//this.notify();//giving the notification to other threads 
		}
		//perform some other logic
	}
	
}
public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		BhahubaliThread b = new BhahubaliThread();
		b.start();
		//b.join();
		//Thread.sleep(1);
		System.out.println("1.Main threading calling wait()");
		synchronized (b) {
			b.wait();
		}
		System.out.println("4. main thread access total property");
		System.out.println(b.total);

	}

}

