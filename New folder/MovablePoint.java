
public class MovablePoint extends Point {
	private float xSpeed =0.0f;

	private float ySpeed =0.0f;
	public  MovablePoint() {
		
	}
	
	public  MovablePoint(float xSpeed ,float ySpeed) {
		super();
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	public  MovablePoint(float x , float y,float xSpeed ,float ySpeed) {
		super(x,y);
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}

	public float getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getySpeed() {
		return ySpeed;
	}

	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	 
	public void setSpeed(float xSpeed,float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float[] getSpeed() {
		float []a= {this.xSpeed,this.ySpeed};
		 return a;
	}
	
	@Override
	public String toString() {
		return "MovablePoint [x= " + this.getX() + ", y= " + this.getY() +", Speed= (" + xSpeed + " , " + ySpeed +")" + "]";
	}
	
	public MovablePoint move() {
		float x=this.getX();
		float y=this.getY();
		  this.setX(x+=this.xSpeed);
		  this.setY(y+=this.ySpeed);
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

