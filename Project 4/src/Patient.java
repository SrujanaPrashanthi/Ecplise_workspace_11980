
public class Patient {
	int patientNo;
	String patientName ;
	String disease;
	String medicines;
	
	
	//static String batch ="2024 ";

	public Patient(int patientNo , String patientName ,String disease, String medicines) {
		System.out.println("constructor");
		this.patientNo = patientNo;// when the constructor argument and instance variable are same the we use this keyword
		this.patientName = patientName;
		this.disease = disease;
		this.medicines = medicines;
		
	}
	
	public void displayPatientDetails() {

		System.out.println("patientNo:"+patientNo);
		System.out.println("patientName:"+patientName);
		System.out.println("disease:"+disease);
		System.out.println("medicines:"+medicines);
		//System.out.println("Batch:" +batch);
		
		

	}
}

	