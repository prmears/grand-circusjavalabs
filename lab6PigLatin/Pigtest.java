package lab6PigLatin;
import java.util.Scanner; 
 
public class Pigtest {

   public static void main(String[] args) {
      Scanner stdin = new Scanner(System.in);
      String original;
      String translated;
      char firstLetter;
      
      System.out.print("enter a word: ");
      original = stdin.next();
      
      //translated = original;
      
      firstLetter = original.charAt(0);
      
      translated = original.substring(1) + firstLetter + "ay";
      
      System.out.println("in pig latin, it's: " + translated);
      
   }
}