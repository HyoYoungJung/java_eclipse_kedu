package challenge;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int numOfStudents = 0; // 학생수 변수
		int[] scores; // 점수 배열 변수
		Scanner in = new Scanner(System.in);

		System.out.print("학생수?");
		numOfStudents = in.nextInt(); // 키보드 입력값을 학생수에 대입
		scores = new int[numOfStudents]; // *point* 입력한 학생수 만큼 배열 객체 생성

		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
		for (int i = 0; i < numOfStudents; i++) { // numOfStudents 대신 scores.length 사용도 가능
			scores[i] = in.nextInt(); // 학생수 만큼 입력한 성적을 각 배열 객체에 저장
		}

		System.out.println(numOfStudents + "명의 학생성적은 다음과 같습니다.");
		for (int i = 0; i < scores.length; i++) { // 조건식 : scores 배열의 크기(=입력한 학생수) 만큼 반복
			System.out.print(scores[i] + " "); // 각 배열 객체에 저장된 값 연달아 출력
		}

	}

}
