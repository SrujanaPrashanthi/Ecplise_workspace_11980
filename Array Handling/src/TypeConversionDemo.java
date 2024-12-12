
public class TypeConversionDemo {

	public static void main(String[] args) {
		int i = 130;// 4 byte memory cannot be stored in one byte
		byte b = (byte) i;// this called type casting we have to give which type we want to change 
		System.out.println(b);
		System.out.println(i);
		
		//int value to byte value
		
		int i2 =  120;
		double d = (byte) i2;
		System.out.println(i2);
		System.out.println(d);
		
		double d1 = 127.5;
		int i3 = (int) d;
		
		System.out.println(i3);
		System.out.println(d1);
		
		//string value to integers
		
		String s1 = "10";
		String s2 = "20";
		
		int n1 = Integer.parseInt(s1);//which is used to convert string value to integer
        int n2 = Integer.parseInt(s2);
        
        System.out.println(s1+s2);
        System.out.println(n1+n2);
        
        String s3 = "10.4";
        String s4 = "20.5";
        double d2  = Double.parseDouble(s3);
        double d3 = Double.parseDouble(s4);
        System.out.println(s3+s4);// this one concatenate the strings
        System.out.println(d2+d3);// after using parse method it converts to given data type and adds the value
	}

}
