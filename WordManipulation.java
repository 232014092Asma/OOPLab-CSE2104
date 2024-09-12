import java.util.Scanner;

public class WordManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        
        
        System.out.println(word);
        
        
        String modifiedWord = word + "==THE END==";
        System.out.println(modifiedWord);
        
        
        System.out.println(word);
    }
}
