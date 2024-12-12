
public class FuntionaInterfaceDemo {

	public static void main(String[] args) {
		Printer p = new EpsonPrinter();//implement object output
	//interface variable output
		p.printJob();
		p.scan();
		Printer.threeDprint();

	}

}
