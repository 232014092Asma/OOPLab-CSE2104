import java.util.Scanner;

public class SecondMostCommonCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (UPPER-case letters only): ");
        String input = scanner.nextLine();

        char result = findSecondMostCommonCharacter(input);
        System.out.println("Second most common character: " + result);
    }

    public static char findSecondMostCommonCharacter(String str) {
        char secondMostCommon = ' ';
        int maxCount = -1;
        int secondMaxCount = -1;

        
        for (char c = 'A'; c <= 'Z'; c++) {
            int count = countOccurrences(str, c);
            
           
            if (count > maxCount) {
                secondMostCommon = c;
                secondMaxCount = maxCount;
                maxCount = count;
            } else if (count > secondMaxCount && count < maxCount) {
                secondMostCommon = c;
                secondMaxCount = count;
            }
        }

        return secondMostCommon;
    }

    
    private static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
