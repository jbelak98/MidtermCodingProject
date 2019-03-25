package pkgShape;


public class Rectangle extends Shape implements Comparable {
	
	private int iWidth;
	private int iLength;
	 
	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth = iWidth;
		this.iLength = iLength;
	} 

	public int getiWidth() {
		return iWidth;
		
	}
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
		if (iWidth <=   0) {
			throw new IllegalArgumentException("Width must be greater than zero.");
		}
	}
	
	public int getiLength() {
		return iLength;
	}
	
	public void setiLength(int iLength) {
		this.iLength = iLength;
		if (iLength <=   0) {
			throw new IllegalArgumentException("Length must be greater than zero.");
		}
	}
	
	public double perimeter() {
		return (double)this.iLength*2 + this.iWidth*2;
	}
	
	public double area() {
		return (double)this.iLength * this.iWidth;
	}
	
	public int compareTo(Object o) {
		Rectangle r = (Rectangle) o;
		return (int) this.area() - (int) r.area();
	}

}
