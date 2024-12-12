package java8features;

interface Printer{
	void print();
}

public class MethodReference {
	
	public static void beginPrintJob() {
		System.out.println("print job begins..");
	}
	
	public  void startPrintJob() {
		System.out.println("print job starts..");
	}

	public static void main(String[] args) {
		Printer p1 = () -> MethodReference.beginPrintJob();// instead of lambda we are using method ref
		p1.print();
		
		//method reference with static method
		Printer p2 = MethodReference :: beginPrintJob;//:: - lambda expression 
		p1.print();
		
		MethodReference m = new MethodReference();
		Printer p3 = () -> m.startPrintJob();
		p3.print();
		
		//method reference with instance method
		
		Printer p4 = m :: startPrintJob;
		p1.print();
		

	}

}
