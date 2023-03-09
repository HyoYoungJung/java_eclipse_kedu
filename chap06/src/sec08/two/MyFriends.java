package sec08.two;

public class MyFriends {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10]; // 상속관계를 통해 하나의 배열로 모을 수 있음

		int cnt = 0;

		frns[cnt++] = new UnivFriend("Kim", "컴퓨터", "010-1234-1234"); // cnt 0
		frns[cnt++] = new UnivFriend("Lee", "기계공학", "010-5678-5978"); // cnt 1
		frns[cnt++] = new UnivFriend("Park", "건축", "010-9988-7766"); // cnt 2 = 배열의 2번

		frns[cnt++] = new CompFriend("Choi", "기초기술", "010-3456-3333");
		frns[cnt++] = new CompFriend("Jung", "인사총무", "010-8888-8765");
		frns[cnt++] = new CompFriend("Cha", "R&D", "010-5654-3210");
		frns[cnt++] = new CompFriend("You", "마케팅", "010-3333-4444");

		int sw = 0; // switch
		for (int i = 0; i < cnt; i++) {
			// 부모타입으로 왔는데 각각의 메서드로 구분해줘야할 때? instanceof로 한 배열에 들어온 대학친구와 직장동료를 구분해 줌.
			if (frns[i] instanceof UnivFriend && sw == 0) { // sw == 0 여부에 따라 ==대학동창== 출력 횟수 달라짐
				System.out.println("====== 대학 동창 ======");
				sw = 1;
			}
			if (frns[i] instanceof CompFriend && sw == 1) {
				System.out.println("======  직장 동창 ======");
				sw += 1;
			}

			frns[i].showInfo();
			System.out.println();
		}
	}
}
//**즁요** 여러운 내용이니 반복해서 보기!