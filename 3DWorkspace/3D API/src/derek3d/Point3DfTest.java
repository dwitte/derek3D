package derek3d;

import static org.junit.Assert.*;

import org.junit.Test;

public class Point3DfTest {

	@Test
	public void testGetX() {
		Point3Df point = new Point3Df(4.0f,-1.0f,-2.0f);
		if(point.getX() != 4.0f)
			fail("Not yet implemented");
	}

	@Test
	public void testSetX() {
		Point3Df point = new Point3Df();
		point.setX(4.0f);
		if(point.getX() != 4.0f)
			fail("Not yet implemented");
	}

	@Test
	public void testGetY() {
		Point3Df point = new Point3Df(-1.0f,4.0f,-2.0f);
		if(point.getY() != 4.0f)
			fail("Not yet implemented");
	}

	@Test
	public void testSetY() {
		Point3Df point = new Point3Df();
		point.setY(4.0f);
		if(point.getY() != 4.0f)
			fail("Not yet implemented");
	}

	@Test
	public void testGetZ() {
		Point3Df point = new Point3Df(-1.0f,-2.0f,4.0f);
		if(point.getZ() != 4.0f)
			fail("Not yet implemented");
	}

	@Test
	public void testSetZ() {
		Point3Df point = new Point3Df();
		point.setZ(4.0f);
		if(point.getZ() != 4.0f)
			fail("Not yet implemented");
	}

}
