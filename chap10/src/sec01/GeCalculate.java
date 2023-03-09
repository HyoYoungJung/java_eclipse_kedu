package sec01;

@FunctionalInterface // 함수형 인터페이스임을 표시해 줌
public interface GeCalculate<T> { // 함수형 인터페이스
	T cal(T a, T b);

}
