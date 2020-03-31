package PrototypePatterns;

public abstract class Shape implements Cloneable {

	private String id;
	
	// https://www.java-made-easy.com/java-access-modifiers.html
	// Protected variables and methods allow the class itself to access them,
	// classes inside of the same package to access them, and subclasses of that
	// class to access them.
	protected String type;

	abstract void draw();

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object clone() {

		Object clone = null;

		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}
}
