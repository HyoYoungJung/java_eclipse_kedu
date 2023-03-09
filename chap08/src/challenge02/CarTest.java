package challenge02;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car("그랜저");
		Car yourCar = new Car("그랜저");

		if (myCar.equals(yourCar)) {
			System.out.printf("자동차 모델이 둘 다 %s로 동일하다.\n", myCar);
		} else {
			System.out.printf("내 자동차는 %s, 너 자동차는 %s로 모델이 다르다.\n", myCar, yourCar);
		}

		// SimpleDateFormat
//		Date date = new Date(); // 자바 유틸에서 오늘 날짜를 가져옴
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy"); // 날짜 포맷 설정

		// MessageFormat
		String s = MessageFormat.format("날짜: {0}, 자동차 모델={1}, 운전자({2})", f.format(new Date()), myCar, "홍길동");
		System.out.println(s);
	}
}
