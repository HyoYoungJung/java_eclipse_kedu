package sec04.extend;

import sec03_1.Beverage;

public class Cup<T extends Beverage> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}