package derek3d;

public class Vector3D {
	private double i;
	private double j;
	private double k;
	
	Vector3D()
	{
		i=0.0;
		j=0.0;
		k=0.0;
	}
	
	Vector3D(double i, double j, double k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	Vector3D scale(double s)
	{
		this.i *= s;
		this.j *= s;
		this.k *= s;
		return this;
	}
	
	Vector3D toUnitVector()
	{
		return this.scale(1/this.magnitude());
	}
	
	double magnitude()
	{
		return Math.sqrt(i*i+j*j+k*k);
	}
}
