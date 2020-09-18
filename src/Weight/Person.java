package Weight;

import java.io.Serializable;

public class Person implements Serializable{
	private int weight;
	private int pw;

	public Person() {}
	public Person(int weight, int pw) {

		this.weight = weight;
		this.pw = pw;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return weight+" : "+pw;
	}
	
}
