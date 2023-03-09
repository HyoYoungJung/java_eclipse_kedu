package sec04;

import java.util.Scanner;

public class BankAccountDemo2 {

	public static void main(String[] args) {
		Scanner mony = new Scanner(System.in);
		BankAccount myWon = new BankAccount();
//      myWon.balance = mony.nextInt();
		myWon.balance = 0;
		String mm = "";
		System.out.println("원하시는업무를 선택해주세요\n(은행업무,은행,업무)");
		do {
			mm = mony.nextLine();
			if (mm.equals("은행업무") || mm.equals("은행") || mm.equals("업무")) {
				System.out.println("입금,출금,잔액조회");
				mm = mony.nextLine();

				if (mm.equals("입금") || mm.equals("출금") || mm.equals("잔액") || mm.equals("잔액조회")) {
					if (mm.equals("입금")) {
						System.out.println("입금 금액: ");
						myWon.deposit(mony.nextInt());
						System.out.println(myWon.checkMyBalance());
					} else

					if (mm.equals("출금")) {
						System.out.println("출금 금액: ");
						myWon.withdraw(mony.nextInt());
						System.out.println("잔액 : " + myWon.checkMyBalance());
					} else

					if (mm.equals("잔액조회") || mm.equals("잔액")) {
						System.out.println(myWon.checkMyBalance());
					}
				} else {
					System.out.println("원하시는업무를 선택해주세요");
				}
			} else {
				System.out.println("원하시는업무를 선택해주세요");
			}
		} while (!mm.equals("종료"));
		System.out.println("종료");
	}

}