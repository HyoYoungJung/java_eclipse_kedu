package sec03;

public class LocalVariableDemo {
	// 오류 발생 이유
	public static void main(String[] args) {
		int a = 0;
		double b;

//		System.out.println(b); //초기화 하지 않고는 사용할수X
//		System.out.println(a + c); //변수 c가 아직 선언되지 않아서 사용할수X

		int c = 0;

//		public double d = 0.0; //메인메서드 안에있는 지역변수는 public으로 지정할수X 

		for (int e = 0; e < 10; e++) {
			// int a = 1; //이미 선언된 지역 변수 이름은 다시 선언할 수 없다.
			System.out.print(e);
		}
	}

}
