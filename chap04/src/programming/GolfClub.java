package programming;

public class GolfClub {
	// 다른 class에서 접근 못하게 private 설정
	private int i = 0;
	private String a = "";

	// 아무것도 미 입력시 i 기본값 7로 설정
	public GolfClub() {
//		this.i = i; // 무조건 넣을 필요X. 빼주는게 맞음
//		this.a = a; // 무조건 넣을 필요X. 빼주는게 맞음
		i = 7;
	}

	// 숫자로 입력시 i값 변경
	public GolfClub(int in) {
		this.i = in;
	}

	// 문자로 입력시 a값 변경
	public GolfClub(String name) {
		a = name;
	}

	// 출력시 숫자의경우 i+번 아이언 문자일경우 a+입니다 출력
	public void print() {

		if (i >= 1) {
			System.out.printf("%d번 아이언입니다.\n", i);
		} else {
			System.out.printf("%s입니다.\n", a);

		}
	}

}