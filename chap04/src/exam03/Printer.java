package exam03;

public class Printer {

	private int numOfPapers;
	private boolean duplex;

	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}

	public void print(int amount) {
		if (duplex == true && amount % 2 != 0) { // if(getDuplex) 도 가능
			int duplexPrint = (amount / 2) + 1; // amount = (amount%2 ==0)? amount/2:amount/2+1 도 가능
			System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", duplexPrint, (numOfPapers -= duplexPrint));
		} else if (duplex == false) {
			System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.", (amount - numOfPapers), numOfPapers);
		}
	}

	public boolean getDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;

	}
}
