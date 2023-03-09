package sec02;

@FunctionalInterface
interface UseThis {
	void use();
}

public class UseThisDemo {

	public void lambda() {
		String hi = "hi";

		UseThis u1 = new UseThis() {

			@Override
			public void use() {
				System.out.println(this);
//				hi="Inner.."; //파이널이어야해서 오류 발생
			}
		};
		u1.use();

		UseThis u2 = () -> {
			System.out.println(this);
//		hi = "Lambda"; //파이널이어야해서 오류 발생
		};
		u2.use();
	}

	public String toString() {
		return "UseThisDemo";
	}

	public static void main(String[] args) {
		new UseThisDemo().lambda();
	}
}
