public class PoisonedGrass extends Grass{

	public void doStuffForAnHour(int hour){
		grass = grass+2;
	}
	public boolean isPoisonous(){
		return true;
	}
}