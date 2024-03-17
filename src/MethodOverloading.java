public class MethodOverloading {

	public void sum(int a,int b)
	{
		System.out.println("Sum="+(a+b));
	}
	public void sum(int a,int b,int c)
	{
		System.out.println("Sum of a,b,c="+(a+b+c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		m.sum(2,4);
		m.sum(3, 5, 6);
	}

}
