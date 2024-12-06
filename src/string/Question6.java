
    //*     WAJP to find the occurence of each characters in a string       *//

import java.util.HashMap;
import java.util.Map.Entry;

public class Question6 
{
    public static void main(String[] args)
    {
      String str= "hii";
      HashMap<Character,Integer> map=new HashMap<Character, Integer>();
      for(int i=0; i<str.length(); i++)
      {
            char ch=str.charAt(i);
            if (!map.containsKey(ch))
            {
               map.put(ch, 1); 
            }
            else if (map.containsKey(ch))
            {
                Integer value= (Integer) map.get(ch);
                map.put(ch, value+1);
            }
      }  
      //printing the key-value pair of map
      for (Entry<Character,Integer>  entry : map.entrySet()) 
      {
        System.out.println(entry.getKey()+" -> "+entry.getValue());
      }
    }
}
