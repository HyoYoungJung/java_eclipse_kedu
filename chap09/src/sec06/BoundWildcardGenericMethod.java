package sec06;

public class BoundWildcardGenericMethod {

	public static void main(String[] args) {
		Box<Toy> tBox = new Box<>();
		BoxHandler.inBox3(tBox, new Toy());
		BoxHandler.outBox3(tBox);

		Box<Robot> rBox = new Box<>();
		BoxHandler.inBox3(rBox, new Robot());
		BoxHandler.outBox3(rBox);

	}

}
