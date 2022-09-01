package hospital;

public class Patient {

	private String name;
	private String getSickness;

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

	protected boolean isSick() {
		// TODO Auto-generated method stub
		return true;
	}

	protected String getSickness() {
		// TODO Auto-generated method stub
		return getSickness;
	}

	protected void takeMedication(Medicine medicine) {
		// TODO Auto-generated method stub
		
	}

}
