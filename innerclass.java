package innerclass;

public class innerclass {
	private String message="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(message);
			 }  
	  }  

	  Inner l=new Inner();  
	  l.msg();  
	 }  


	public static void main(String[] args) {
		innerclass  ob=new innerclass ();  
		ob.display();  
		}
}