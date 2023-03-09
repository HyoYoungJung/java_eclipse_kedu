package sec03;

import java.util.Optional;

import sec01.Util;

public class Optional2Demo {

	public static void main(String[] args) {
		String s1 = "안녕!";
//		String s1 = null; // s1이 null인 경우 "없음 없음 없음 없음" 출력됨
		Optional<String> o = Optional.ofNullable(s1);

		if (s1 != null)
			Util.print(s1);
		else
			Util.print("없음");

		if (o.isPresent())
			Util.print(o.get());
		else
			Util.print("없음");

		String s2 = o.orElse("없음");
		Util.print(s2);

		o.ifPresentOrElse(Util::print, () -> System.out.println("없음"));

	}
}