package programming09;

public class Hotel {
	class Room { // 중첩 클래스
		int num;
		String name;

		Room(int num, String name) {
			this.num = num;
			this.name = name;
		}
	}

	Room[] rooms = new Room[10];
	int cnt = 0;

	// 객실 번호와 이름으로 객실을 예약하는 메서드
	void add(int num, String name) {
		rooms[cnt++] = new Room(num, name); // cnt대신 num-1로 사용하면 객실번호 순서대로 출력됨
		// cnt++로 할 경우 객실번호와 인덱스번호가 일치해 저장되지 않고
		// 들어가는 순서대로 0~9번인덱스에 순차적으로 저장되기 때문에 객실번호대로 정렬되어 출력되지 않음
		// 또한 객실번호를 11로 입력해도 출력이 됨.
	}

	// 현재 예약된 객실 번호와 고객 이름을 보여주는 메서드
	void show() {
		for (Room r : rooms) {
			if (r != null)
				System.out.println(r.num + "번 방을 " + r.name + "가 예약했습니다.");
		}
	}
}