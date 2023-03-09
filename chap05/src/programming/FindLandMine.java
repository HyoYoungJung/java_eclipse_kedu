package programming;

import java.util.Scanner;

public class FindLandMine {
	public static void main(String[] args) {
		int m, n;
		double p;
		Scanner in = new Scanner(System.in);

		// m,n,p 입력받기
		m = in.nextInt();
		n = in.nextInt();
		p = in.nextDouble();

		// MapUI 생성자 호출과 동시에 맵 생성
		MapUI mUI = new MapUI(m, n, p);
		// 지뢰 깔린 위치는 '*', 아닌 곳은 '-' 으로 출력하는 메서드
		mUI.drawMap(mUI.getMineMap());
		System.out.print("\n");

		// 지뢰 깔린 위치는 '*', 아닌 곳은 근처 지뢰 개수 출력하는 메서드
		mUI.drawMap(mUI.getUserMap());
	}

}