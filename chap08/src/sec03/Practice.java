package sec03;

//프로그램 사용자로부터 임의의 정수 A와 Z를 입력 받는다.
//그리고 A와 Z를 포함하여 그 사이에 있는 난수 10개를 생성하여 출력하는 프로그램 작성.
//A=30, B=90

//작성중
import java.util.Random;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요.");
		int a = in.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		int z = in.nextInt();

		int numMax = Math.max(a, z);
		int numMin = Math.min(a, z);

		System.out.println(numMax + " " + numMin);

		Random r = new Random();

		int max = numMax + 1;

		for (int i = 0; i < 10; i++) {
			System.out.print((r.nextInt(max)) + " ");
			if (r.nextInt(max) < numMin)
				continue;
		}
	}
}

//방법1
//import java.util.Random;
//import java.util.Scanner;
//
//public class Practice {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		Random r = new Random();
//		System.out.println("시작수 입력");
//		int A = in.nextInt();
//		System.out.println("끝수 입력");
//		int Z = in.nextInt();
//		int count = 0;
//		for (int i = 0; i < 10;) {
//			count = r.nextInt(Z + 1);
//			if (count > A - 1) {
//				System.out.print(count + " ");
//				i++;
//			}
//		}
//	}
//
//}

//방법2
//import java.util.*;
//
//public class Practice {
//
//   public static void main(String[] args) {
//      Scanner scanner = new Scanner(System.in);
//
//      System.out.println("첫번째 수 입력");
//      int a = scanner.nextInt();
//
//      System.out.println("두번째 수 입력");
//      int z = scanner.nextInt();
//      
//      randomValue(Integer.min(a, z), Integer.max(a, z));
//   }
//
//   public static void randomValue(int a, int z) {
//      
//      z++;
//      Random random = new Random();
//      
//      for (int i = 0; i < 10; i++) {
//         
//         int value = random.nextInt(z);
//         
//         if (a > value ) {
//            i --;
//            continue;
//         }
//         System.out.println(value);
//         
//      }
//      System.out.println();
//   }
//
//}

//방법3
//import java.util.Random;
//import java.util.Scanner;
//
//public class Practice {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		Random r = new Random();
//		int a = in.nextInt();
//		int z = in.nextInt();
//
//		System.out.println(a + "   " + z);
//
//		if (a < z) {
//			for (int i = 0; i < 10; i++) {
//				System.out.print(r.nextInt(z - a + 1) + a + " ");
//			}
//		} else {
//			for (int i = 0; i < 10; i++) {
//				System.out.print(r.nextInt(a - z + 1) + z + " ");
//			}
//		}
//	}
//}