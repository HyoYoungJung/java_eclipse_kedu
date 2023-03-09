package sec03;

public class PrinterDriver {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";

		// 삼성프린터로 출력
		Printable prn = new SPrinterDriver(); // SPD를 new 해서 그 주소값을 인터페이스 Printable 타입의 prn에게 전달
		prn.print(myDoc);
		System.out.println();

		// 엘지프린터로 출력
		prn = new LPrinterDriver(); // Printable 타입의 prn을 재활용한것으로 앞에 타입 굳이 안붙여줘도 됨
		prn.print(myDoc);
		System.out.println();
	}

}
