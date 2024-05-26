import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ali_Algorithm {
private ArrayList<Character> Cypher = new ArrayList<Character>();
private ArrayList<Character> Count = new ArrayList<Character>();
private char ch;

public void Break_Ali(String text)
{
    Cypher.add('A');
    Cypher.add('B');
    Cypher.add('C');
    Cypher.add('D');
    Cypher.add('E');
    Cypher.add('F');
    Cypher.add('G');
    System.out.println("The char is: "+Read_Text(text));
    
    
}
private char Read_Text(String text)
{
     if (text.length() > 50000) {
                text = text.substring(0, 50000);
            }
     
    for(int i=0;i<text.length();i++)
    {
         ch = text.charAt(i);
        for(int j=0;j<Cypher.size();j++){
        if(ch==Cypher.get(j))
        {
          Count.add(ch);
        }
        }
       
    }
    char p=findMostFrequentCharacter(Count);
Count.clear();
Cypher.clear();
    return p;
}
private static Character findMostFrequentCharacter(ArrayList<Character> characters)
{
    Map<Character, Integer> characterCount = new HashMap<>();
        int maxCount = 0;
        Character mostFrequent = null;

        for (Character c : characters) {
            int count = characterCount.getOrDefault(c, 0) + 1;
            characterCount.put(c, count);

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = c;
            }
        }

        return mostFrequent;
}
}

--------------------------------------------------------------------------------Main------------------------------------------------------------------------------------
import java.util.Scanner;
//IEEExtreme 100/100 points
//Restaurant Cipher
public class iIEEEXtreme {

    public static void main(String[] args) {
Ali_Algorithm al = new Ali_Algorithm();

int numbers=0;
String mes;
Scanner in = new Scanner(System.in);
System.out.println("Write the number of text: ");
numbers = in.nextInt();
in.nextLine();

for(int i=0 ; i<numbers;i++)
{
    System.out.println("Chat: ");
    mes = in.nextLine();
     al.Break_Ali(mes.toUpperCase());
}

    }
    
}
