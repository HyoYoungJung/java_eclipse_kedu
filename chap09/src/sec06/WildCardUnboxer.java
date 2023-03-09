package sec06;

public class WildCardUnboxer {

	public static void main(String[] args) {
		Box<String> box = new Box<>(); // 스트링 내용물 들어가는 박스 인스턴스 생성
		box.set("So simple String");
		Unboxer.peekBox(box);
//		Unboxer.peekBox3(box); //안되는 이유? 
//		Unboxer.peekBox4(box); //<String>이라 안됨 

		Box<Integer> iBox = new Box<>();
		iBox.set(5959);
		Unboxer.peekBox2(iBox);
		Unboxer.peekBox3(iBox);
		Unboxer.peekBox4(iBox); // <Integer>니까 됨

		Box<Double> dBox = new Box<>();
		dBox.set(123.456);
		Unboxer.peekBox2(dBox);
		Unboxer.peekBox3(dBox);
//		Unboxer.peekBox4(dBox); //dBox는 인티저라 <Double>에 못들어감 

	}
}
