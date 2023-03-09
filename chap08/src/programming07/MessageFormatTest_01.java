package programming07;

import java.text.MessageFormat;

public class MessageFormatTest_01 {
	public static void main(String[] args) {
		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } }; // 원소가 int랑 String 두종류임!

		// 메시지포맷 클래스 이용 코드
		for (int i = 0; i < data.length; i++) {
			System.out.println(
					MessageFormat.format("이름 : {0}\t 번호 : {1}\t\t 국적 : {2}", data[i][0], data[i][1], data[i][2]));
			// 똑같이 \t 하나만 사용하면 왜 간격이 다르게 나오는지??
		}
	}
}