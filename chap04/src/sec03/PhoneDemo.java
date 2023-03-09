package sec03;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone myPhone = new Phone(); // 인스턴스1
		myPhone.model = "갤럭시 폴더4";
		myPhone.value = 140;
		myPhone.print();
		System.out.println(myPhone);

		Phone yourPhone = new Phone(); // 인스턴스2
		yourPhone.model = "갤럭시 S22";
		yourPhone.value = 100;
		yourPhone.print();
		System.out.println(yourPhone);

		myPhone = yourPhone; // 마이폰과 유어폰은 참조변수임(heap 영역의 주소값을 갖고있음)
		System.out.println(myPhone);
		myPhone.print();
	}

}
