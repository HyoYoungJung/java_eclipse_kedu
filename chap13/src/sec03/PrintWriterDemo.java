package sec03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Temp\\org.txt"));
				PrintWriter pr = new PrintWriter(new FileWriter("C:\\Temp\\dup.txt"));) {

			br.lines().forEach(x -> pr.println(x));
		} catch (Exception e) {
		}
	}
}