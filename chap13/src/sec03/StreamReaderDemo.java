package sec03;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class StreamReaderDemo {

	public static void main(String[] args) {
		String input = "C:\\Temp\\org.txt";

		try (FileInputStream fi = new FileInputStream(input);
				InputStreamReader in = new InputStreamReader(fi, "US-ASCII ")) { // UTF-8로 하면 한글도 나옴. MS949로 하면 또 다르게 깨짐.

			int c;

			System.out.println(in.getEncoding());
			while ((c = in.read()) != -1)
				System.out.print((char) c);
		} catch (Exception e) {
		}
	}
}