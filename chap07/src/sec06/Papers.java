package sec06;

public class Papers {
	private String con;

	public Papers(String con) {
		this.con = con;
	}

	public Printable getPrinter() {
		return new Printable() {

			@Override
			public void print() {
				System.out.println(con);
			}

		};
	}
}
