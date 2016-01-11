import java.util.*;

public class Cow extends FarmObject{
	private String name;
	private int hunger;
	private int age;
	private int sickness;
		
	public Cow(String name, int hunger, int age, int sickness){
		super((new Random()).nextInt(10),(new Random()).nextInt(10));
		this.name = name;
		this.hunger = hunger;
		this.age = age;
		this.sickness = sickness;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getHunger(){
		return hunger;
	}
	public void setHunger(int hunger){
		this.hunger = hunger;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getSickness(){
		return sickness;
	}
	public void setSickness(int sickness){
		this.sickness = sickness;
	}
	
	public void doStuffForAnHour(int hour){
		
	}
}