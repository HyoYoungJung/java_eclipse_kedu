// 990925-1055123 => 990925 1055123 으로 출력
// 메서드 이용
package sec01;

public class StringExample {

	public static void main(String[] args) {
		// 작성 코드
//		String s1 = "990925";
//		String s2 = "1055123";
//		System.out.println(s1 + " " + s2);

		// 그 외 여러 방법들 (공유 코드들)
		String s6 = "990925-1055123";
		System.out.println(s6.substring(0, 6) + " " + s6.substring(7));

		String a = "990925-1055123";
		System.out.println(String.join(" ", a.substring(0, 6), a.substring(7, 14)));

		System.out.println(s6.replace("-", " "));

	}

}
