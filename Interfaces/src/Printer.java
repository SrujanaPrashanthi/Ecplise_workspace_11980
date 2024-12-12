
//funtional interface =  only 1 abstract method + no .of abstract and static methods
@FunctionalInterface
public interface Printer {
	
//only one abstract method is allowed 
	void printJob();//implicity public abstract
	
//any no.of default and static methods are allowed 
	
	default void scan() {
		System.out.println("scan....");
		
	}
	
	static void threeDprint() {
	System.out.println("3D print....");
	}
}
