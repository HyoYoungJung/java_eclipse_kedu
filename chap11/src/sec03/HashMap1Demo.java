package sec03;

import java.util.HashMap;
import java.util.Map;

public class HashMap1Demo {

	public static void main(String[] args) {
		// map
		Map<String, Integer> map = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1);

		// 스트링을 키로 갖고있고 인티저를 밸류로 갖고 있는 fruits라는 map 임!
		Map<String, Integer> fruits = new HashMap<>(map);//
		fruits.put("귤", 2);
		System.out.println("현재 " + fruits.size() + "종류의 과일이 있습니다.");
		fruits.remove("바나나");
		System.out.println("바나나를 없앤 후 " + fruits.size() + "종류의 과일이 있습니다.");

		fruits.put("망고", 2);
		System.out.println("망고를 추가한 후 현재 " + fruits + "가 있습니다.");

		fruits.clear();
		System.out.println("모두 없앤 후 " + fruits.size() + "종류의 과일이 있습니다.");
	}
}