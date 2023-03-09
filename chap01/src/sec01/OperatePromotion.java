package sec01;

public class OperatePromotion {

	public static void main(String[] args) {
		short num1 = 11;
		short num2 = 22;
		short result = (short) (num1 + num2);
		int result2 = (num1 + num2);
		System.out.println(result);
		System.out.println(result2);

		int fifteen = 15;
		System.out.println("int형 변수 fifteen에 10진수 15를 할당 : " + fifteen);

		byte fifteenByte = 0b1111;
		System.out.println("byte형 변수 fifteenByte에 2진수 0b1111를 할당 : " + fifteenByte);

		short fifteenShort = 017;
		System.out.println("short형 변수 fifteenShort에 8진수 017을 할당 : " + fifteenShort);

		int fifteenInt = 0xF;
		System.out.println("int형 변수 fifteenInt에 16진수 0xF를 할당 : " + fifteenInt);

		long lightSpeed = 300000L;
		System.out.println("long lightSpeed = 300000L : " + lightSpeed);

	}

}
