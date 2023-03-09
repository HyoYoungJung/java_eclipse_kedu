package programming;

public class MapUI {
   // 지뢰는 '*', 그 외에는 '-'으로 저장할 이차원 배열
   private char[][] mineMap;

   // 지뢰는 '*', 그 외에는 근처 지뢰 개수로 저장할 이차원 배열
   private char[][] userMap;

   // 지정된 칸 주변 8칸을 확인 해줄 배열
   private int[][] square = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 }, { 0, -1 }, { 0, 1 } };

   // 생성자
   MapUI(int m, int n, double p) {
      // 배열 크기 설정
      mineMap = new char[m][n];
      userMap = new char[m][n];

      // '*', '-'을 사용한 메서드
      makeMap(p);
      // '*', 숫자를 사용한 메서드
      makeUserMap();
   }

   private void makeMap(double p) {
      for (int y = 0; y < mineMap.length; y++) {
         for (int x = 0; x < mineMap[0].length; x++) {
            // 내가 지정한 확률보다 낮으면 '*', 아니면 '-' 저장
            if (Math.random() < p)
               mineMap[y][x] = '*';
            else
               mineMap[y][x] = '-';
         }
      }
   }

   private void makeUserMap() {
      for (int y = 0; y < userMap.length; y++) {
         for (int x = 0; x < userMap[0].length; x++) {
            // 내 위치에 지뢰가 있다면 '*' 저장 후 넘어가기
            if (mineMap[y][x] == '*') {
               userMap[y][x] = '*';
               continue;
            }
            // 지뢰가 아니라면 주변 칸 확인
            userMap[y][x] = squareCheck(x, y);
         }
      }
   }

   private char squareCheck(int x, int y) {
      // 주변 지뢰 개수를 셀 변수
      int mineCount = 0;

      // 주변 8칸에 대해 반복해서 지뢰 체크
      for (int i = 0; i < square.length; i++) {
         // x나 y가 0이라면 배열에 -1번째를 찾을수 없고,
         // x나 y가 배열 마지막칸이라면 배열 범위 밖으로 넘어갈수 있으니 예외처리
         if (x + square[i][0] < 0 || y + square[i][1] < 0 || x + square[i][0] >= mineMap[0].length
               || y + square[i][1] >= mineMap.length)
            continue;
         else {
            // 만일 해당 칸에 지뢰가 있다면 지뢰개수++
            if (mineMap[y + square[i][1]][x + square[i][0]] == '*')
               mineCount++;
         }
      }
      // char형으로 반환(형 변환 후 반환하면 아스키 코드값이 들어가니 0의 아스키코드 값 더하기)
      return (char) (mineCount + '0');
   }

   // map 그리기
   public void drawMap(char[][] arr) {
      for (int y = 0; y < arr.length; y++) {
         for (int x = 0; x < arr[0].length; x++) {
            System.out.print(arr[y][x] + " ");
         }
         System.out.print("\n");
      }

   }

   // userMap, mineMap getter
   protected char[][] getUserMap() {
      return userMap;
   }

   protected char[][] getMineMap() {
      return mineMap;
   }

}