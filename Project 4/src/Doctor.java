
public class Doctor {
	int doctorId ;
	String doctorName ;
	String specialist ;
	
	
	static String batch ="2024 ";

	public Doctor(int doctorId  , String doctorName ,String specialist) {
		System.out.println("constructor");
		this.doctorId = doctorId;// when the constructor argument and instance variable are same the we use this keyword
		this.doctorName = doctorName;
		this.specialist = specialist;
		
	}
	
	public void displayDoctorDetails() {

		System.out.println("ID:"+doctorId);
		System.out.println("Name:"+doctorName);
		System.out.println("specialist:"+specialist);
		System.out.println("Batch:" +batch);
		
		

	}
	

}
