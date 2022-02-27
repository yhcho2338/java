package pro12;


class Data<T> {
	T obj;
	Data(T ob) {
		obj = ob;
	}
	T getObj() {
		return obj;
	}
	 void showType() {
		 System.out.println("Type of T: " + obj.getClass().getName());
	 }
	
}


public class exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data<Integer> d1 = new Data<Integer>(100);
		System.out.println(d1.getObj());
		d1.showType();
		
		
		Data<String> d2 = new Data<String>("JAVA");
		System.out.println(d2.getObj());
		d1.showType();
		

	}

}
