package sec02;

import java.util.Scanner;

public class MyExceptionClass {

	public static void main(String[] args) {
		System.out.print("나이 입력 : ");
		int age;
		try {
			age = readAge();
			System.out.println("입력된 나이는 : " + age);
		} catch (ReadAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static int readAge() throws ReadAgeException { // throws는(s 붙은것) 던지겠다는 것
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age < 0 || age > 150)
			throw new ReadAgeException(); // throw는(s안붙음) 에러를 발생시키는 것
		return age;
	}

}
