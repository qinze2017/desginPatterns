package SingletonPatterns;

public class SingleObject {

	// create an object of SingleObject
	private volatile static SingleObject instance;

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {}

	// Get the only object available
	public static SingleObject getInstance() {
		if(instance == null ) {
			
			synchronized (SingleObject.class) {
				if (instance == null) {
					instance = new SingleObject();
				}
			}
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Create a singleton!");
	}

}
