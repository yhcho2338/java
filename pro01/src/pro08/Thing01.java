package pro08;

class Thing01 extends Object01 {
	
	private String name;
	private int count;
	
	Thing01() {}
		Thing01(String name, int count) {
			this.name = name;
			this.count = count;
		}
		
		void print() {
			System.out.println("name: " + name);
			System.out.println("count: " + count);
		}
		
		public boolean equals (Object01 obj) {
			if (this.name.equals(((Thing01)obj).name) && this.count == ((Thing01)obj).count){
         return true;
		}
        return false;
		}
		


	public static void main(String[] args) {
		
		Thing01 th1 = new Thing01("desk", 5);
		Thing01 th2 = new Thing01("desk", 5);
		
		if (th1.equals(th2)) {
			System.out.println("Same Thing"); 
		}else {
			System.out.println("Different Thing");

	}

	}
}
