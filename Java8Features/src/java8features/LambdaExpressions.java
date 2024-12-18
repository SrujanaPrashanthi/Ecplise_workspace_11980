package java8features;

@FunctionalInterface
interface MyFuntionalInterface{
	void greet();
}

interface MyFuntionalInterface2{
	int findSquare(int num);
}

interface MyFuntionalInterface3{
	int findCube(int num);
}

interface MyFuntionalInterface4{
	int findSum(int num1 , int num2);
}

interface MyFuntionalInterface5{
	int findSub(int num1 , int num2);
}

interface MyFuntionalInterface6{
	boolean isEven(int num);
}


public interface LambdaExpressions {
	public static void main(String[] args) {
		MyFuntionalInterface myFun = () -> System.out.println("Hello..");
		myFun.greet();
		
		
		MyFuntionalInterface2 myFun2 = (int num) -> num * num;
		int square = myFun2.findSquare(10);
		System.out.println(square);
		
		MyFuntionalInterface3 myFun3 = (int num) -> num * num * num;
		int cube = myFun3.findCube(10);
		System.out.println(cube);
		
		MyFuntionalInterface4 myFun4 = (int num1, int num2) -> num1+num2;
		int sum = myFun4.findSum(10 , 20);
		System.out.println(sum);
		
		MyFuntionalInterface5 myFun5 = (int num1, int num2) -> num1-num2;
		int sub = myFun5.findSub(10 , 20);
		System.out.println(sub);
		
		MyFuntionalInterface6 myFun6 = (int num) -> num%2==0;
		boolean even = myFun6.isEven(3);
		System.out.println(even);
		System.out.println(myFun6.isEven(10));
		System.out.println(myFun6.isEven(11));
	}


}
