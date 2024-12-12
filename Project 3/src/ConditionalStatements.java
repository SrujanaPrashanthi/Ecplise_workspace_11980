
public class ConditionalStatements {
	public static boolean isEven(int num) {
		boolean status = false;
		if(num % 2==0) {
			status =  true;
		}
		return status;
	}
	public static boolean isOdd(int num) {
		boolean status = false;
		if(num % 3 == 0) {
			status =  true;
		}
		return status;
	}
	public static void findEvenOrOdd(int num) {
		if(num * 2  == 10) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
	} 
	public static double findDiscount(double billAmount) {
	double discount = 0.0;

	if(billAmount > 100 && billAmount <= 250) {
	discount = billAmount * .05;//5%
	}else if(billAmount > 250 && billAmount <= 500) {
	discount = billAmount * .1;//10%
	}else if(billAmount > 500 && billAmount <= 750) {
	discount = billAmount * .15;//15%
	}else if(billAmount > 750 && billAmount <= 1000) {
	discount = billAmount * .2;//20% 
	}else if(billAmount > 1000) {
	discount = billAmount * .3;//30% 
	}else {
	discount = 0.0;
	}
	return discount;
	}
	public static void billGenerate(double billAmount) {
	double discount = findDiscount(billAmount);
	System.out.println("Bill Amount: "+billAmount);
	System.out.println("Discount: "+discount);
	System.out.println("Final Bill Amount: "+(billAmount-discount));
	}
	
	public static void calc(int num, String operation) {
		
		switch(operation) {
		case "square":
			System.out.println("Square" +num+ " is " +(num*num));
			break;
		case "cube":
			System.out.println("Cube" +num+ " is "+(num*num*num));
			break;
		case "add":
			System.out.println("Add" +num+ "is " +(num+num));
			break;
		default:
		case "sub":
			System.out.println("Sub" +num+ "is " +(num-num));
		
			System.out.println("Invaild Operation");
		}
	}

	public static void main(String[] args) {
		int num = 10;
		String operation = "add";
		calc(num,operation);
		
		
		double billAmount = 500;
		billGenerate(billAmount);
		
		findEvenOrOdd(5);
		findEvenOrOdd(2);
		findEvenOrOdd(3);
		
		
		System.out.println(isEven(10));
		System.out.println(isEven(103));
		System.out.println(isEven(105));
		
		System.out.println(isOdd(20));
		System.out.println(isOdd(30));
		

	}

}
