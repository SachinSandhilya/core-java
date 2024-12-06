

import java.util.HashSet;
import java.util.LinkedHashSet;

// *        WAJP to remove duplicates character(s) from the given String        *//
public class Question4 
{
    public static void main(String[] args) 
    {
        
        // Approach 1 :- By using indexOf() method //
        String str = "programming";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
        {
            char ch =str.charAt(i);
            if (str.indexOf(ch, i+1)==-1)
            {
                sb.append(str.charAt(i));
            }      
        }
        System.out.println(sb);  //poraming



        // *    Approach 02 :- By Using nested for loop     * //
        String str1 = "programming";
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < str1.length(); i++)
        {   
            boolean flag =false;
            char ch = str1.charAt(i);
            for(int j=i+1 ; j<str.length(); j++)
            {
                if (ch==str1.charAt(j))
                {
                    flag =true;
                    break;
                }
            }
            // If character doesn't repeat in the string
            if (!flag) 
            {
                sb1.append(ch);
            }
        }
       System.out.println(sb1);  //poraming



    // *    Approach 03 :- By Using LinkedHashSet     * //
    String str3 = "programming";
    StringBuffer sf =new StringBuffer();
    HashSet lhs =new LinkedHashSet();

    // Unique characters are inserted to LinkedHashSet
    for(int i=0; i<str3.length(); i++)
    {
        lhs.add(str3.charAt(i));
    }

    //Re-storing the characters from lhs->sf
    for (Object object : lhs)
    {
      sf.append(object);  
    }

    System.out.println(sf); //progamin

  }

}
