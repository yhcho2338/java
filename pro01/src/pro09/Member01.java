package pro09;

public class Member01 {
	
	public String id;
	
	public Member01 () {}
	public Member01 (String id) {
		this.id = id;
		
	}
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Member01) {
			Member01 member = (Member01) obj;
			
		 if(id.equals(member.id)) {
			 return true;
			 }
			
		}
	
	return false;

}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
