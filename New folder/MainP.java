
public class MainP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point3D s=new Point3D(  2.5f, 3.2f ,1.4f);
		float [] a=s.getXYZ();
		for(float i :a) {
			System.out.print( i +" ");
		}
		System.out.println(" ");
		System.out.println(s.toString());
		
	MovablePoint c=new MovablePoint(2,3,4,5);
	 // System.out.println( c.toString());
}
}