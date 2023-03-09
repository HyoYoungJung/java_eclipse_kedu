package sec08;

public class Wrapping {

	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);

		// 앞의 클래스들에서 오버라이딩 한 것 이용해서 아래처럼 훨씬 더 간단히 표현가능.
		box1.wrap();
		box2.wrap();
		box3.wrap();
	}

	private static void wrapBox(Box box) { // 업캐스팅
		// if문으로 각각 인스턴스 확인 후 다시 다운캐스팅
//		if (box instanceof GoldPaperBox) {
//			((GoldPaperBox) box).goldWrap(); // 형변환
//		} else if (box instanceof PaperBox) {
//			((PaperBox) box).paperWrap();
//		} else {
//			box.simpleWrap();
//		}

//		if (box instanceof GoldPaperBox) {
//			((GoldPaperBox) box).wrap();
//		} else if (box instanceof PaperBox) {
//			((PaperBox) box).wrap();
//		} else {
//			box.wrap();
//		}
		box.wrap();
	}
}