package sec03_1;

public class DBoxDemo {

	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<>();
		box.set("Apple", 30); // 30은 오토박싱 되었음
		System.out.println(box); // 투스트링에서 오토언박싱 된것임
	}
}