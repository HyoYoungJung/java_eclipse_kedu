package programming04;

public class TalkableTest {
	static void speak(Talkable lang) {
		lang.talk();
	}

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}
}
