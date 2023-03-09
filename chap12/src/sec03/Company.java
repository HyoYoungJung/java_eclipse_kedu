package sec03;

public class Company {
	private String cName;
	ContInfo cInfo;

	public Company(String cName, ContInfo cInfo) {
		this.cName = cName;
		this.cInfo = cInfo;
	}

	public String getcName() {
		return cName;
	}

	public ContInfo getcInfo() {
		return cInfo;
	}

}
