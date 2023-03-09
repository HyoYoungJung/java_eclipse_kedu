package programming04;

public class American implements Talkable {
	// 주석 부분 없어도 출력됨
//	String alang;
//
//	public American() {
//		this.alang = alang;
//	}

	@Override
	public void talk() {
		System.out.println("Hello!");
	}

}
