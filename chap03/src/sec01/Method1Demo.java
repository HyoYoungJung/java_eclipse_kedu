package sec01;

public class Method1Demo {

	public static void main(String[] args) {
		// 1~10의 합
		int sum = 0;
		for (int i = 0; i <= 10; i++)
			sum += i;
		System.out.println("합(1~10) : " + sum);

		// 10~100의 합
		sum = 0;
		for (int i = 10; i <= 100; i++)
			sum += i;
		System.out.println("합(10~100) : " + sum);

		// 100~1000의 합
		sum = 0;
		for (int i = 100; i <= 1000; i++)
			sum += i;
		System.out.println("합(100~1000) : " + sum);
	}

}
