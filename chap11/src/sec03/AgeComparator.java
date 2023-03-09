package sec03;

import java.util.Comparator;

//기준을 바꿔주고 싶을땐 comparable
public class AgeComparator implements Comparator<Integer> { // 날짜를 거꾸로 뒤집을거니까 인티저 타입으로 줌

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.intValue() - o1.intValue();
//		return o2 - o1; //intValue 없이 해도 됨. 자동 언박싱 되기 때문(?)
	}
}

//기준문을 가지고 있는 클래스