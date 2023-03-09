package sec02;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println(str1 == str2); // 주소값이 다름

		System.out.println(str1.hashCode()); // 내용이 같으면 해시코드도 같음,,(?)
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1)); // str1과 2가 다르게 갖고있음
		System.out.println(System.identityHashCode(str2));

		String str3 = "hello";
		String str4 = "hello";

		System.out.println(str3 == str4); // 주소값이 같음(?)

		String str5 = new String("world");

		System.out.println(System.identityHashCode(str1));
		str1 = str1.concat(str5);
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1)); // str 1에 str5를 붙이기만 했는데 str1이 새로운 주소값(해시코드) 갖게됨
	}

}
