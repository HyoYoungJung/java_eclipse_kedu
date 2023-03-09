package sec08.two;

public class UnivFriend extends Friend {
	private String major;

	public UnivFriend(String name, String major, String phone) {
		super(name, phone); // 부모 생성자 호출
		this.major = major;
	}

	// 오버라이딩
	public void showInfo() {
		super.showInfo(); // 부모의 showInfo 호출
		System.out.println("전공 : " + major);
	}

}
