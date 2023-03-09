package sec04;

public class Student extends Thread {

	@Override
	public void run() {
//		Library library = new Library();
		String title;
		try {
			title = LibraryDemo.library.lendBook();
			if (title == null)
				return;
			sleep(5000);
			LibraryDemo.library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
