interface First 
{  
    default void show() 
    { 
        System.out.println("Default First function"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second function"); 
    } 
}  
public class diamond implements First,Second {
	public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String[]args)
    {
    	diamond ob = new diamond();
        ob.show(); 

    }
   }