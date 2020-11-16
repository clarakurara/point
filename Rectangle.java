/*a. Create a class that uses the Point class to implement a Rectangle. The Rectangle class has two data members:
private Point upperLeft - to represent upper left coordinate
private Point lowerRight - to represent the lower right coordinate*/
public class Rectangle{
	private Point upperLeft;
	private Point lowerRight;
	

	//b. Implement the appropriate constructors for the Rectangle class.	
	public Rectangle() {}
	
	public Rectangle(Point upperLeft, Point lowerRight) {
		this.upperLeft=upperLeft;
		this.lowerRight=lowerRight;
	}
	
	//c. Encapsulate it.	
	public void setUpperLeft(Point upperLeft){
		this.upperLeft=upperLeft;
	}
	
	public void setLowerRight(Point lowerRight) {
		this.lowerRight=lowerRight;
	}

	public Point getUpperLeft() {
		return upperLeft;
	}
	
	public Point getLowerRight() {
		return lowerRight;
	}
	
/*d. Implement the following methods:
public double length()
- that returns the length of the rectangle
public double width()
- that returns the width of the rectangle
public double area()
- that returns the area of the rectangle by calling the length() and width()
double perimeter()
- that returns the perimeter of the rectangle by calling the length() and width()*/
	
	public double length() {
		return length();
	}
	
	public double width() {
		return width();
	}
	
	public double area(double width, double length) {
		double area= width*length;//
		return area;
	}
	
	double perimeter(double width, double length) {
		double perimeter=2*(length + width);//
		return perimeter;
	}
	
	
	//public void display() {
	//	System.out.println(upperLeft+" "+" "+lowerRight);
	//}


//e. Override toString() and equals().*
	public String toString() {
		StringBuffer sb=new StringBuffer();
		double area = 0.0;
		double perimeter=0.0;
		sb.append(upperLeft+" "+lowerRight+" "+area+" "+perimeter+"");
		return sb.toString();
	}
	
	public boolean equals(Object obj) {
		boolean ans=false;
		if (obj instanceof Rectangle) {
			Rectangle r=(Rectangle)obj;
			if(this.upperLeft==r.upperLeft && this.lowerRight==r.lowerRight)
				ans=true;
		} 
		return ans;
	}
	
	public static void main(String[]args){
		Rectangle r1 = new Rectangle(new Point(), new Point());
		Rectangle r2 = new Rectangle(new Point(2,3), new Point());
		
		//System.out.println();
		
		//if()
		//System.out.println();
		//else
		//System.out.println();
	}
}
