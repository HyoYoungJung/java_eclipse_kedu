package sec06;

public class BoundWildcardBase {

	public static void main(String[] args) { // 토이박스 만들고 토이 넣다뺐다한거
		Box<Toy> box = new Box<>();
		Toy toy = new Toy();
		BoxHandler.inBox(box, toy); // 박스핸들러 클래스의 Toy n임 아래 행과 같은 의미
		BoxHandler.outBox(box); // 박스핸들러 클래스의 Toy n임 위 두행과 같은 의미. (익명클래스??)

		Box<Robot> rBox = new Box<>();
//		BoxHandler.inBox(rbox, new Robot()); //오류 나는게 맞음 
//		BoxHandler.outBox(rbox); //오류 나는게 맞음 
//		BoxHandler.inBox2(rbox, new Robot()); //오류 나는게 맞음 
//		BoxHandler.outBox2(rbox); //오류 나는게 맞음 
	}
}
