package sec02;

public class ReadAgeException extends Exception { // 리드하려면 익셉션을 상속 받아야 함(?)
	public ReadAgeException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}
