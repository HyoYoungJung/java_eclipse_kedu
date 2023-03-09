package sec03;

class Fruit {
	public String name;

	public Fruit(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Fruit)
			return ((Fruit) o).name.equals(name);

		return false;
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "Fruit[" + name + "]";
	}
}