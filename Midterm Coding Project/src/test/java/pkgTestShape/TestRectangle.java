package pkgTestShape;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.Test;
import pkgShape.Rectangle;


public class TestRectangle {

	@Test
	public void TestConstructor() {
		Rectangle r = new Rectangle(2,3);
		int i = r.getiWidth();
		int j = r.getiLength();
		
		assertEquals(i,2);
		assertEquals(j,3);
	}
	

	@Test
	public void TestWidth() {
		Rectangle r = new Rectangle(1,2);
		r.setiWidth(5);
		int i = r.getiWidth();
		
		assertEquals(i,5);
	}
	
	@Test
	public void TestLength() {
		Rectangle r = new Rectangle(1,2);
		r.setiLength(4);
		int i = r.getiLength();
		
		assertEquals(i,4);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void TestWidthExceptionThrown() {
		Rectangle r = new Rectangle(5,6);
		r.setiWidth(-5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void TestLengthExceptionThrown() {
		Rectangle r = new Rectangle(5,6);
		r.setiLength(-5);
	}
	
	@Test
	public void TestArea() {
		Rectangle r = new Rectangle(2,3);
		int i = (int) r.area();
		
		assertEquals(i,6);
	}
	
	@Test
	public void TestPerimeter() {
		Rectangle r = new Rectangle(3,3);
		int i = (int) r.perimeter();
		
		assertEquals(i,12);
	}
	
	@Test
	public void TestRectangleSort() {
		
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		
		for (int i = 0; i<10; i++) {
			int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			
			recs.add(new Rectangle(iWidth,iLength));
		}
		
		System.out.println("Before");
		for (Rectangle r: recs) {
			System.out.println(r.area());
		}
		
		Collections.sort(recs);
		
		System.out.println("After");
		for (Rectangle r: recs) {
			System.out.println(r.area());
		}
		
		
	}
}