import java.util.Scanner;

public class WordAbbreviation {
public static void main(String[] args) {

Scanner a = new Scanner(System.in);
    


String word = a.nextLine();
if ( word.matches("[a-zA-Z]+")){

char[] chars = word.toCharArray();
int length = chars.length;
if (length > 10) {
String ans = "" + chars[0] + (length - 2) + chars[length - 1];
System.out.println(ans);
} else { 
System.out.println(word);
}

} 

}

}