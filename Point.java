public class Point {
	private int x;
	private int y;
	
	//Constructors
	public Point() {}
	public Point(int x, int y) {
	this.x=x;
	this.y=y;
	}
	//End constructor
	
	//Setters
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	//End setter
	
	//Getter
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	//End getter
	
//	public void display () {
//		System.out.println(x+" "+y+" ");
//	}
	
	//toString
	public String toString() {//pass integer to a value
		StringBuffer sb=new StringBuffer();
		sb.append("("+x +" , "+y+")");
		return sb.toString();
	}
	//End toString
	
	//boolean Equals
	public boolean equals(Object obj) {
		boolean ans=false;//not equal
		if (obj instanceof Point) {
			Point p=(Point)obj;
			if(this.x==p.x && this.y==p.y)
				ans=true;
		}
		return ans;
	}
	//End boolean equals	
	
	public static void main(String[] args) {
		Point p1=new Point(3,4);
		Point p2=new Point(3,4);
		System.out.println(p1+ " " +p2);
		
		if(p1.equals(p2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}
