package first;

public class firstclass {
	
	public void one()
{
	System.out.println("one");
}
	public void two()
	{
		System.out.println("two");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi");
		firstclass i=new firstclass();
		i.one();
		i.two();
		secondclass j=new secondclass();
		j.three();

	}

}
