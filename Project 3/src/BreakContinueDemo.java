//break statement usage 
public class BreakContinueDemo {

	public static void main(String[] args) {
		for(int i=1; i<=20; i++) {
			if(i%2 == 0) {
				continue;//we can skip the true conditions
			}
			if(i == 10) {
				break;//we can break the loop condition
			}
				System.out.println(i);
				
			}
		}

	}


