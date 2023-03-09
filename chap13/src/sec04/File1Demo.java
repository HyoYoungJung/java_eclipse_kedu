package sec04;

import java.io.File;
import java.nio.file.Files;

public class File1Demo {
	public static void main(String[] args) throws Exception {
		File f1 = new File("C:\\Temp\\org.txt"); // 이상태로는 텍스트일 뿐, 파일 인스턴스에서 toPath()를 호출해야 비로소 디렉토리 경로로 인식됨.
		File f2 = new File("C:\\Temp");

		System.out.println("org.txt는 폴더? " + Files.isDirectory(f1.toPath())); // isDirectory -> Static이다
		System.out.println(f1.toPath()); // org.txt가 주인공이므로 폴더 아니라고 하는 것임,,(?)

		System.out.println("Temp는 폴더? " + Files.isDirectory(f2.toPath()));
		System.out.println("org.txt는 읽을 수 있는 파일? " + Files.isReadable(f1.toPath()));
		System.out.println("org.txt의 크기? " + Files.size(f1.toPath()));
	}
}