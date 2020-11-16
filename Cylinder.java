import java.lang.Math;

//a. Implement a class called Cylinder. A cylinder has a circle and one additional data member for representing the height (type float).
public class Cylinder {
	private float radius, height;
	
	//b. Create appropriate constructors for your Cylinder class.
	public Cylinder() {
	}
	
	public Cylinder (float radius, float height, double volume) {
		this.radius=radius;
		this.height=height;
	}

	//c. Encapsulate it.
	//Setter
	public void setRadius(float radius) {
		this.radius=radius;
	}
	
	public void setHeight(float height) {
		this.height=height;
	}
	//Getter
	public float getRadius() {
		return radius;
	}
	
	public float getHeight() {
		return height;
	}
	//d. Include methods for finding the volume and area of your Cylinder.
		//area = 2 * (area of the circle in this cylinder) + 2 * pi * radius + height
		//(2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2))
		//volume = (area of the circle in this cylinder) * height
	public double getArea() {
		double area=2 * (Math.PI * radius * height) + 2 * (Math.PI * Math.pow(radius,2));
		return area;
	}
	
	public double getVolume() {
		double volume = Math.PI * Math.pow(radius,2) * height;
		return volume;
	}
	//e. Override the toString method of the Object class. Try to use the toString of the Circle class and then just concatenate the remaining values.
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("h: "+ height + " r: "+ radius +" v: "+ getVolume());//edit 
		return sb.toString();
	}
	
	//f. Override the equals method of the Object class. Two Cylinder objects are equal if they have the same center and the same radius and the same height.
	public boolean equals(Object obj) {
		boolean ans=false;
		if (obj instanceof Circle) {
			Cylinder cy=(Cylinder)obj;
			if(this.radius==cy.radius && this.height==cy.height && getVolume()==cy.getVolume())
				ans=true;
		}
		return ans;
	}
	//g. Write a simple main method that creates Cylinder objects and tests each of the methods that you have defined.
	public static void main(String[] args) {
		Cylinder cy1=new Cylinder();
		Cylinder cy2=new Cylinder(1, 2, 0.0);
		System.out.println(cy1);
		System.out.println(cy2);
		if(cy1.equals(cy2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}
