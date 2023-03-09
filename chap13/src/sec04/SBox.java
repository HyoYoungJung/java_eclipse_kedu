package sec04;

import java.io.Serializable;

public class SBox implements Serializable {

	String s;
	transient String pw; // 직렬화 : 전달 하더라도 다른데 넘어가지 않아 확인할 수 X.

	public SBox(String s, String pw) {
		this.s = s;
		this.pw = pw;
	}

	public String get() {
		return s + ", " + pw;
	}
}