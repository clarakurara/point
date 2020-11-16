
public class Test {

	public static void main(String[] args) {
		Point p1=new Point(-6, 3);
		Point p2=new Point(5, 3);
		Line l1=new Line(p1, p2);//used 2nd constructor
//		Line l1=new Line();
//		l1.setBeg(p1);
//		l1.setEnd(p2);
		System.out.println(l1);
	}

}
