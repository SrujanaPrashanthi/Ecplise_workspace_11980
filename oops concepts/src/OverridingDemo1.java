
class Doctor{
	public void HospitalName() {
		System.out.println("Calvary Temple Hospital");
	}
	public void DoctorName() {
		System.out.println("Jadheesh Reddy");

	}
	public void Profession() {
	 System.out.println("Dentist");	
	}
}
class Doctor2 extends Doctor{
	//overriding 
	@Override
	/*public void Profession() {
		System.out.println("General Surgeon");
	}*/
	
	public void DoctorName() {
		System.out.println("Suresh Kumar");
		}

}
public class OverridingDemo1 {

	public static void main(String[] args) {
		Doctor d = new Doctor();
		d.HospitalName();;
		d.DoctorName();;
		d.Profession();;
		System.out.println("--------------");
		Doctor2 d1 = new Doctor2();
		d1.HospitalName();;
		d1.DoctorName();;
		//d1.Profession();;

		

	}

}