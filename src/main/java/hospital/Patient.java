package hospital;

public class Patient {

	private String name;
	private String getSickness;
	protected boolean isSick;
	
	protected Patient(String name, String getSickness) {
		this.name = name;
		this.getSickness = getSickness;
		if(getSickness != null || getSickness == "healthy") {
			isSick = true;
		} else {
			isSick = false;
		}
	}

	protected Patient(String name) {
		this.name = name;
		isSick = false;
	}

	protected String getName() {
		return name;
	}

	protected String getSickness() {
		return getSickness;
	}

	protected boolean isSick() {
		return isSick;
	}
	
	protected void takeMedication(Medicine medicine) {
		if(medicine.getTreatmentName().equals(getSickness)) {
			getSickness = null;
			isSick = false;
		}
	}
}