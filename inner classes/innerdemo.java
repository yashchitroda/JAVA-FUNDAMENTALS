class outerclass
{
	float a=1.1f;
	public void Show()
	{
		System.out.println("outerclass - Show()");
		System.out.println("Value of a = " +a);
	}
	class innerclass
	{
		float b=2.09f;
		public void Show()
		{
			System.out.println("\ninnerclass - Show()");
			System.out.println("Value of b = " +b);
		}
	}
}
public class innerdemo
{
	public static void main(String [] args)
	{
        outerclass o = new outerclass();
		o.Show();
		outerclass.innerclass i = o.new innerclass();
		i.Show();		
	}
}