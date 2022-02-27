package interfaceTest02;

public class ChildrenBook implements Book01 {
	
	// class가 interface를 상속할때는 implements 
	
	private String title;
	private String auther;
	
	
	ChildrenBook() {}
	ChildrenBook (String title, String auther) {
		this.title = title;
		this.auther = auther;
		
	}
	
	public void printInfo() {
		System.out.println("책 설명");
	}
	
	public void showTitle() {
		System.out.println("title: " + title);
		System.out.println("auther: " + auther);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
