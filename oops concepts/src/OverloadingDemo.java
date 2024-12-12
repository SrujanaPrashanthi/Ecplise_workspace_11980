
class Myclac{

	public static int findMax(int x , int y ) {
    	  return (x>y) ? x:y;
      }
	public static double findMax(double x , double y ) {
	  return (x>y) ? x:y;
	}

	public static long findMax(long x , long y ) {
	  return (x>y) ? x:y;
	}

 public class OverloadingDemo{

	public static void main(String[] args) {
		
		int maxInt = Myclac.findMax(100,200);
		System.out.println(maxInt);
		
		double maxDouble = Myclac.findMax(10.5, 20.5);
		System.out.println(maxDouble);
		
		long maxLong = Myclac.findMax(1059875577L, 205765656L);
		System.out.println(maxLong);
		 
		}
	}

}

