package sec02;

public class BusinessMan extends Man {
	String company;
	String position;

	public BusinessMan(String name, String company, String position) { // 생성자
//		super(); // 원래 컴파일러가 자동으로 생성해주던 것인데, 부모에 디폴트 생성자 만들기 싫으면. ②수동으로 입력해주면 에러 사라짐.
		this.name = name;
		this.company = company;
		this.position = position;
	}

	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}

}
