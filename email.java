package email;
import java.util.regex.*;    
import java.util.*; 
public class email {
	public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("hariarun@domain.co.in");  
        emails.add("asus@domain.com");  
        emails.add("sridevi.name@domain.com");  
        emails.add("hariarun#@domain.co.in");  
        emails.add("indianairforce@domain.com");  
        emails.add("jayafancy@domaincom");  
         
        emails.add("@poojhaarun.com");  
        emails.add("panasonic#domain.com");  
        
        String regex = "^(.+)@(.+)$";  
         
        Pattern pattern = Pattern.compile(regex);  
        
        for(String email : emails){  
             
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}