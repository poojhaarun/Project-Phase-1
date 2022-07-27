package poojha;
import java.util.*;
public class calculator {
	public int Addition(int p ,int q){
		int res=(p+q);
		return res;
	}
	public int Subraction(int r,int s){
		int res=(r-s);
		return res;
	}
	public int Multiplication(int e,int f){
		int res=(e*f);
		return res;
	}
	public int Division(int x,int y){
		int res=(x/y);
		return res;
	}
	public static void main(String args[])
	{
		calculator ob = new calculator();
		int num1;
		int num2;
		
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of num1 : ");
		num1=sc.nextInt();
		System.out.print("Enter the value of num2 : ");
		num2=sc.nextInt();
		System.out.print("Enter the Character to be performed between two value : ");
		char operator=sc.next().charAt(0);
		if(operator=='+'){
			result=ob.Addition(num1,num2);
			System.out.print("The Addition of two values are : "+ result);
		}
		else if(operator=='-'){
			result = ob.Subraction(num1,num2);
			System.out.print("The Subraction of two values are : "+ result);
		}
		else if(operator=='*'){
			result = ob.Multiplication(num1,num2);
			System.out.print("The Multiplication of two values are : "+ result);
			
		}
		else{
			result=ob.Division(num1,num2);
			System.out.print("The Division of two values are : "+ result);
			
		}
		
		
		
	}

}