package sec02;

public class BusinessManDemo {

	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("홍길동", "국제 영업1팀", "팀장");
//		BusinessMan man = new BusinessMan(); // 쓸수가 없다. 디폴트는 컴파일러가 생성을 안해줌(?)
		man.tellYourInfo();
	}

}
