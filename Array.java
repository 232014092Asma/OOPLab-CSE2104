import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " " );
        }
    }
}