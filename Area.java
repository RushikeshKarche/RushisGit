class Area 
{
	public static void main(String[] args) 
	{
		System.out.println(area(6));
		System.out.println(area(-6));
		System.out.println(area(8,5));
		System.out.println(area(8,-5));
		System.out.println(area(-8,5));
	}

	public static double area(double r)
	{
		if (r>=0)
		{
			double a=3.14*r*r;
			return a;
		}
		else
			double -1.0;
	}

	public static double area(double x,double y)
	{
		if (x>=0&&y>=0)
		{
			double a=x*y;
			return a;
		}
		else
			return -1.0;
	}
}
