package sec02;

public class TryCatch4Demo {

	public static void main(String[] args) {
		Reso reso = new Reso();

		try {
			reso.show();
		} catch (Exception e) {
			System.out.println("예외 처리");
		} finally {
			try {
				reso.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
// 위 코드가 지저분해서 아래처럼 발전.
//		try {
//			reso.show();
//		} catch (Exception e) {
//			System.out.println("예외 처리");
//		}
//	}

class Reso implements AutoCloseable {
	void show() {
		System.out.println("자원 사용");
	}

	public void close() throws Exception { // close 메소드 구현
		System.out.println("자원 닫기");
	}
}
