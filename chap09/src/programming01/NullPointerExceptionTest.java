package programming01;

public class NullPointerExceptionTest {
	public static void main(String[] args) {

		try {
			MyDate d = null;
			System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		} catch (NullPointerException e) {
			MyDate d = new MyDate();
			System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		}
	}
}