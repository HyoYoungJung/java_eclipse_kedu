package exam03;

public class PrinterDemo {

	public static void main(String[] args) {
		Printer p = new Printer(20, true); // Printer는 클래스, p는 객체인스턴스
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}

}
