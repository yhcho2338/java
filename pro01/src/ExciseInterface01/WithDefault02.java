package ExciseInterface01;

public interface WithDefault02 {
	
	int get();
	default int getNext() {
		int value = get() + 10;
		return value;
	}

	
	
}
