import java.lang.Math;

public class Circle {
	//a. Implement a class called Circle for representing a circle. The circle has two data members, a Point object representing the center of the circle and a float value representing the radius.
	private Point center;
	private float radius;
	
	//Include appropriate constructors for your Circle class.
	public Circle() {}
	
	public Circle(Point center, float radius) {
		this.center=center;
		this.radius=radius;
	}
	
	//b. Encapsulate it.
	//Setter
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}

	//Getter
	public Point getCenter() {
		return center;
	}
	
	public float getRadius() {
		return radius;
	}
		
	//c. Also include methods for finding the area and circumference of the circle.
		//area = pi * radius * radius
		//circumference = 2 * pi * radius.
		//(You may use the static constant pi in the Math class)
	public double getArea() {
		double area=Math.PI * radius * radius;
		return area;
	}
	
	public double getCircumference() {
		double circumference=2.0 * Math.PI * radius;
		return circumference;
	}
	
	//d. Override the toString() and equals().
	//toString
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append(center+" "+radius+" ");//edit 
		return sb.toString();
	}
	
	//Equals
	public boolean equals(Object obj) {
		boolean ans=false;
		if (obj instanceof Circle) {
			Circle c=(Circle)obj;
			if(this.center==c.center && this.radius==c.radius)//edit
				ans=true;
		}
		return ans;
	}
	
	//e. Write a simple main method that creates Circle objects and tests each of the methods that you have defined.
	public static void main(String[] args) {
		Circle c1=new Circle();
		Circle c2=new Circle();
		System.out.println(c1);
		System.out.println(c2);
			
		if(c1.equals(c2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

	}
	
}
