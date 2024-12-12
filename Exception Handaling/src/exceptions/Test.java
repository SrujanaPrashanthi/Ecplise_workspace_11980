package exceptions;

public class Test {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		
		System.out.println("start");
		
		System.out.println(arr[0]);
									
		System.out.println(arr[1]);
									
		System.out.println(arr[2]);
		
		String s = null;
		
		try {
			//System.out.println(arr[3]);
			//System.out.println(10/0);
			System.out.println(s.charAt(0));
			
		}catch(ArrayIndexOutOfBoundsException e) {// child class of the exception
			
			System.out.println("Exception is Handled");
			
		}catch(ArithmeticException e) {//child class of the exception
			
			System.out.println("Exception is Handled");
			
		}catch(Exception e) {//child class of the throwable
			
			//e.printStackTrace();
			
			//System.out.println(e);
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");

	}

}
