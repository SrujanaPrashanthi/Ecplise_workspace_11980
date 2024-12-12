
public class StringDemo {

	public static void main(String[] args) {
		//using literal
		String s1 = "java";
		
		String s2 = new String("Python");
		
		String s3 = "java";
		String s4 = new String("Python");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
        System.out.println(s1 == s3);
        System.out.println(s2 == s4);
	}

}