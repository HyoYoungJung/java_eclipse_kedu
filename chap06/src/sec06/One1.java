package sec06;

public class One1 extends One {
	void print() {
//		System.out.println(secret); //같은 패키지에 있는 자식객체라도 부모클래스의 private 멤버에 접근할수X
		System.out.println(roommate);
		System.out.println(child);
		System.out.println(anybody);
	}

//	void show() {  //오버라이딩 하면서 접근제어자가 낮아짐(?) 부모는 퍼블릭, 자식은 디폴트면 될수x
//	} 
}
