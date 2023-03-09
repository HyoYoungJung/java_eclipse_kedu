package programming;

public class GolfClubTest {

	public static void main(String[] args) {
		// 미입력시 기본값 7로 출력
		GolfClub g1 = new GolfClub();
		g1.print();
		// 숫자 입력시 숫자+번아이언입니다 출력
		GolfClub g2 = new GolfClub(8);
		g2.print();
		// 문자 입력시 문자+입니다 출력
		GolfClub g3 = new GolfClub("퍼터");
		g3.print();
	}
}