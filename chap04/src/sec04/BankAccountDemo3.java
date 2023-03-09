package sec04;

import java.util.Scanner;

public class BankAccountDemo3 {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		int a = 0;
		int b = 0;
		int c = 0;

		Scanner in = new Scanner(System.in);
		System.out.printf("원하는 업무의 번호를 선택해주세요.\n 1.은행업무 2.종료\n");
		do {
			a = in.nextInt();

			if (a == 1) {
				System.out.printf("원하는 업무의 번호를 선택하여 주세요.\n1. 입금  2.출금  3.잔액조회 4.되돌아가기\n");
				b = in.nextInt();
				if (b == 1) {
					System.out.printf("\n입금하실 금액을 입력해주세요 : ");
					c = in.nextInt();
					bank.deposit(c);
					bank.checkMyBalance();
					System.out.printf("원하는 업무의 번호를 선택해주세요.\n 1.은행업무 2.종료\n");
				} else if (b == 2) {
					System.out.printf("\n출금하실 금액을 입력해주세요 : ");
					c = in.nextInt();
					bank.withdraw(c);
					bank.checkMyBalance();
					System.out.printf("원하는 업무의 번호를 선택해주세요.\n 1.은행업무 2.종료\n");
				} else if (b == 3) {
					bank.checkMyBalance();
					System.out.printf("원하는 업무의 번호를 선택해주세요.\n 1.은행업무 2.종료\n");
				} else {
					c = 4;
					System.out.printf("원하는 업무의 번호를 선택해주세요.\n 1.은행업무 2.종료\n");
				}
			} else if (a == 2) {
				c = 4;
			}

		} while (a == 1 || b == 1 || c == 2 || c == 3);
		System.out.println("종료되었습니다. 감사합니다.");
	}

}