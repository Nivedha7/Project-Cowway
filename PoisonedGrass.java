public class PoisonedGrass extends Grass{

	private int grass = getGrass();

	public void doStuffForAnHour(int hour){
		grass = grass+2;
	}
	public boolean isPoisonous(){
		return true;
	}
}
