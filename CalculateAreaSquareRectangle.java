package session5;

public class CalculateAreaSquareRectangle {
	
	private double rectangleArea;
	private double squareArea;

	//Constructor
	CalculateAreaSquareRectangle(){}
	
	CalculateAreaSquareRectangle(double side) {
		this.squareArea = side * side;
	}
	
	CalculateAreaSquareRectangle(double length, double width) {
		this.rectangleArea = length * width;
	}
	
	public static void main(String[] args) {
		final double length = 10;
		final double width = 20;
		final double side = 30;
		
		CalculateAreaSquareRectangle sArea = new CalculateAreaSquareRectangle(side);
		CalculateAreaSquareRectangle rArea = new CalculateAreaSquareRectangle(length, width);
		
		System.out.println("Area of a square with sides " + side + " is " + sArea.squareArea);
		System.out.println("Area of a rectangle with length " + length + " and width " + width + " is " + rArea.rectangleArea);
	}

}
