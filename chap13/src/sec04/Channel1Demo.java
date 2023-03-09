package sec04;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Channel1Demo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Temp\\org.txt");
		Path path = Paths.get("C:\\Temp\\dup.txt");

		FileChannel org = fis.getChannel();

		FileChannel dup = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
		// 오픈옵션 두개 : 있으면 써라, 없으면 생성하라

		ByteBuffer buf = ByteBuffer.allocate(10);
		while (org.read(buf) != -1) { // 버퍼는 사이즈 다 차면, 클로즈가 되면 넘어간다
			System.out.println(buf.flip()); // buf.flip();
			buf.flip();
			dup.write(buf);
			buf.clear(); // 만약 클리어 안해주면 끝나지 않음
		}
		org.close();
		dup.close();
	}
}