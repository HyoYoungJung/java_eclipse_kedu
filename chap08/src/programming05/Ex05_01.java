package programming05;

public abstract class Ex05_01 implements CharSequence {
	// 코드 추가

//	String input; //없어도 돌아감 
//
//	public Ex05(String input) { //없어도 돌아감 
//		this.input = input;
//	}

	public static void show(CharSequence input) {
		System.out.println(input);
	}

	// 코드 끝

	public static void main(String[] args) {
		show(new String("멘붕"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));
//		show(new Date()); //오류 발생
	}

}