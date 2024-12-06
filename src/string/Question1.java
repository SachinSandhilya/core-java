
	//* 	WAJP to reverse the String 		*//
public class Question1 
{
	public static void main(String[] args) 
	{
		
				/* Approach 1 :- By Using toCharArray()  */ 
		
		String str= "hello";
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		
		//last index= Array's length-1
		
		for (int i = length-1; i>=0; i--) 
		{
			System.out.print(charArray[i]);
			
		}
		
		
									System.out.println();  //Simply to change the line 
		
		
			/* Approach 2 :- By Using charAt(index)   */ 
		
		String str2 ="sachin";
		for(int i= str2.length()-1; i>=0; i--)
		{
			System.out.print(str2.charAt(i));
		}

		
	}
}
