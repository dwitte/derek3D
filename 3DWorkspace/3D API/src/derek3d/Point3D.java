package derek3d;

/**
 * This is a 3D Point class that is able to be used for any 3-D object representation of a Point using doubles as the data holder.
 * 
 * @author dwitte
 *
 */
public class Point3D {
	/**
	 * Stores the x coordinate of the point.
	 */
	private double x;
	/**
	 * Stores the y coordinate of the point.
	 */
	private double y;
	/**
	 * Stores the z coordinate of the point.
	 */
	private double z;
	
	/**
	 * Constructor. Sets all the coordinates x,y,z to 0.0.
	 */
	Point3D()
	{
		x = 0.0;
		y = 0.0;
		z = 0.0;
	}
	
	/**
	 * Constructor. Sets all the coordinates to their respective values; x=x, y=y, z=z.
	 * @param x float x
	 * @param y float y
	 * @param z float z
	 */
	Point3D(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * Returns the x coordinate of the point.
	 * @return float
	 */
	public double getX() {
		return x;
	}

	/**
	 * Sets the x coordinate to the given parameter.
	 * @param x float
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * Returns the y coordinate of the point.
	 * @return float
	 */
	public double getY() {
		return y;
	}

	/**
	 * Sets the y coordinate to the given parameter.
	 * @param y float
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * Returns the z coordinate of the point.
	 * @return float
	 */
	public double getZ() {
		return z;
	}

	/**
	 * Sets the y coordinate to the given parameter.
	 * @param y float
	 */
	public void setZ(double z) {
		this.z = z;
	}
	
	
}
