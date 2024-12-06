

		/* WAJP to remove whitespace from a given String */

public class Question3
{
         public static void main(String[] args)
         {
			/*Approach 01 :- By using charAt(index) */
        	 
        	 String str ="sac hin";
        	 String str1="";
        	 int length = str.length();   // finding the length of a string 
        	 for(int i=0; i<length; i++ ) // traversing over each character of String
        	 {
        		 if(str.charAt(i)!= ' ')     // check whether character is not empty
        		 str1= str1 +str.charAt(i);  // concatenate the character with empty String
        	 }
        	 
        	 System.out.println(str1);
    	 
        	 
        	 
        	 
        	 /* Approach 02 :- By using toCharArray() */
        	 
        	 String str2="";
        	 char[] charArray = str.toCharArray();  //converting String to Array
        	 
        	 for(int i=0; i<charArray.length ;i++)  // Traversing over each index in Array
        	 {
        		 if(charArray[i] !=' ')            // check whether character is not empty
        		 str2= str2 +charArray[i];	       // concatenate the character with empty String
        	 }
        	 System.out.println(str2);
        	 
        	 
        	 
        	 /* Approach 03 :-  By using replaceAll() method of String Class*/
        	 
        	 String newString = str.replaceAll("\\s", "");
        	 System.out.println(newString);
        		 
		 }
}
