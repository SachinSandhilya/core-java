
    // * WAJP to reverse each words of a String *//

import java.util.Scanner;

public class Question5
{
    public static void main(String[] args) 
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a String ");
        String str =scan.nextLine();

        String[] strArray=str.split(" ");
        //Traversing the array by using for-each loop

        StringBuilder sb=new StringBuilder();
        for (String word : strArray) 
        {
            for(int i=word.length()-1; i>=0; i--)
            {
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }

        System.out.println(sb);

    }
}
