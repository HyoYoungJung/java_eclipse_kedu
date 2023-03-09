package sec02;

import java.io.IOException;

public class IOStreamDemo {
	public static void main(String[] args) throws IOException {
		int b, len = 0;
		int ba[] = new int[100]; // 100을 잡은거

		System.out.println("=== 입력 스트림 ---");
		while ((b = System.in.read()) != '\n') {
			System.out.printf("%c(%d)", (char) b, b); // (char) b : b를 캐릭터 타입으로 형변환
			ba[len++] = b;
		} // 엔터 값은 13, 띄어쓰기는 13으로 역시 출력됨

		System.out.println("\n\n--- 출력 스트림 ---");
		for (int i : ba)
			System.out.write(i);
//		for (int i = 0; i < len; i++)
//			System.out.write(ba[i]);
		System.out.flush(); // System.out.close(); // flush쓸땐 close 안써도 됨
	}
}