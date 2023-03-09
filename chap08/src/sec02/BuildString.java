package sec02;

public class BuildString {

	public static void main(String[] args) {
		StringBuilder stbuf = new StringBuilder("123");
		System.out.println(stbuf.length()); // 문자 길이는 1,2,3 3개
		System.out.println(stbuf.capacity()); // 문자 캐퍼는 기본 16버퍼 + 3글자 => 19

		stbuf.append(45678);
		System.out.println(stbuf);
		System.out.println(stbuf.toString()); // 위의 출력문과 똑같이 나옴

		stbuf.delete(0, 2);
		System.out.println(stbuf); // 앞에 0번지 부터 2개 문자를 잘라냄(1,2 제거)

		stbuf.replace(0, 2, "AB"); // 앞에 2개 문자를 AB로 바꿈
		System.out.println(stbuf); // 345678에서 34가 AB로 바뀜

		stbuf.reverse();
		System.out.println(stbuf); // 순서가 역순으로 바뀜

		String sub = stbuf.substring(2, 4); // 인덱스 2번인 숫자 6부터 잘라냄 (4번째 문자인 5까지)
		System.out.println(sub);
		System.out.println(stbuf); // stbuf는 여전히 그대로임
	}

}
