class Profession{
	public void study() {
		System.out.println("Medicine");
	}
}
class interest extends Profession{
	public void study() {
		System.out.println("Acting");
	}
}
public class CompileTimePolymorphismDemo1 {

	public static void main(String[] args) {
		Profession p = new Profession();
		p.study();
		
		interest c = new interest();
		c.study();
		
		Profession p2 = new interest();
		p2.study();

	}

}