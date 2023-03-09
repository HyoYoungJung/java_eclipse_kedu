//06번 공유 코드
package programming;

public class Complex {
	double bokSoSu, bokSoSu2;

	Complex(double bokSoSu) { // 매개변수가 1개인 것을 위해
		this.bokSoSu = bokSoSu;
	}

	Complex(double bokSoSu, double bokSoSu2) { // 매개변수가 2개인 것을 위해
		this.bokSoSu = bokSoSu;
		this.bokSoSu2 = bokSoSu2;
	}

	void print() {
		System.out.printf("%.1f + %.1fi\n", bokSoSu, bokSoSu2);
	}
}
