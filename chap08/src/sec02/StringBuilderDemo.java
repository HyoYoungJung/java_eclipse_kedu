package sec02;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String s = new String("hi");
		System.out.println(s.hashCode());
		s = s + "!";
		System.out.println(s.hashCode()); // s에 !을 추가한 s가 새로만들어지고 해시코드값이 다르게 출력됨

		StringBuilder sb0 = new StringBuilder();
		System.out.println("sb0.length()  : " + sb0.length());
		System.out.println("sb0.capacity() : " + sb0.capacity()); // 기본값인 16 버퍼 생성

		StringBuilder sb = new StringBuilder("hi");
		System.out.println("sb.length() : " + sb.length()); //
		System.out.println("sb.capacity() : " + sb.capacity()); // 버퍼 기본값 16 + hi 2글자 => 18

		System.out.println(sb.hashCode()); // hi의 해시코드값
		sb = sb.append("!"); // append 호출 : StringBuilder가 갖고있는 메서드로, hi에 !표 붙여줌
		System.out.println(sb.hashCode()); // 기존 배열 hi에 !를 추가해주는 것이라 hi와 해시코드값이 같게 출력됨

		System.out.println(sb.replace(0, 2, "Good bye").insert(0, "Java, "));
		// 기존 hi!에서 0번지인 h부터 2번 문자인 i 까지를 굿바이로 교체하고(=>Good bye!), 0번지에 Java,를 삽입.

		System.out.println(sb.length()); // 문자의 길이는 15로 늘어남.
		System.out.println(sb.hashCode()); // 문자 내용이 바껴도 hi & hi!와 해시코드는 그대로 똑같음.
		System.out.println(sb.capacity()); // *??* 기존 hi에서 많이 바꼈지만, 앞에서 나온 캐퍼시티 18개가 그대로 출력됨.
	}
}
