package programming07;

import java.text.MessageFormat;

public class MessageFormatTest_02 {

	public static void main(String[] args) {
		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징키스칸", 3, "몽고" } };
		dataLoop(data);
	}

	public static void dataLoop(Object[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int y = 0; y < data[i].length; y++) {
				if (y == 0) {
					String str = MessageFormat.format("이름 : {0}\t", data[i][y]);
					System.out.printf(str);
				} else if (y == 1) {
					String str = MessageFormat.format("번호 : {0}\t", data[i][y]);
					System.out.printf(str);
				} else {
					String str = MessageFormat.format("국적 : {0}\t", data[i][y]);
					System.out.printf(str);
				}
			}
			System.out.println();
		}
	}

}