import java.util.Scanner;

public class Methods
{
	private int x;
	public static void hello()
	{
		System.out.println("Hello, world!");
	}
	public void print()
	{
		System.out.print("x is: " + x);
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public Methods(int x)
	{
		setX(x);
	}

	public int getX()
	{
		return this.x;
	}

	static void print(Methods m)
	{
		m.print();
	}
	public static void main(String[] args)
	{

	Methods m = new Methods(42);
	hello();
	m.print();
	m.setX(34);
	print(m);
	}
}