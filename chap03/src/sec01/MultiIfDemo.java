package sec01;

public class MultiIfDemo {

	public static void main(String[] args) {

		int x = 5;
		if (x > 0)
			System.out.print(x - 1);
		if (x > 1)
			System.out.print(x - 2);
		if (x < 0)
			System.out.print(x - 3);
		// print는 붙어서 값 출력되기 때문에 결과값이 43

//		Scanner in = new Scanner(System.in);
//		String grade;
//		System.out.print("점수를 입력하세요 : ");
//		int score = in.nextInt();
//
//		if (score >= 90)
//			grade = "A";
//		else if (score >= 80)
//			grade = "B";
//		else if (score >= 70)
//			grade = "C";
//		else if (score >= 60)
//			grade = "D";
//		else
//			grade = "F";
//		System.out.println("당신의 학점은" + grade);

	}

}
