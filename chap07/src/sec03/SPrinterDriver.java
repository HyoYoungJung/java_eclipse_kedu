package sec03;

public class SPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From Samsung Printer");
		System.out.println(doc);
	}

}
