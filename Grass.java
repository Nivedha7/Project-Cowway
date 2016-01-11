public class Grass extends FarmObject{
	private int grass;
	
	public Grass(int grass){
		this.grass = grass;
	}
	public int getGrass(){
		return grass;
	}
	public void setGrass(int grass){
		this.grass = grass;
	}
	public void doStuffForAnHour(int hour){
		grass = grass+1;
	}
	public boolean isPoisonous(){
		return false;
	}
}