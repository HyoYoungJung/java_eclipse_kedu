package sec04;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Stream2Demo {

	public static void main(String[] args) throws Exception {
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "sever", "eight", "nine" };
		// 배열 인덱스와 문자가 매칭돼서 해당 숫자->문자로 나오는 것임

		Path p = new File("C:\\Temp\\number.txt").toPath();

		Stream<String> s = Files.lines(p); // 없을수도 있으니까 익셉션 해줘야 해서 메인에 throws Exception 추가

		s.forEach(x -> System.out.println(x)); // forEach로 소모했으니까

		s = Files.lines(p); // 다시 만든 것

		s.map(x -> number[Integer.parseInt(x)]).forEach(x -> System.out.print(x + " "));

	}
}