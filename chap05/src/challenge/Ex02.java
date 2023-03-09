package challenge;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int numOfStudents = 0; // 학생수 변수
		int[] scores; // 점수 배열 변수
		Scanner in = new Scanner(System.in);

		System.out.print("학생수?");
		numOfStudents = in.nextInt(); // 키보드 입력값을 학생수에 대입
		scores = new int[numOfStudents]; // 입력한 학생수 만큼 배열 객체 생성

		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
		for (int i = 0; i < numOfStudents; i++) {
			scores[i] = in.nextInt(); // *향상된 for문 쓸수X* 학생수 만큼 입력한 성적을 각 배열 객체에 저장
		}

		System.out.println(numOfStudents + "명의 학생성적은 다음과 같습니다.");
		for (int score : scores) { // *향상된 for문으로 변경* scores 배열에 저장돼 있는 값을 변수 score에 대입
			System.out.print(score + " ");
		}

		System.out.println();

		for (int i = 0; i < numOfStudents; i++) { // numOfStudents 대신 scores.length 사용 가능
			if (scores[i] >= 90) {
				System.out.println((i + 1) + "번 학생의 등급은 A입니다.");
			} else if (scores[i] >= 80) {
				System.out.println((i + 1) + "번 학생의 등급은 B입니다.");
			} else if (scores[i] >= 70) {
				System.out.println((i + 1) + "번 학생의 등급은 C입니다.");
			} else if (scores[i] >= 60) {
				System.out.println((i + 1) + "번 학생의 등급은 D입니다.");
			} else {
				System.out.println((i + 1) + "번 학생의 등급은 F입니다.");
			}
		}
	}
}