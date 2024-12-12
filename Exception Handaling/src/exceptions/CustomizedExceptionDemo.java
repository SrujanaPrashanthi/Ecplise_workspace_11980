package exceptions;

public class CustomizedExceptionDemo {
	static int balance = 5000;
	public static void checkAge(int age) throws InvalidAgeException{
		if(age >= 18) {
			System.out.println("Eligible to vote");
		}else {
			throw new InvalidAgeException("not eligible to vote");
		}
	}
	public static void withdraw(int amount) {
		if(amount > balance) {
			throw new InSufficientBalanceException ("InSufficient funds");
		}else {
			System.out.println("collect cash");
		}
		
	}
	public static void main(String[] args) {
		try {
			checkAge(24);
		} catch (InvalidAgeException e) {
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		withdraw(5000);
		

	}

}
