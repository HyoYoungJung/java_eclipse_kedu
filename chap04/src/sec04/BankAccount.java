package sec04;

public class BankAccount {
	String accNumber; // 계좌 번호
	String ssNumber; // 주민 번호
	int balance; // 예금 잔액

	public BankAccount() { // 생성자 있고 없고 따라 데모1,2 클래스 에러 발생 차이 있음
	}

	public BankAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int checkMyBalance() {
		System.out.println("계좌번호" + accNumber);
		System.out.println("주민번호" + ssNumber);
		System.out.println("잔   액" + balance + '\n');
		return balance;
	}

	public int printMyAccount() {
		System.out.println("계좌번호" + accNumber);
		return balance;
	}

}

//	int balance;
//
//	public int deposit(int amount) {
//		balance += amount;
//		return balance;
//	}
//
//	public int withdraw(int amount) {
//		balance -= amount;
//		return balance;
//	}
//
//	public int checkMyBalance() { // int 아닌 void로 써도 상관X => void로 쓰면 출력문이 사라지고 밸런스값만 리턴. 이경우 대신 데모 클래스에서 출력문을 써줘야됨
//		System.out.println("잔액 : " + balance);
//		return balance;
//	}
//
//}
