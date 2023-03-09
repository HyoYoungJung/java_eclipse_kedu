package sec01;

public class Switch2Demo {

	public static void main(String[] args) {
		whoIsIt("호랑이"); // whoIsIt 메소드 생성의 의미는 메소드 호출.
		whoIsIt("참새");
		whoIsIt("고등어");
		whoIsIt("곰팡이");
	}

	static void whoIsIt(String bio) {
		String kind = "";
		switch (bio) {
		case "호랑이":
		case "사자":
			kind = "포유류"; // 사자는 포유류가 아닌, 호랑이는 포유류로 출력되는 이유는??
			break; // break 빼면 호랑이는 조류로 나타남.
		case "독수리":
		case "참새":
			kind = "조류";
			break;
		case "고등어":
		case "연어":
			kind = "어류";
			break;
		default:
			System.out.print("어이쿠!");
			kind = "...";
		}
		System.out.printf("%s는 %s이다.\n", bio, kind);
	}
}
