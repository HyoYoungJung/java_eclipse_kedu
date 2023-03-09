package sec02;

public class WrapperDemo {

	public static void main(String[] args) {
		Integer bi1 = new Integer(123);

		int i1 = bi1.intValue();
		double d = bi1.doubleValue();

		Integer bi2 = 20;
		int i2 = bi2 + 30;

		String s1 = Double.toString(3.14);

		Float pi = Float.parseFloat(s1); // 플롯이 들고있는 스트링을 Float으로 바꿔줘~
		System.out.println(pi);

		Integer bi3 = Integer.valueOf("11", 16); // 16진수 11인데 인티저타입 십진수로 넣어줘~

		System.out.println(bi3);

	}

}
