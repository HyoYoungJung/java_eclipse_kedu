package programming;

public class MovablePoint extends Point {
	private int xSpeed, ySpeed;

	public int getXspeed() {
		return xSpeed;
	}

	public int getYspeed() {
		return ySpeed;
	}

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public String toString() {
		return "x = " + getX() + ", y = " + getY() + ", xSpeed = " + getXspeed() + ", ySpeed = " + getYspeed();
	}
}
