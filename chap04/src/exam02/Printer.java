package exam02;

class Printer {
	private int numOfPapers = 0;// 02-① 번 numOfPapers 필드를 private로 지정

	public Printer(int amount) { // 02-① 번 초기화하는 생성자 추가
		numOfPapers = amount;
	}

	public void print(int amount) { //
		if (numOfPapers == 0) {
			System.out.println("용지가 없습니다"); // 남은 용지(numOfPapers)가 0일 때
		} else if (numOfPapers < amount) { // 남은용지(numOfPapers) < 출력할 용지(amount)일 때
			System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", (amount - numOfPapers), numOfPapers);
			numOfPapers = 0;
		} else if (numOfPapers > amount) { // 남은 용지(numOfPapers) > 출력할 용지(amount)일 때
			System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, (numOfPapers -= amount));
		}
	}

}

// 또다른 방식
//	public void print(int amount) {
//		if (numOfPapers >= 1) {
//			if (numOfPapers > amount) { // 남은 용지(numOfPapers) > 출력할 용지(amount)일 때
//				System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, (numOfPapers -= amount)); 
//				// (numOfPapers -= amount) 는 (numOfPapers - amount) 값 출력 후 아래 주석을 추가로 안쓰고 한번에 출력 및 numOfPapers 값이 바뀌도록 하기 위한 식!
//				// numOfPapers -= amount;
//			} else if (numOfPapers < amount) { // 남은용지(numOfPapers) < 출력할 용지(amount)일 때
//				System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", (amount - numOfPapers), numOfPapers);
//				numOfPapers = 0;
//			}
//		} else {
//			System.out.println("용지가 없습니다"); // 남은 용지(numOfPapers)가 0일 때
//		}
//	}
//}
