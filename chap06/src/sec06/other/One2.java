package sec06.other;

import sec06.One;

public class One2 extends One {
	void print() {
//		System.out.println(secret); //자식클래스라도 부모와 다른 패키지에 있으면 private에 접근X
//		System.out.println(roommate); //자식클래스라도 부모와 다른 패키지에 있으면 default 멤버에 접근X
		System.out.println(child);
		System.out.println(anybody);
	}

}
