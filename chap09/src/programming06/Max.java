package programming06;

//public class Max<T> {
//	public T max(T input1, T input2) {
//		if (input1 instanceof Number) {
//			if (((Number) (input1)).intValue() > ((Number) (input2)).intValue()) {
//				return input1;
//			} else {
//				return input2;
//			}
//		} else if (((String) (input1)).length() > ((String) (input2)).length()) {
//			return input1;
//		} else {
//			return input2;
//		}
//	}
//}

//상용님 공유 코드
public class Max<T> {
	public <T extends Number> T max(T a, T b) {
		return a.doubleValue() < b.doubleValue() ? b : a;
	}

	public <T extends String> T max(T a, T b) {
		return a.length() < b.length() ? b : a;
	}
}