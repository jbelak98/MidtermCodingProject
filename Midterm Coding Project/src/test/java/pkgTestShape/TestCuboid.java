package pkgTestShape;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.Test;
import pkgShape.Cuboid;
import java.util.*;


public class TestCuboid {

	@Test
	public void testConstructor() {
		Cuboid c = new Cuboid(4,5,6);
		
		int d = c.getDepth();
		int l = c.getiLength(); 
		int w = c.getiWidth();
		
		assertEquals(d,6);
		assertEquals(l,5);
		assertEquals(w,4);
	}
	
	@Test
	public void testWidth() {
		Cuboid c = new Cuboid(4,5,6);
		c.setiWidth(18);
		int w = c.getiWidth();
		
		assertEquals(w,18);
	}
	
	@Test
	public void testLength() {
		Cuboid c = new Cuboid(4,5,6);
		c.setiLength(18);
		int l = c.getiLength();
		
		assertEquals(l,18);
	}
	
	@Test
	public void testDepth() {
		Cuboid c = new Cuboid(4,5,6);
		c.setDepth(18);
		int d = c.getDepth();
		
		assertEquals(d,18);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void TestWidthExceptionThrown() {
		Cuboid c = new Cuboid(5,6,7);
		c.setiWidth(-5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void TestLengthExceptionThrown() {
		Cuboid c = new Cuboid(5,6,7);
		c.setiLength(-5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void TestDepthExceptionThrown() {
		Cuboid c = new Cuboid(5,6,7);
		c.setDepth(-5);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void TestPerimeterExceptionThrown() {
		Cuboid c = new Cuboid(5,6,7);
		c.perimeter();
	}
	
	@Test
	public void TestCuboidSortArea() {
		
		ArrayList<Cuboid> cuboids = new ArrayList<Cuboid>();
		
		for (int i = 0; i<10; i++) {
			int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int Depth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			
			cuboids.add(new Cuboid(iWidth,iLength,Depth));
		}
		
		System.out.println("Before");
		for (int k=0; k<cuboids.size(); k++) {
			System.out.println(cuboids.get(k).area());
		}
		
		Collections.sort(cuboids, new SortbyArea());
		
		System.out.println("After");
		for (Cuboid c: cuboids) {
			System.out.println(c.area());
		}
		
	}
	
	@Test
	public void TestCuboidSortVolume() {
		
		ArrayList<Cuboid> cuboids = new ArrayList<Cuboid>();
		
		for (int i = 0; i<10; i++) {
			int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int Depth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			
			cuboids.add(new Cuboid(iWidth,iLength,Depth));
		}
		
		System.out.println("Before");
		for (Cuboid c : cuboids) {
			System.out.println(c.area());
		}
		
		Collections.sort(cuboids, new SortByVolume());
		
		System.out.println("After");
		for (Cuboid c : cuboids) {
			System.out.println(c.volume());
		}
		
	}
	
}
