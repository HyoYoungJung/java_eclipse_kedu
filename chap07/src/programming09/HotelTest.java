package programming09;

public class HotelTest {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();

		hotel.add(5, "호돌이");
		hotel.add(7, "길동이");

		hotel.add(1, "가");
		hotel.add(9, "하");
		hotel.add(11, "이");
		hotel.add(6, "나");
		hotel.add(4, "김");
		hotel.add(10, "둘리");
		hotel.add(3, "도우너");
		hotel.add(2, "또치");

		hotel.show();
	}
}
