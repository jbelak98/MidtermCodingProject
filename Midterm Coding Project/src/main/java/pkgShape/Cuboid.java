package pkgShape;

import java.util.*; 


public class Cuboid extends Rectangle{
	
	private int Depth;

	public Cuboid(int iWidth, int iLength, int depth) {
		super(iWidth, iLength);
		Depth = depth; 
	}

	public int getDepth() {
		return Depth;
	}

	public void setDepth(int depth) {
		Depth = depth;
		if (Depth <= 0) {
			throw new IllegalArgumentException("Depth must be positive.");
		}
	}
	
	public double volume() {
		return this.Depth * this.Depth * this.Depth;
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Perimeter is not valid in Cuboid.");
	}
	
	@Override
	public double area() {
		return (double)super.getiWidth()*super.getiLength()*2 + super.getiLength()*this.Depth*2 + super.getiWidth()*this.Depth*2;
	}
	
	
	
	class SortByVolume implements Comparator<Cuboid> { 
		public int compare(Cuboid a, Cuboid b) {
			return (int) a.volume() - (int) b.volume();
		}
		
	}
	
	class SortByArea implements Comparator<Cuboid> {
		public int compare(Cuboid a, Cuboid b) {
			return (int) a.area() - (int) b.area();
		}
		
	}
	
}
