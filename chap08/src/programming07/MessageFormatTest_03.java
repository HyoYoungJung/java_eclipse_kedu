package programming07;

import java.text.MessageFormat;

public class MessageFormatTest_03 {

	public static void main(String[] args) {
		// 오브젝트 타입으로 date 2차원 배열 넣음
		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } };

		MessageFormat message = new MessageFormat("이름 : {0}\t번호 : {1}\t국적 : {2}");
		for (int i = 0; i < data.length; i++) {
			System.out.println(message.format(data[i])); // i행 전체를 포맷에다 매개변수로 주는 방식

		}
	}
}
