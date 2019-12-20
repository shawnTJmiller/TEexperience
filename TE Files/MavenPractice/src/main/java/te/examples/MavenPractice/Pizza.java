package te.examples.MavenPractice;

public class Pizza {
	
	//data members & Getters
	private String shape;
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	private String topping;
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	//constructors
	public Pizza(String shape) {
		this.shape = shape;
	}

	public Pizza(String shape, String topping) {
		this.shape = shape;
		this.topping = topping;
	}
}
