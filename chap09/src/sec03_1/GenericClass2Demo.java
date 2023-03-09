package sec03_1;

public class GenericClass2Demo {

	public static void main(String[] args) {
		Cup<Beer> c = new Cup<Beer>();
		c.setBeverage(new Beer());
//		c.setBeverage(new Boricha());  //Beer 타입의 변수 c와 보리차 연결할수 X 오류 발생
		Beer b1 = c.getBeverage();
		b1 = c.getBeverage();

		Cup<Boricha> b = new Cup<>();
		b.setBeverage(new Boricha());
		Boricha b2 = b.getBeverage();

	}
}