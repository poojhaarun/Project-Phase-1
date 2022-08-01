
 
	class C
	{
		public void show()
		{
			System.out.println("namaste");
		}
		public void show(int i)
		{
			System.out.println("welcome");
		}
		public void show(double i)
		{
			System.out.println("Gud morning");
		}
	}

	public class polymorphism {
		public static void main(String[] args){
			C ob1 = new C();
		    ob1.show();
		    ob1.show(3.5);
		    ob1.show(6);
		    
			
		}
	}

