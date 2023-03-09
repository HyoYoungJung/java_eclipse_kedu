package sec02;

public class TryCatch1Demo {

	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			System.out.println("마지막 원소 => " + array[3]); // 3에서 1로 바꿔쓰면 출력값이 바뀜(∵오류가 발생하지 X)
			System.out.println("첫번째 원소 => " + array[0]);
		} catch (ArrayIndexOutOfBoundsException e) { // Exception e 도 가능
			System.out.println("원소가 존재하지 않습니다.");
		} finally { // finally 삽입하면 에러 발생 -> finally -> 끝
			System.out.println("finally.");
		}
		System.out.println("어이쿠!!!");
	}
}
