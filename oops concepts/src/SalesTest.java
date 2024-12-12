
public class SalesTest {

	public static void main(String[] args) {
		OnlineShopping os = new OnlineShopping();
		os.amazon();
		os.filpcart();
		os.Myntra();
		os.Meesho();
		
		
		System.out.println("-----------");
		
		OnlineSales os2 = new OnlineSales();
		os2.amazon();
		os2.filpcart();
		os2.Myntra();
		os2.Meesho();
		os2.MegaSale();
	}


}
