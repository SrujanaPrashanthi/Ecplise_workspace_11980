
public class Loopsreverse {
	public static void printNumbers(int start , int end)throws InterruptedException {
		System.out.println("start.....");
		while(start < end ) {
			System.out.println("Count:" +start);
			Thread.sleep(1000 * 1);
			start--;
			break;
	}
		System.out.println("end....");
	}

	public static void main(String[] args) throws InterruptedException {
		printNumbers(10,1);

	}

}
