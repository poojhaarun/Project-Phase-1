class Calculator
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
class calcAdv extends  Calculator
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}
class calcveryadv extends calcAdv
{
	public int mul(int i,int j)
	{
		return i*j;
	}
}
public class InheriDemo {
	public static void main(String[] args)
	{
		calcveryadv ob1 =  new calcveryadv();
		int n1=ob1.add(29, 5);
		int n2=ob1.sub(18, 3);
		int n3=ob1.mul(29, 8);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
	}
}
