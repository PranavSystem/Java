package Fruits;

public class Fruit {
	private String color,name;
	private double weight;
	private boolean fresh;
	public Fruit() {
		color = "white";
		name = "no name";
		weight = 0.0;
		fresh = false;
	}
	
	
	public Fruit(String color, String name, double weight, boolean fresh) {
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.fresh = fresh;
	}


	public String toString()
	{
		return "Name="+name+" Color="+color+" Weight="+weight;
	}
	
	public String taste()
	{
		return"no specific taste";
	}
}
