package programming;

//public class Member {
//
//	private String name;
//	private String id;
//	private String pw;
//	private String age;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName() {
//		this.name = name;
//	}
//
//	Member allMember = new Member();
//
//}

//03번 공유 코드
public class Member {

	private String name;
	private String username;
	private String password;
	private int age;

	Member(String name, String username, String password, int age) {
		this.setName(name);
		this.setUsername(username);
		this.setPassword(password);
		this.setAge(age);
		// this.name = name; 으로 한문장으로 쓰는게 나음.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}