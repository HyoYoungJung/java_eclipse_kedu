package sec01;

public class String3Demo {

	public static void main(String[] args) {
		String s1 = new String("Hi,");
		String s2 = new String(" Java");

		System.out.println("문자열 길이(s1) : " + s1.length());
		System.out.println(s1.charAt(1)); // Hi,는 0,1,2 순서임.

		s1 = s1.concat(s2);

		System.out.println(s1.concat(s2) + "!");
		System.out.println(s1.toLowerCase() + "!");
		System.out.println(s1.substring(4, 8) + "!"); // 4번째 부터 8-1(=7)번지 까지 반환

		String s3 = " ";
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());
		String s4 = "";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());

		String s5 = "*-*";
		System.out.println(s5.repeat(10));

		System.out.println(s2.trim().indexOf("v"));
	}

}
