import java.util.*;

public class Farm2 extends WorldObject2{

	private FarmObject2[][] objectsFarm;
	private FarmObject2[] existingObjects;	
	private int xCoord;
	private int yCoord;
	private FarmObjects2[] listObjects = {"grass", "poisoned grass", "cow", "nocturnalcow", "flyingcow"};

	public void setFarm(){
		Random r = new Random();
		int count = 0;
		this.xCoord = r.nextInt(50);
		this.yCoord = r.nextInt(50);
		objectsFarm = new FarmObject2[xCoord][yCoord];
		for(int i = 0; i<this.xCoord; i++){
			for(int j = 0; j<this.yCoord; j++){
				if(r.nextInt(100)<50){
					int random = r.nextInt(1);
					objectsFarm[i][j] = listObjects.get(random);
					existingObjects[count] = listObjects.get(random);
				}
				else{
					int rand = r.nextInt(3) + 2;
					objectsFarm[i][j] = listObjects.get(rand);
				}
			}
		}
	}
	public FarmObjects2[][] getArray(){
		setFarm();
		return objectsFarm;
	}
	public String toString(){
		return(Arrays.deepToString(objectsFarm));
	}
}
