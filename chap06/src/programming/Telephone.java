package programming;

public class Telephone extends Phone {
	private String when;

	public Telephone(String owner, String when) {
		super(owner);
//		this.when = when;
	}

	public String getWhen() {
		return when;
	}

//	public void setWhen(String when) {
//		this.when = when;
//	}

	void autoAnswering() {
		System.out.println(owner + "가 없다. " + when + " 전화 줄래.");
	}
}

//메서드 오버로딩 처럼 생성자 오버로딩!  