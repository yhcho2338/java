package pro12;


class WithWild<G extends Number> {
	
	G data;
	WithWild (G d) {
		data = d;
	}
	boolean same(WithWild<?> x) {
		if (Math.abs(data.doubleValue()) == Math.abs(x.data.doubleValue())){
			return true;
		} 
	
		return false;
	}
	
}



public class exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WithWild<Integer> a = new WithWild<Integer>(6);
		WithWild<Double> b = new WithWild<Double>(-6.0);
		WithWild<Long> c = new WithWild<Long>(5L);

		if (a.same(b)) {
			System.out.println("a�� b�� ����.");
		} else {
			System.out.println("a�� b�� �ٸ���.");
		}
		
		if (a.same(c)) {
			System.out.println("a�� c�� ����.");
		} else {
			System.out.println("a�� c�� �ٸ���.");
		}
	}

}
