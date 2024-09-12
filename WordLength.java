import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        
        int length = word.length();
        System.out.println(word + " " + length);
    }
}
