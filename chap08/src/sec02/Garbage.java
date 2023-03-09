package sec02;

public class Garbage {
	public int no;

	public Garbage(int no) {
		this.no = no;
		System.out.printf("Garbage(%d) 생성\n", no);
	}

	protected void finalize() {
		System.out.printf("Garbage(%d) 수거\n", no);
	}
}
