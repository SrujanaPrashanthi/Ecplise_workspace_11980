/*
 String Bulider is mutable
 not thread safe object
 */

public class StringBuliderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb);
		sb.append("23");
		System.out.println(sb);

	}

}
