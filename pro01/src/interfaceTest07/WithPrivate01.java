package interfaceTest07;

interface WithPrivate01 {
	
	 default int getData01() {
		print();
		return get() + 100;
	}
	 private void print() {
		 System.out.println(get());
	 }
	 private int get() {
		 return 100;
	 }

}
