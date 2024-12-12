
public class MethodDemo {
	public static int findSum(int x, int  y ) {
		return x+y;
	}
	public static void greet() {
		System.out.println("Hello everybody!");
	}
	public static double findMax(double x , double y) {
		return(x>y) ? y:x;
	}
	public static double findMin(double x , double y) {
		return(x<y) ? x:y;
	}
	public static int findSquare(int n) {
		return n*n;
	}
	public static int findCube(int n) {
		return n*n*n;
	}
	public static void main(String[] args) {
		int total = findSum(10, 20);
		System.out.println(total);
		
		System.out.println(findSum(200,300));
		System.out.println(findSum(2000, 3000));
		
		greet();
		 double max = findMax(102.5, 130.5);
		 System.out.println(max);
		 
		 System.out.println(findMax(400.6,700.9));
		 
		 double min = findMin(102.5, 130.5);
		 System.out.println(min);
		 
		 System.out.println(findMin(400.6,700.9));
		 
		 int n = 50;
		 System.out.println(findSquare(n));
		 System.out.println(findCube(n));
	}
}
