package sec04;

public class Report implements Printable, Lower { // Lower,Upper에 따라 테스트 실행 시 출력값 달라짐

	String cons;

	Report(String cons) { // 매개변수가 있는 생성자
		this.cons = cons;
	}

	@Override
	public String getContents() {
		return cons; // 받아온 String 타입의 cons 값을 리턴하는
	}

}
