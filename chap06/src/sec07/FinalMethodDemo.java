package sec07;

class Chess {
	enum ChessPlayer {
		WHITE, BLACK
	}

	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}
}

class WorldChess extends Chess {
//	ChessPlayer getFirstPlayer() {} //getFirstPlayer는 final메서드이기 때문에 오버라이딩하면 오류 발생
}

public class FinalMethodDemo {
	public static void main(String[] args) {
		WorldChess w = new WorldChess();
		w.getFirstPlayer();
	}
}
