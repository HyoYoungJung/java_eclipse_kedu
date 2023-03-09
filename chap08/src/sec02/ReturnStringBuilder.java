package sec02;

public class ReturnStringBuilder {

	public static void main(String[] args) {
		StringBuilder stb1 = new StringBuilder("123");
		StringBuilder stb2 = stb1.append(45678);

		System.out.println(stb1);
		System.out.println(stb2);

		stb2.delete(0, 5);

		System.out.println(stb1);
		System.out.println(stb2);

		if (stb1 == stb2)
			System.out.println("같은 인스턴스 참조");
		else
			System.out.println("다른 인스턴스 참조");
	} // stb1과2는 똑같이 바뀌고 움직인다~~~

}
