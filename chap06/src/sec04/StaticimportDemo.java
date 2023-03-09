package sec04;

import static java.util.Arrays.sort;

import java.util.Calendar;

public class StaticimportDemo {

	public static void main(String[] args) {
		int[] data = { 3, 5, 1, 7 }; // 배열

		sort(data);
		System.out.println(Calendar.JANUARY);
		Calendar.getInstance();
	}

}
