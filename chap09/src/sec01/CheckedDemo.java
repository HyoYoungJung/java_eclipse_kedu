package sec01;

public class CheckedDemo {

	public static void main(String[] args) {
//		Thread.sleep(100);
		try {
			Thread.sleep(100); // 예외를 발생시키는 코드 삽입 구간
		} catch (InterruptedException e) { // catch => 만약 예외가 발생하면,
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
