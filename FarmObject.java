public abstract class FarmObject{
	private int x;
	private int y;
	public abstract void doStuffForAnHour(int hour);
	
	public FarmObject(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x = x;
	}
	public int getY(){
		return this.y;
	}
	public void setY(int y){
		this.y = y;
	}
}