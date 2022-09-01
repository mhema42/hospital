package hospital;

public class Patient {

	private String name;
	private String getSickness;
	protected boolean isSick = true;
	
	protected Patient(String name, String getSickness) {
		this.name = name;
		this.getSickness = getSickness;
	}

	protected Patient(String name) {
		this.name = name;
	}

	protected String getName() {
		return name;
	}

	protected String getSickness() {
		return getSickness;
	}

	protected boolean isSick() {
		if(getSickness == null ) {
			isSick = false;
		}
		return isSick;
	}
	
	protected void takeMedication(Medicine medicine) {
		if(medicine.getTreatmentName().equals(getSickness)) {
			isSick = false;
		}
	}	
}