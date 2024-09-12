import java.util.Scanner;

public class CharacterCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        
        for (int i = 0; i < word.length(); i++) {
            int code = word.codePointAt(i);
            System.out.println(word.charAt(i) + " " + code);
        }
    }
}
