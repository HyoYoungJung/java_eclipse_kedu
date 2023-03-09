package sec04;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream1Demo {

	public static void main(String[] args) {
		File file = new File("C:\\Windows"); // Windows 쫙 가져옴
		File[] fs = file.listFiles(); // File 타입의 배열로 반환

		Stream<File> stream = Arrays.stream(fs);
		long count = stream.filter(x -> x.isDirectory() == false).count(); // x.isDirectory() == false : 파일만 갯수 셀거임

		System.out.println("C:\\Windows에 있는 파일 개수 : " + count);

		Stream<File> stream1 = Arrays.stream(fs);
		long count1 = stream1.filter(x -> x.isDirectory() == true).count(); // stream은 재사용X. 이미 위에서 활용이 끝났기땜시 재생성 해주어야 함

		System.out.println("C:\\Windows에 있는 디렉토리 개수 : " + count1);

	}
}