

		/* Write a java Program to remove the special characters from given String*/
		  
public class Question2 
{
	public static void main(String[] args) 
	{
			/* Approach -01  :- By using replaceAll() method of String class */
		
		String str="sac!h@i#n";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
		
		
		
				/* Approach - 02  :-  By user defined Logic */
		
		 String str1= "S#a@u^r%a*v";
		 String resltstring ="";
		 
		 for(int i=0; i<str1.length(); i++)
		 {
			 if(str1.charAt(i) >64 && str1.charAt(i) <91 || str1.charAt(i) >96 && str1.charAt(i) <123 || str1.charAt(i) >=0 && str1.charAt(i) <=9)
			 {
				 resltstring =resltstring + str1.charAt(i);
			 }
		 }
		 
		System.out.println(resltstring);
		
	
	}
}
