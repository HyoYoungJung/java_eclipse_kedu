package sec03;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Temp\\org.txt"));) {

			br.lines().forEach(s -> System.out.println(s));
		} catch (Exception e) {
		}
	}
}
