import java.util.*;
import java.lang.*;
import java.io.*;
public class CaesarRedux {
    public  String encrypt(String text,int Shift)
    {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<text.length();i++)
        {
            char ch = text.charAt(i);
            
            if(Character.isLetter(ch))
            {
                char first = Character.isUpperCase(ch) ? 'A' : 'a';
               result.append((char) (((ch - first + Shift) % 26) + first));
            }
            else
            {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public  String decrypt(String text,int Shift)
    {
       return encrypt(text,26-Shift);
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;

public class IEEE_EX1 {
    public static void main(String[] args) {
     int number_text;
     Scanner in = new Scanner(System.in);
     number_text=in.nextInt();
     CaesarRedux cr = new CaesarRedux();
     int i=0;
    while(i<number_text){
         if(i%2==0)
         {
             System.out.println("Chat: ");
            String  mes_en=in.nextLine();
             System.out.println("Chat encrypt: "+cr.encrypt(mes_en, 7));
             i++;
         }
         else if(i%2!=0)
         {         
             System.out.println("Chat: ");
            String mes_dyc=in.nextLine();
             System.out.println("Chat Dycript: "+cr.encrypt(mes_dyc, 3));
             i++;
         }
    }
     }
     
    }
    
