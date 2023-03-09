package programming06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Today02 {
//		<문제>
//		오늘 날짜를 다음 실행 결과처럼 다양한 방식으로 출력하는 프로그램을 작성하라.
//		<출력>
//		2017.06.15 오후 15:35:40
//		오늘은 6월의 15번째 날
//		오늘은 2017년의 166번째 날

	public static void main(String[] args) {
		Date dt = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("오늘은 MM월의 dd번째 날");
		SimpleDateFormat sdf3 = new SimpleDateFormat("오늘은 yyyy년의 DD번째 날");

		System.out.println(sdf1.format(dt));
		System.out.println(sdf2.format(dt));
		System.out.println(sdf3.format(dt));
	}
}
//성진님 코드