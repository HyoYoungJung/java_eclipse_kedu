package sec08;

public class MyFriends {

	public static void main(String[] args) {
		// 객체생성
		UnivFriend[] ufrns = new UnivFriend[5];
		CompFriend[] cfrns = new CompFriend[5];

		int ucnt = 0;
		int ccnt = 0;

		ufrns[ucnt++] = new UnivFriend("Kim", "컴퓨터", "010-1234-1234");
		ufrns[ucnt++] = new UnivFriend("Lee", "기계공학", "010-5678-5978");
		ufrns[ucnt++] = new UnivFriend("Park", "건축", "010-9988-7766");

		cfrns[ccnt++] = new CompFriend("Choi", "기초기술", "010-3456-3333");
		cfrns[ccnt++] = new CompFriend("Jung", "인사총무", "010-8888-8765");
		cfrns[ccnt++] = new CompFriend("Cha", "R&D", "010-5654-3210");

		System.out.println("====== 대학 동창 ======");
		for (int i = 0; i < ucnt; i++) {
			ufrns[i].showInfo();
			System.out.println();
		}
		System.out.println("====== 직장 동료 ======");
		for (int i = 0; i < ucnt; i++) {
			cfrns[i].showInfo();
			System.out.println();
		}
	}

}
