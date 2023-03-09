package sec01;

public class String2Demo {

	public static void main(String[] args) {
		String s1 = "Hi, Java!";
		String s2 = new String("Hi, Java!");
		String s3 = "Hi, Code!";
		String s4 = "Hi, java!";

		System.out.println(s1.equals(s2));
//		System.out.println(s1 == s2); // = 은 내용을 비교 == 은 주소값을 비교하는 차이점.
//		System.out.println(s1 == s4);

		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));

		System.out.println(s1.compareTo(s3)); // J(74)-C(67) = 7
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s3.compareTo(s4)); // C(67)-j(106)= -39
		System.out.println("Hi, Java!".compareToIgnoreCase("hi, java!"));

	}

}
