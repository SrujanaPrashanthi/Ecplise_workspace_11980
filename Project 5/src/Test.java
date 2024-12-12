class Numbers{
	int a = 10;
	int b = 20;
	int i = 111;
	public void Assign() {
		System.out.println("0-Parent constructor");
	
	}
	public void Assign(int a) {
		
		System.out.println("1-Parent constructor");
		
	}
	public void Assign(int a , int b) {
		System.out.println("2-Parent constructor");
	}
	public void m1() {
		System.out.println("java");
	}
	
}
class WholeNUmbers extends Numbers{
	int a = 100;
	int b = 200;
	int j = 222;
	
	public void Whole() {

		
		System.out.println("0-Child constructor");
	}
	
	public void m1() {
		
	System.out.println("Python");
	}
	public void m2() {
		this.m1();
		super.m1();
	}
	  void add(int a, int b) {
		  System.out.println(a+b);
		  System.out.println(this.a + this.b);
		  System.out.println(super.a+ super.b);
		  System.out.println(i);
		  System.out.println(this.j);
		  System.out.println(j);
	  }
}
public class Test {

	public static void main(String[] args) {
		WholeNUmbers c = new WholeNUmbers();
		c.add(1000, 2000);
		c.m2();

	}

}
