class Parent{
	public void property() {
		System.out.println("100Acr + 100kgs of gold + 100Crores");
	}
	public void study() {
		System.out.println("Medicine");

	}
	public void marry() {
	 System.out.println("Arrange Marriage");	
	}
}
class Child extends Parent{
	//overriding 
	@Override
	public void marry() {
		System.out.println("Love marriage");
	}
	
	public void study() {
		System.out.println("Acting");
		}

}
public class OverridingDemo {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.property();
		p.study();
		p.marry();
		System.out.println("--------------");
		Child c = new Child();
		c.property();
		c.study();
		c.marry();

		

	}

}