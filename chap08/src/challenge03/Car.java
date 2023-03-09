package challenge03;

public class Car {
	private String model;

	public Car(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "[" + model + "]";
	}

	public boolean equals(Object o) {
		if (o instanceof Car)
			return model.equals(((Car) o).model);
		else
			return false;
	}
}
