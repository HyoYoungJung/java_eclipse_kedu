package sec04;

import java.text.DecimalFormat;

public class FormatDemo {
	public static void main(String[] args) {
		DecimalFormat f1 = new DecimalFormat("#");
		DecimalFormat f2 = new DecimalFormat("000000000.00"); // 0일땐 0으로 표시
		DecimalFormat f3 = new DecimalFormat("#.000"); // 0일땐 공백으로 표시
		DecimalFormat f4 = new DecimalFormat("#,###.##");
		DecimalFormat f5 = new DecimalFormat("-#.#");
		DecimalFormat f6 = new DecimalFormat("#.##E00");
		DecimalFormat f7 = new DecimalFormat("+#.#;-#.#"); // 양수,음수일때에 따른 표시
		DecimalFormat f8 = new DecimalFormat("#.00%");
		DecimalFormat f9 = new DecimalFormat("\u00A4###,###"); // 원화 표시

		System.out.println(f1.format(1234567.890));
		System.out.println(f2.format(1234567.890));
		System.out.println(f3.format(1234567.890));
		System.out.println(f4.format(1234567.890));
		System.out.println(f5.format(1234567.890));
		System.out.println(f6.format(1234567.890));
		System.out.println(f7.format(1234567.890));
		System.out.println(f8.format(1234567.890));
		System.out.println(f9.format(1234567.890));
	}
}
