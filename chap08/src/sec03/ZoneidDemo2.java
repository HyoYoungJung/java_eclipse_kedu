package sec03;

import java.time.ZoneId;

public class ZoneidDemo2 {

	public static void main(String[] args) {
		// 지금은 코딩만 해보면 됨.필터링해 와서 소팅을 해 출력한 것임.
		ZoneId.getAvailableZoneIds().stream().filter(s -> s.startsWith("Asia")).sorted()
				.forEach(s -> System.out.println(s));
	}

}
