package sec06;

public class UseAnonymousInner {

	public static void main(String[] args) {
		Papers p = new Papers("서류 내용 : 행복합니다.");
		Printable prn = p.getPrinter();

		prn.print();
	}

}
