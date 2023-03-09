package challenge;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int numOfStudents = 0; // 학생수 변수
		int[] scores; // 점수 배열 변수
		Scanner in = new Scanner(System.in);

		System.out.print("학생수?");
		numOfStudents = in.nextInt(); // 키보드 입력값을 학생수에 대입
		scores = new int[numOfStudents]; // 입력한 학생수 만큼 배열 객체 생성

		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
		for (int i = 0; i < numOfStudents; i++) {
			scores[i] = in.nextInt(); // 학생수 만큼 입력한 성적을 각 배열 객체에 저장
		}

		System.out.println(numOfStudents + "명의 학생성적은 다음과 같습니다.");
		for (int x : scores) { // scores 배열에 저장돼 있는 값을 변수 x에 대입
			System.out.print(x + " ");
		}
		System.out.println();

		for (int i = 0; i < numOfStudents; i++) {
			if (scores[i] >= 90) {
				System.out.println((i + 1) + "번 학생의 등급은 " + Grade.A + "입니다.");
			} else if (scores[i] >= 80) {
				System.out.println((i + 1) + "번 학생의 등급은 " + Grade.B + "입니다.");
			} else if (scores[i] >= 70) {
				System.out.println((i + 1) + "번 학생의 등급은 " + Grade.C + "입니다.");
			} else if (scores[i] >= 60) {
				System.out.println((i + 1) + "번 학생의 등급은 " + Grade.D + "입니다.");
			} else {
				System.out.println((i + 1) + "번 학생의 등급은 " + Grade.E + "입니다.");
			}
		}
	}

	enum Grade {
		A("최우수"), B("우수"), C("보통"), D("미흡"), E("탈락");

		private String s;

		Grade(String s) {
			this.s = s;
		}

		public String toString() { // 객체를 문자열로 반환
			return s;
		}
	}

}