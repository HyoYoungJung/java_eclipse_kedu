package exam01;

class Printer {
	int numOfPapers = 0;

	public void print(int amount) {

	}

	public int paperIn(int amount) {
		numOfPapers += amount;
		return numOfPapers;
	}

	public int paperOut(int amount) {
		numOfPapers -= amount;
		return numOfPapers;
	}

	public int totalAmount() {
		System.out.println("남은 용지 수 : " + numOfPapers);
		return numOfPapers;
	}

}
