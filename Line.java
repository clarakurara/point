import java.lang.Math;

public class Line {
	private Point beg;//Point class has-a line
	private Point end;
	
	//constructor	
	public Line(){}//initalises both beg and end with null //define the default constructor
	
	public Line(Point beg, Point end) {
		this.setBeg(beg);
		this.setEnd(end);
	}
	//Setters of beg and end
	public void setBeg(Point beg) {
		this.beg = beg;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	
	//Getters of beg and end
	public Point getBeg() {
		return beg;
	}
	public Point getEnd() {
		return end;
	}
	
	//toString
	public String toString(){
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		sb.append(beg.toString());
		sb.append(end.toString());
		sb.append("]");
		return sb.toString();
	}
	
	public boolean equals(Object obj) {
		boolean ans=false;
		if(obj instanceof Line) {
			Line l=(Line)obj;
			if(this.beg.equals(l.beg) &&this.end.equals(l.end))
			ans=true;
		}
		return ans;
	}
	
	public int lineType() {
		int ans=0;
		if(beg.getX()==end.getX())
			ans=1;//vertical
		else if(beg.getY()==end.getY())
			ans=2;//horizontal
		else
			ans=3;//oblique
		return ans;
	}
	
	public double distance() {//Seatwork
//		int x1=0, x2=0, y1=0, y2=0;
//		double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double distance=Math.sqrt((end.getX()-beg.getX())*(end.getX()-beg.getX())+(end.getY()-beg.getY())*(end.getY()-beg.getY()));
		return distance;
	}
	
	public static void main(String[] args) {
//		Point p1=new Point (-6, 3);
//		Point p2=new Point(5, 3);
//		Line l1=new Line(p1,p2);
		Line l1=new Line (new Point(-6, -3), new Point (-5,-3));
//		Line l2=new Line (new Point(-6, 3), new Point (5,3));
//		System.out.println(l1);
//		System.out.println(l2);
		
//		if(l1.equals(l2))
//			System.out.println("Equal?");
//		else
//			System.out.println("Not equal?");
		//		System.out.println(l1.lineType());//access the l1 object first
//		System.out.println("(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")=" + distance);
		System.out.println(l1.distance());
	}
}
	