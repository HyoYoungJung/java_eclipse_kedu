package sec04.extend;

import sec03_1.Beer;
import sec03_1.Boricha;
import sec03_1.Cup;

public class BoundedTypeDemo {

	public static void main(String[] args) {
		Cup<Beer> c1 = new Cup<>();
		Cup<Boricha> c2 = new Cup<>();
//		Cup<String> c3=new Cup<>();
	}
}
