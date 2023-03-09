package sec08.two;

public class CompFriend extends Friend {
	private String department;

	public CompFriend(String name, String department, String phone) {
		super(name, phone); // 부모 생성자 호출
		this.department = department;
	}

	// 오버라이딩
	public void showInfo() {
		super.showInfo(); // 부모의 showInfo 호출
		System.out.println("부서 : " + department);
	}
}
