package sec04.extend;

public class BoundGenericMethod {

	public static void main(String[] args) {
		Box<Integer> sbox = BoxFactory.makeBox(5959);
		int n = sbox.get();
		System.out.println(n);

		Box<Double> dbox = BoxFactory.makeBox(5959.5959);
		double dn = dbox.get();
		System.out.println(dn);
	}
}