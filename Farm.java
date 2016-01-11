public class Farm{
	private FarmObject farmDimensions[][];
	private FarmObject occupiedDimesions[];
	
	public Farm(int dimX, int dimY, occX){
		farmDimensions= new FarmObject[dimX][dimY]
		occupiedDimesions= new FarmObject[occX]
	}
	public FarmObject getObjectAt(int x, int y){
		return farmDimensions[x][y];
	}
	public void setObjectAt(int x, int y, FarmObject fo){
		farmDimensions[x][y] = fo;
	}

	public void occupyObjectAt(int x, FarmObject fo) {
		occupiedDimesions[x] = fo;
	}

	public void setFarmDimensions(FarmObject farmDimensions[][]) {
		this.farmDimensions = farmDimensions;
	}

	public FarmObject setFarmDimensions(FarmObject, farmDimensions[][]){
		return farmDimensions;
	}
}