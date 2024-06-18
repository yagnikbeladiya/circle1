package circle;

public class defaultcon {
	
	
	    private double length;
	    private double breadth;

	    public defaultcon() {
	        this.length = 0;
	        this.breadth = 0;
	    }

	    public void setDim(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    public double getArea() {
	        return length * breadth;
	    }

	    public static void main(String[] args) {


	    	
	        Area rectangle = new Area();
	        System.out.println("The area of the rectangle with default dimensions is: " + rectangle.getArea());

	        rectangle.setDim(5, 3);
	        System.out.println("The area of the rectangle after setting dimensions is: " + rectangle.getArea());
	    }
	}



