package sec01;

@FunctionalInterface
public interface Calculate {
	int cal(int a, int b);

//	double cal(double a, double b);
	default int Add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}
}
