package sec02;

public class TryCatch2Demo {

	public static void main(String[] args) {
		int dividend = 10;
		try { // args => 실행 시 run config - program argument에 0,a등 넣은후 실행하면 출력문 달라짐
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor); // 피연산자/연산자
//		} catch (Exception e) { 
//			e.printStackTrace(); // 이부분 주석제거 시 아래 캐치문에 들릴일이 없어지므로 전부 에러가 발생! 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다.");
			System.out.println(e.getMessage()); // 이 구문 넣어주면 에러발생 이유 알리는 메시지가 출력됨
		} catch (NumberFormatException e) { // 메인메서드의 인수를 숫자로 바꿀수 없을때 발생
			System.out.println("숫자가 아닙니다.");
			System.out.println(e.getMessage()); // 이 구문 넣어주면 에러발생 이유 알리는 메시지가 출력됨
		} catch (ArithmeticException e) { // 메인메서드의 인수가 0일때 나눌수 없으므로 발생
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage()); // 이 구문 넣어주면 에러발생 이유 알리는 메시지가 출력됨
		} finally { // 예외발생과 관계없이 항상 실행
			System.out.println("항상 실행됩니다.");
		}
		System.out.println("종료.");
	}
}
