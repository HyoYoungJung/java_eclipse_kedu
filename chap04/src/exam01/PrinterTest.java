package exam01;

public class PrinterTest {
	public static void main(String[] args) {
		// Printer 클래스를 테스트하는 코드

		Printer myPrinter = new Printer();

		myPrinter.paperIn(100);
		myPrinter.paperOut(70);
		myPrinter.totalAmount();

	}
}
