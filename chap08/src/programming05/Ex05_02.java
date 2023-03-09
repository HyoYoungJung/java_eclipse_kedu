package programming05;

public class Ex05_02 {
	// 최고조상 class인 오브젝트로 받아서 넣음으로 같은 오브젝트를 상속받는
	// String, StringBuilder, StringBuffer는 가능
	public static void show(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {

		show(new String("멘붕"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));
//	      show(new Date());
		// import가 안되어있음
	}
}
