package sec05;

public class Ticket implements Comparable {
	int no;

	public Ticket(int no) {
		this.no = no;
	}

	public int compareTo(Object o) {
		Ticket t = (Ticket) o; // 오브젝트 타입의 변수 o를 티켓 타입으로 형변환 ?
		return no < t.no ? -1 : (no > t.no ? 1 : 0);
	}
}
