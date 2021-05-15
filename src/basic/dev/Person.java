package basic.dev;

public class Person {
	private String name;
	private double mark;
	public Person(String name, double mark) {
		super();
		this.name = name;
		this.mark = mark;
	};
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}	
}
