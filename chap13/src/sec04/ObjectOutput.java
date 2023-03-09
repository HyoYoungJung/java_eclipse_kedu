package sec04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutput {

	public static void main(String[] args) {

		SBox box1 = new SBox("ROBOT", "1234");
		SBox box2 = new SBox("APPLE", "5678");

		try (ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("Object.bin"))) { // 트라이 리소스 구문 : 중괄호x,
																									// 자동으로 클로즈 해줌
			oo.writeObject(box1);
			oo.writeObject(box2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}